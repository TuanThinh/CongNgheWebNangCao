package mta.service.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mta.service.entity.User;
import mta.service.services.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api/user")
public class UserApi {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/all", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<User> geList() {
		return (List<User>) userService.findAll();
	}

	@GetMapping(value = "/id/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Optional<User> getUserById(@PathVariable Long id) {
		return userService.findById(id);
	}

	@GetMapping(value = "/username/{username}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public User getUserByUsername(@PathVariable String username) {
		return userService.findByUsername(username);
	}

	@PostMapping(value = "/add", produces = { MediaType.APPLICATION_JSON_VALUE })
	public User addUser(@RequestBody User user) {
		return userService.save(user);
	}

	@PutMapping(value = "/edit", produces = { MediaType.APPLICATION_JSON_VALUE })
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}

	@DeleteMapping(value = "/delete/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Long deleteUser(@PathVariable Long id) {
		return userService.deleteById(id);
	}
}
