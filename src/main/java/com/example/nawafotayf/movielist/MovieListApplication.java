package com.example.nawafotayf.movielist;

import com.example.nawafotayf.movielist.entity.Roles;
import com.example.nawafotayf.movielist.entity.Users;
import com.example.nawafotayf.movielist.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDate;

@SpringBootApplication
public class MovieListApplication implements CommandLineRunner{

	@Autowired
	UsersRepository usersRepository;
	public static void main(String[] args) {
		SpringApplication.run(MovieListApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Users adminAccount = usersRepository.findByroles(Roles.ADMIN);
		if(adminAccount == null){
			Users users = new Users();

			users.setUsername("admin");
			users.setDob(LocalDate.ofEpochDay(1998-02-03));
			users.setPassword(new BCryptPasswordEncoder().encode("admin"));
			users.setRoles(Roles.ADMIN);
			usersRepository.save(users);
		}
	}
}
