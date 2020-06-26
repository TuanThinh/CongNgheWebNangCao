package mta.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mta.service.entity.Permission;

public interface PermissionRepository extends JpaRepository<Permission, Long>{

}
