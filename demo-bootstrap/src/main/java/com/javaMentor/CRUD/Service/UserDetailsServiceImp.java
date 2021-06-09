package com.javaMentor.CRUD.Service;

import com.javaMentor.CRUD.model.Role;
import com.javaMentor.CRUD.model.User;
import com.javaMentor.CRUD.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImp implements UserDetailsService {
    private final UserRepository userRepository;

    public UserDetailsServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        if (login.equals("ADMIN")) {
            User user = new User("ADMIN", "ADMIN", "adm", "adm");
            user.addRole(new Role(2, "ADMIN"));
            if (userRepository.findByLogin("ADMIN") == null) {
                userRepository.save(user);
            }
            return user;
        }
        return userRepository.findByLogin(login);
    }
}
