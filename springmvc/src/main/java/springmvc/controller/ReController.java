package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	@RequestMapping("/one")
	public RedirectView one()
	{
		RedirectView r=new RedirectView();
		r.setUrl("https://www.google.com");
		System.out.println("this is one handler");
		return r;
	}
	
	@RequestMapping("/two")
	public void two()
	{
		System.out.println("this is two handler");
	
	}
	
}
