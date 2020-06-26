package mta.service.services;

import java.util.List;
import java.util.Optional;

import mta.service.entity.Role;

public interface RoleService {
	public List<Role> findAll();
	
	public Optional<Role> findById(Long id);
	
	public Role findByRolename(String roleName);
	
	public Role save(Role role);
	
	public Long deleteById(Long roleId);
}
