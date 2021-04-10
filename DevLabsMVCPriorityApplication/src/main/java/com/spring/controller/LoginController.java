package com.spring.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.Data;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@RequestMapping("/")
	public String handler(Model model)
	
	{
		Data data = new Data();
		data.setMessage("This data will goto FrontEnd");
		data.setUsername("Askhit");
		data.setDateTime(LocalDateTime.now().toString());
		System.out.println("I reached here" +data.getDateTime());
		model.addAttribute("add", data);
		return "add";
	}

}
