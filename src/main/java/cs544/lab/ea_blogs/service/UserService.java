package cs544.lab.ea_blogs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cs544.lab.ea_blogs.model.User;
import cs544.lab.ea_blogs.repository.UserRepository;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findByUsername(String userName) {
		return userRepository.findByUsername(userName);
	}
}
