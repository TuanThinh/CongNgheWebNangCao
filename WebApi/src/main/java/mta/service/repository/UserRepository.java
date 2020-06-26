package mta.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mta.service.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
	
//	@Query(value="update User u set username = ?1, enabled = ?2, roles = ?3 where u.id = ?4")
//	void updateUserWithoutPassword(String username, Boolean enabled, List<Role> roles, Long id);
}
