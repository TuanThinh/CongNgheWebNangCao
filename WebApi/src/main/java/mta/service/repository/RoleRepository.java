package mta.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mta.service.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	List<Role> findByRolename (String rolename);
}
