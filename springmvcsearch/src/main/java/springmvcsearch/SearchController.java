package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/user/{id}/{name}")
	public String getuser(@PathVariable("id") int id,@PathVariable("name") String name)
	{
		System.out.println(id);
		String s=null;
		System.out.println(s.length());
		return "home";
	}
	@RequestMapping("/home")
	public String home()
	{
		String s=null;
		System.out.println(s.length());
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query)
	{
		String url="https://www.google.com/search?q="+query;
		
		RedirectView view = new RedirectView();
		view.setUrl(url);
		
		if(query.isBlank()) {
			view.setUrl("home");
			return view;
		}
		return view;
	}

	
	
}
