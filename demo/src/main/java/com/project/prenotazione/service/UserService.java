package com.project.prenotazione.service;

import com.project.prenotazione.dto.UserDto;
import com.project.prenotazione.model.User;
import com.project.prenotazione.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAllUser(){
         return userRepository.findAll();
    }

    public User saveUser(UserDto userDto){
        User user = new User();
        user.setUser(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        userRepository.save(user);
        return user;
    }
}
