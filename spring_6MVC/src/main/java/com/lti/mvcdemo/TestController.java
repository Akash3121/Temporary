package com.lti.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/univ-api")
public class TestController {

	@RequestMapping("/showMsg")
	@ResponseBody
	public String showMsg() {
		return "Welcome to first test Controller";
	}

	@RequestMapping("/welcome")
	@ResponseBody
	public String welcome() {
		return "welcome bro";
	}

	//http://localhost:8282/spring_6MVC/univ-api/helloUser/1002
	@RequestMapping("/helloUser/{pid}")
	@ResponseBody 
	public String helloUser(@PathVariable("pid") int userId) { 
				return "hello user " + userId;}
	
	//http://localhost:8282/spring_6MVC/univ-api/StudentForm
	@RequestMapping("/StudentForm")
	public ModelAndView getForm()
	{
		ModelAndView mv = new ModelAndView("StudentForm");
		return mv;
	}
	
	@RequestMapping("SubmitForm")
	public ModelAndView showForm(@RequestParam("stuName") String sname,@RequestParam("subject") String subject)
	{
		System.out.println(sname + " " + subject);
		String str = sname + " " + subject;
		ModelAndView mv = new ModelAndView("SubmitForm");
		mv.addObject("mydata",str);
		return mv;
	}

}

