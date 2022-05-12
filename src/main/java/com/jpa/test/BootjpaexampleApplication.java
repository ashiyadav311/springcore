package com.jpa.test;
import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

//	User user1 =new User();
//	user1.setName("Ashi Yadav");
//	user1.setCity("Delhi");
//	user1.setStatus("IAS Officer");

//	User user2  =new User();
//	user2.setName("Ankit Yadav");
//	user2.setCity("Varanasi");
//	user2.setStatus("IFS Officer");
//	List<User> users = List.of(user1,user2);
//	Iterable<User> result = userRepository.saveAll(users);
//	result.forEach(user -> {
//		System.out.println(user);
//	});
//	System.out.println("done");

//	Optional<User> optional = userRepository.findById(4);
//	User user = optional.get();
//	user.setName("Ashi Sharma");
//	userRepository.save(user);
//	User result = userRepository.save(user);
//	System.out.println(result);

//		Iterable<User> itr = userRepository.findAll();
//	Iterator<User> iterator = itr.iterator();
//	while(iterator.hasNext())
//	{
//		User user = iterator.next();
//		System.out.println(user);
//	}
//	}

//	itr.forEach(user -> {
//		System.out.println(user);});

//	userRepository.deleteById(2);

//	Iterable<User> allusers = userRepository.findAll();
//	allusers.forEach(user -> System.out.println(user));
//	userRepository.deleteAll(allusers);
//	List<User> users = userRepository.findByName("Ankit Yadav");
//	users.forEach(e->System.out.println(e));
//	List<User> users = userRepository.findByNameAndCity("Ankit Yadav","Varanasi");
//	users.forEach(e->System.out.println(e));
//	List<User> allUser = userRepository.getAllUser();
//	allUser.forEach(e->System.out.println(e));
	List<User> userByName = userRepository.getUserByName("Ankit Yadav");
	userByName.forEach(e->System.out.println(e));

 	}
	}