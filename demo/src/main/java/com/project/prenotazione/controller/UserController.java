package com.project.prenotazione.controller;

import com.project.prenotazione.dto.UserDto;
import com.project.prenotazione.model.User;
import com.project.prenotazione.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> userslist = service.getAllUser();
        return ResponseEntity.ok(userslist);
    }

    @PostMapping("/user")
    public ResponseEntity<User> postUser(@RequestBody UserDto userDto){
        User user = service.saveUser(userDto);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getSingleUsers(@RequestParam Long id){
        User user = service.getSingleUser(id);
        return ResponseEntity.ok(user);
    }
}
