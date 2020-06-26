package mta.service.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mta.service.entity.Permission;
import mta.service.repository.PermissionRepository;

@Service
public class PermissionServiceImpl implements PermissionService{

	@Autowired
	PermissionRepository permissionRepository;
	@Override
	public List<Permission> findAll() {
		return permissionRepository.findAll();
	}

	@Override
	public Optional<Permission> findById(Long id) {
		return permissionRepository.findById(id);
	}

	@Override
	public Permission save(Permission permission) {
		return permissionRepository.save(permission);
	}

	@Override
	public Long deleteById(Long id) {
		permissionRepository.deleteById(id);
		return id;
	}
	
}
