package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyexceptionHandler {

	
	@ResponseStatus(value=HttpStatus.BAD_GATEWAY)
	@ExceptionHandler(value=Exception.class)
	public String exceptionHandler(Model m)
	{
		m.addAttribute("msg","NullPointerException");
		return "null_page";
	}
	
}
