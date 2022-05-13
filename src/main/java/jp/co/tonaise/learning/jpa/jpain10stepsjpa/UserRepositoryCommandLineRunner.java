package jp.co.tonaise.learning.jpa.jpain10stepsjpa;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jp.co.tonaise.learning.jpa.jpain10stepsjpa.entity.User;
import jp.co.tonaise.learning.jpa.jpain10stepsjpa.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... arg0) throws Exception {
	User user = new User("Jack", "Admin");
	// New User is created : User [id=1, name=Jack, role=Admin]
	userRepository.save(user);

	Optional<User> userWithIdOne = userRepository.findById(1L);
	logger.info("New User is created : " + userWithIdOne);
	List<User> users = userRepository.findAll();
	logger.info("All Users:" + users);
    }
}