package com.app.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.service.UserService;
import com.app.ultils.Constraints;
import com.app.dto.converter.UserConverter;
import com.app.dto.response.UserResponseType;
import com.app.entity.User;
import com.app.exception.NotFoundEntityException;
import com.app.storage.UserRepository;

@Service
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;
    private UserConverter userConverter;
//    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserConverter userConverter){
        this.userConverter = userConverter;
        this.userRepository = userRepository;
    }

    @Override
    public UserResponseType loadUserByEmail(String email) {
        // TODO Auto-generated method stub
        Optional<User> user= userRepository.loadUser(email);
        if (user.isPresent()){
            return userConverter.convertToDTO(user.get());
            
        }
        throw new NotFoundEntityException(Constraints.VALIDATE_NOT_FOUND);
    }

    @Override
    public UserResponseType save(UserResponseType userResponseType) throws Exception {
        return null;
    }

    @Override
    public UserResponseType update(UserResponseType userResponseType, Integer id) throws Exception {
        return null;
    }

    @Override
    public UserResponseType findById(Integer id) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
