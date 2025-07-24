package com.User_Registration_API.User.Registration.API.Controller;

import com.User_Registration_API.User.Registration.API.Entity.User;
import com.User_Registration_API.User.Registration.API.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    @PostMapping
    public User resgister(@RequestBody User user){
        return userRepository.save(user);
    }
    @GetMapping
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
}
