package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
	@RequestMapping("/demo")
	public String home(Model model) {
		System.out.println("This is home url");
		model.addAttribute("name","Rohan  Sardeshmukh");
		
		model.addAttribute("id",55257);
		
		List<String> fri=new ArrayList<String>();
		fri.add("Rohit");
		fri.add("Virat");
		fri.add("Rishabh");
		
		model.addAttribute("f",fri);
		
		return "index";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("name","Rohan Kohli");
		mv.addObject("id",186);
		
		LocalDateTime now=LocalDateTime.now();
		mv.addObject("now1",now);
		
		List<Integer> marks=new ArrayList<Integer>();
		marks.add(92);
		marks.add(83);
		marks.add(78);
		
		mv.addObject("m",marks);
		
		mv.setViewName("help");
		return mv;
	}
}
