package mta.tuanthinh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/")
public class PublicController {
	
	@RequestMapping("/")
	public String index() {
		return "view/public/index";
	}
	@RequestMapping("/about")
	public String about() {
		return "view/public/about";
	}
	@RequestMapping("/services")
	public String services() {
		return "view/public/services";
	}
	@RequestMapping("/news")
	public String news() {
		return "view/public/news";
	}
	@RequestMapping("/contact")
	public String contact() {
		return "view/public/contact";
	}
	
	@RequestMapping("/login")
	public String Login() {
		return "view/login";
	}

	@RequestMapping("/403")
	public String AccessDeny() {
		return "403";
	}
}
