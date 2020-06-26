//package mta.service.api;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import mta.service.entity.Role;
//import mta.service.entity.User;
//import mta.service.entity.UserRole;
//import mta.service.services.UserRoleService;
//
//@RestController
//@RequestMapping("/api/user_role")
//public class UserRoleApi {
//	@Autowired
//	private UserRoleService userRoleService;
//	
//	@GetMapping(value = "/all",  produces = {MediaType.APPLICATION_JSON_VALUE})
//	public List<UserRole> findAll(){
//		return userRoleService.findAll();
//	}
//	
//	@GetMapping(value = "/id/{id}",  produces = {MediaType.APPLICATION_JSON_VALUE})
//	public Optional<UserRole> findById(@PathVariable("id") Long id){
//		return userRoleService.findById(id);
//	}
//	
//	@GetMapping(value = "/user/{username}",  produces = {MediaType.APPLICATION_JSON_VALUE})
//	public List<User> findByUser(@PathVariable("username") User username){
//		return userRoleService.findByUser(username);
//	}
//	
//	@GetMapping(value = "/role/{rolename}",  produces = {MediaType.APPLICATION_JSON_VALUE})
//	public List<Role> findByRole(@PathVariable("rolename") Role rolename){
//		return userRoleService.findByRole(rolename);
//	}
//	
//	@PostMapping(value = "/add", produces = {MediaType.APPLICATION_JSON_VALUE})
//	public UserRole addUserRole(@RequestBody UserRole userRole) {
//		return userRoleService.save(userRole);
//	}
//	
//	@PutMapping(value = "/edit", produces = {MediaType.APPLICATION_JSON_VALUE})
//	public UserRole updateUserRole(@RequestBody UserRole userRole) {
//		return userRoleService.save(userRole);
//	}
//	
//	@DeleteMapping(value = "/delete/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
//	public Long deleteUserRole(@PathVariable("id") Long id) {
//		userRoleService.deleteById(id);
//		return id;
//	}
//}
