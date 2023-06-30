package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService service;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("fill","Fill this form");
		m.addAttribute("desc","Home for Programmer");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m)
	{
		return "contact";
	}
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model)
	{	
		System.out.println("controller");
		int id = this.service.createUser(user);
		if(user.getUsername().isBlank())
		{
			return "redirect:/contact";
		}
		model.addAttribute("msg","Successfully registered " + id);
		return "success";
	}
}



 /*	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@RequestParam("useremail") String email,
							@RequestParam("username") String name,
							@RequestParam("password") String pass,Model model)
	{
		User user=new User();
		user.setUseremail(email);
		user.setUsername(name);
		user.setPassword(pass);
		
		System.out.println(user);
		//Process
//		model.addAttribute("na",name);
//		model.addAttribute("em",email);
//		model.addAttribute("pa",pass);
		
		model.addAttribute("user",user);
		return "success";
	} */
