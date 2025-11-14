package com.dreinedev.workshopmongo.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import javax.swing.text.html.parser.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dreinedev.workshopmongo.domain.Post;
import com.dreinedev.workshopmongo.domain.User;
import com.dreinedev.workshopmongo.dto.UserDTO;
import com.dreinedev.workshopmongo.repository.PostRepository;
import com.dreinedev.workshopmongo.repository.UserRepository;
import com.dreinedev.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;

	public Post findById(String id) {
		Optional<Post> user = repository.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
