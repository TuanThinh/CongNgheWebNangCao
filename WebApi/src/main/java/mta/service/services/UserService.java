package mta.service.services;

import java.util.List;
import java.util.Optional;

import mta.service.entity.User;

public interface UserService {

	public List<User> findAll();

	public Optional<User> findById(Long id);

	public User findByUsername(String userName);

	public User save(User user);
	
	public User updateUser(User user);

	public Long deleteById(Long userId);
}
