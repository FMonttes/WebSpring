package felipe.webSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import felipe.webSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
