package lets.code.now.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lets.code.now.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
