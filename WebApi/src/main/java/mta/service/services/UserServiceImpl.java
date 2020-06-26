package mta.service.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mta.service.entity.User;
import mta.service.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return (List<User>) userRepository.findAll();
	}

	public Optional<User> findById(Long id) {
		return userRepository.findById(id);
	}

	public User findByUsername(String userName) {
		return userRepository.findByUsername(userName);
	}

	public User save(User user) {
//		String pw = user.getPassword();
//		PasswordEncoder passwordEncode = new BCryptPasswordEncoder();
//		user.setPassword(passwordEncode.encode(pw));
		
		String password = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12));
		user.setPassword(password);
		return userRepository.save(user);
	}

	public Long deleteById(Long userId) {
		User user = userRepository.findById(userId).get();
		userRepository.deleteById(user.getId());
		return userId;
	}

	@Override
	public User updateUser(User user) {
		Optional<User> optional = userRepository.findById(user.getId());
		User obj = null;
		if (optional.isPresent()) {
			obj = optional.get();
			obj.setEnabled(user.getEnabled());
			obj.setFirstName(user.getFirstName());
			obj.setLastName(user.getLastName());
			obj.setUsername(user.getUsername());
			obj.setRoles(user.getRoles());
			if(user.getPassword() != null && !user.getPassword().equals("")) {
				String password = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12));
				obj.setPassword(password);
			}
			userRepository.save(obj);
		}
		
		return obj;
	}

}
