package mta.service.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mta.service.entity.Role;
import mta.service.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	private RoleRepository roleRepository;
	
	public List<Role> findAll(){
		return (List<Role>) roleRepository.findAll();
	}
	
	public Optional<Role> findById(Long id){
		return roleRepository.findById(id);
	}
	
	public Role findByRolename(String roleName) {
		return (Role) roleRepository.findByRolename(roleName);
	}
	
	public Role save(Role role) {
		return roleRepository.save(role);
	}
	
	public Long deleteById(Long roleId) {
		roleRepository.deleteById(roleId);
		return roleId;
	}
}
