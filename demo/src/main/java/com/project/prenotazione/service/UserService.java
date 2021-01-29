package com.project.prenotazione.service;

import com.project.prenotazione.dto.UserDto;
import com.project.prenotazione.exception.UserException;
import com.project.prenotazione.model.User;
import com.project.prenotazione.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAllUser(){
         return userRepository.findAll();
    }

    public User getSingleUser(Long id){
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() ->  new UserException("The user with id: "+ id + " not found"));
    }

    public User saveUser(UserDto userDto){
        User user = new User();
        user.setUser(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        userRepository.save(user);
        return user;
    }
}
