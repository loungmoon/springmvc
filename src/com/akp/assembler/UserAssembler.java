package com.akp.assembler;

import com.akp.dto.UserDto;
import com.akp.model.User;


public class UserAssembler {

    public User showUser(UserDto dto){
        User user = new User();
        user.setId(dto.getId());
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setAddress(dto.getAddress());
        return user;
    }

    public UserDto showUserDao(User user){
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        dto.setAddress(user.getAddress());
        return dto;
    }

}
