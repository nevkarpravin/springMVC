package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
@RequestMapping(value = "/search", method = RequestMethod.GET)
public String display()
{
	System.out.println("Inside Hello Controller");
		return "index";
}

@GetMapping("/home/{user}")
public String displayHome(@PathVariable String user, @RequestParam String name)
{
	
	System.out.println("User is " + user + " name is " + name);
System.out.println("Inside home method");
	return "home";
}

@PostMapping("/home")
public String displayHomePost(@RequestBody User user)
{
	
		System.out.println("User is " + user.toString() );
		System.out.println("Inside home method");
	return "home";
}
}
