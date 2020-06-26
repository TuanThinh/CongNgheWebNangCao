//package mta.service.services;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import mta.service.entity.Role;
//import mta.service.entity.User;
//import mta.service.entity.UserRole;
//import mta.service.repository.UserRoleRepository;
//
//@Service
//public class UserRoleService {
//	@Autowired
//	private UserRoleRepository userRoleRepository;
//	
//	public List<UserRole> findAll(){
//		return (List<UserRole>) userRoleRepository.findAll();
//	}
//	
//	public Optional<UserRole> findById(Long id){
//		return userRoleRepository.findById(id);
//	}
//	
//	public List<User> findByUser(User user) {
//		return userRoleRepository.findByUser(user);
//	}
//	
//	public List<Role> findByRole(Role role) {
//		return userRoleRepository.findByRole(role);
//	}
//	
//	public UserRole save(UserRole userRole) {
//		return userRoleRepository.save(userRole);
//	}
//	
//	public Long deleteById(Long userRoleId) {
//		userRoleRepository.deleteById(userRoleId);
//		return userRoleId;
//	}
//}
