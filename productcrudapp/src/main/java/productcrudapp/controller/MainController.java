package productcrudapp.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productcrudapp.dao.ProductDao;
import productcrudapp.modelclass.Product;

@Controller
public class MainController {
	
	@Autowired
	private ProductDao dao;
	
	
	@RequestMapping("/")
	public String home(Model m) {
		List<Product> products = dao.getAllProducts();
		for(Product p:products) {
			System.out.println(p);
		}
		m.addAttribute("product",products);
		return "index";
	}
	//Show add product form
	@RequestMapping("/add-product")
	public String addProduct(Model m) {
		m.addAttribute("title","Add Product");
		return "add_product_form";
	}
	//handle add product form
	@RequestMapping(value="/handle-product",method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product,HttpServletRequest request) {
		dao.createProduct(product);
		RedirectView view = new RedirectView();
		view.setUrl(request.getContextPath() + "/");
		System.out.println(product);
		return view;
	}
	
	//delete handler
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId,HttpServletRequest request) {
		dao.deleteProduct(productId);
		RedirectView view = new RedirectView();
		view.setUrl(request.getContextPath() + "/");
		
		return view;
	}
	//update handler
	@RequestMapping("/update/{productId}")
	public String updateProduct(@PathVariable("productId") int productId,HttpServletRequest request,Model m) {
		
		Product product = dao.getProduct(productId);
		m.addAttribute("product",product);
		return "update_form";
	}
}
