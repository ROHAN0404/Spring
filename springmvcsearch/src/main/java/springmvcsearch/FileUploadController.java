package springmvcsearch;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	
	@RequestMapping("/form")
	public String showForm()
	{
		return "fileform";
	}
	
	@RequestMapping(value="/uploadimage", method=RequestMethod.POST)
	public String uploadFile(@RequestParam("profile") CommonsMultipartFile file,HttpSession s,Model m)
	{
		System.out.println("File is uploading...");
		System.out.println(file.getSize());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		System.out.println(file.getFileItem());
		System.out.println(file.getBytes());
		System.out.println(file.getContentType());
		
		//get the byte data
		byte[] bs = file.getBytes();
		//we have to save this file on server
		String path = s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"image"+File.separator+file.getOriginalFilename();
		System.out.println(path);
		
		try {
		FileOutputStream fos=new FileOutputStream(path);
		fos.write(bs);fos.close();
		m.addAttribute("filename",file.getOriginalFilename());
		m.addAttribute("msg","Uploaded Successfully");
		}catch(IOException e)
		{
			e.printStackTrace();
			System.out.println("Uploading error");
			m.addAttribute("msg","Uploading Error!!");
		}
		return "filesuccess";
	}
}
