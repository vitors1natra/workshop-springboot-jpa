package com.estudos.Curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.Curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

		@GetMapping
		public ResponseEntity<User> findAll() {
			User u = new User(1L, "MAria", "maria@gmail.com", "9999009", "12345");
			return ResponseEntity.ok().body(u);
		}
}
