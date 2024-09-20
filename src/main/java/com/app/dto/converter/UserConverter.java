package com.app.dto.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.dto.response.UserResponseType;
import com.app.entity.User;

@Component
public class UserConverter {
    private ModelMapper modelMapper = new ModelMapper();

    public UserResponseType convertToDTO(User user){
        UserResponseType response = new UserResponseType();
        response.setEmail(user.getEmail());
        return response;
    }

    public User convertToEntity(UserResponseType responseType){
        return modelMapper.map(responseType, User.class);
    }
}
