package mta.tuanthinh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@GetMapping
	public String Default() {
		return "view/admin/index";
	}
	
	@RequestMapping("/home")
	public String Home() {
		return "view/admin/index";
	}
	
	@RequestMapping("/chat-message")
	public String AccessDeni() {
		return "view/admin/chat-message";
	}
	
	@RequestMapping("/map")
	public String map() {
		return "view/admin/map";
	}
	
	@RequestMapping("/manager-user")
	public String ManagerUser() {
		return "view/admin/manager-user";
	}
	@RequestMapping("/thuoc")
	public String ManagerDrug() {
		return "view/admin/quan-ly-thuoc";
	}
	@RequestMapping("/caching")
	public String Caching() {
		return "view/admin/caching";
	}
}
