package ma.igoudconsulting.usermanagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.igoudconsulting.usermanagement.model.User;

public interface UserDAO extends JpaRepository<User, Long> {

	List<User> findByName(String name);

//	@Override
//	void save(User user);
//
//	void update(User user);
//
//	@Override
//	Optional<User> findById(Long id);
//
//	@Override
//	void deleteById(Long id);
//
////	void delete(User user);
//	@Override
//	List<User> findAll();

}
