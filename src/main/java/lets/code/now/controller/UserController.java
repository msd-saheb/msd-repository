package lets.code.now.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lets.code.now.models.Person;
import lets.code.now.repository.PersonRepository;
import lets.code.now.repository.UserRepository;


@RestController
public class UserController {
	
	@Autowired
	private UserRepository repos;
	
	@Autowired
	private PersonRepository personrepos;

	@GetMapping("/getDemo")
	public String getDemo() {
		return "Welcome to OAuth Poc";
	}
	
	@GetMapping("/savePerson")
	public ResponseEntity<Person> createPerson() {
		Person p = new Person();
		p.setName("sutto");
		p.setPassword("1234");
		personrepos.save(p);
	   return ResponseEntity.ok().body(p);
   }
	
	@PostMapping("/login")
	public String login(@RequestBody Person p) {
		Person existingPerson = personrepos.findByName(p.getName());
		if(existingPerson.getPassword().equalsIgnoreCase(p.getPassword()))
			return "Login Successfully";
	        return "User is not Valid";
}
}
