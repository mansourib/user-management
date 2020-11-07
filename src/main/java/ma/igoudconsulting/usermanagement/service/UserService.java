package ma.igoudconsulting.usermanagement.service;

import java.util.List;
import java.util.Optional;

import ma.igoudconsulting.usermanagement.model.User;

public interface UserService {
	List<User> findByName(String name);

	void save(User user);

	void update(User user);

	Optional<User> findById(Long id);

	void deleteById(Long id);

	List<User> findAll();
}
