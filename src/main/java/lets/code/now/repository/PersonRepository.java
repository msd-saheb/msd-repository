package lets.code.now.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lets.code.now.models.Person;


public interface PersonRepository extends JpaRepository<Person, Integer> {
	
	Person findByName(String name);

}
