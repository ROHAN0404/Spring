package productcrudapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import productcrudapp.modelclass.Product;

@Component
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//Create Product
	@Transactional
	public void createProduct(Product product) {
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	//Get all products;
	public List<Product> getAllProducts(){
		return this.hibernateTemplate.loadAll(Product.class);
	}
	
	//Get single product
	public Product getProduct(int productId) {
		return this.hibernateTemplate.get(Product.class, productId);
	}
	
	//Delete the single product
	@Transactional
	public void deleteProduct(int productId) {
		Product p = this.hibernateTemplate.get(Product.class,productId);
		this.hibernateTemplate.delete(p);
	}
	//update the product
	public void updateProduct(Product product) {
		this.hibernateTemplate.update(product);
	}
}
