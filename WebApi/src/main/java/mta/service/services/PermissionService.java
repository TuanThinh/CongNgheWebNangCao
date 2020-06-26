package mta.service.services;

import java.util.List;
import java.util.Optional;

import mta.service.entity.Permission;

public interface PermissionService {
	List<Permission> findAll();
	Optional<Permission> findById(Long id);
	Permission save(Permission permission);
	Long deleteById(Long id);
}
