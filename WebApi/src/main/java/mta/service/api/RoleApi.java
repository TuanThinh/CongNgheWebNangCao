package mta.service.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mta.service.entity.Role;
import mta.service.services.RoleService;

@RestController
@RequestMapping("/api/role")
public class RoleApi {
	@Autowired
	private RoleService roleService;
	
	@GetMapping(value = "/all", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Role> findAll(){
		return (List<Role>) roleService.findAll();
	}
	
	@GetMapping(value = "/id/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Optional<Role> findById(@PathVariable("id") Long id){
		return roleService.findById(id);
	}
	
	@GetMapping(value = "/name/{rolename}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Role findByRolename(@PathVariable("rolename") String rolename) {
		return roleService.findByRolename(rolename);
	}
	
	@PostMapping(value = "/add", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Role save(@RequestBody Role role) {
		return roleService.save(role);
	}
	
	@PutMapping(value = "/edit", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Role updateRole(@RequestBody Role role) {
		return roleService.save(role);
	}
	
	@DeleteMapping(value = "/delete/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Long deleteById(@PathVariable("id") Long id) {
		roleService.deleteById(id);
		return id;
	}
}
