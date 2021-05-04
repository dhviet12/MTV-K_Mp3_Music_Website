package com.example.demo.service.user;
import com.example.demo.model.user.User;
import com.example.demo.model.user.UserPrinciple;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.security.Principal;
import java.util.Optional;


@Service
public class UserService implements IUserService, UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;
    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return UserPrinciple.build(user);
    }
    @Override
    public User save(User user) {
       return userRepository.save(user);
    }
    @Override
    public User findById(Long id) {
        return userRepository.findUserById(id);
    }
    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }
    @Override
    public void remove(Long id) {
        userRepository.deleteById(id);
    }
    @Override
    public boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }

    @Override
    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    @Override
    public User findUserByUserName(String username) {
        return userRepository.findByUsername(username);
    }


    public User getCurrentUser() {
        User user;
        String userName;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            userName = ((UserDetails) principal).getUsername();
        } else {
            userName = principal.toString();
        }
        user = this.findUserByUserName(userName);
        return user;
    }


}
