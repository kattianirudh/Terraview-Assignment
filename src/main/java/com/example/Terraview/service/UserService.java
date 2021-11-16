package com.example.Terraview.service;

import com.example.Terraview.controller.UsersController;
import com.example.Terraview.entities.User;
import com.example.Terraview.entities.UserDTO;
import com.example.Terraview.service.serviceinterface.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class UserService implements Service {

    final Logger LOG = LoggerFactory.getLogger(UserService.class);
    @Override
    public User fetchEnabledUsers(User user) throws Exception {
        LOG.info("Enabled Users fetching initiated");
        Optional<List<UserDTO>> enabledUsers = Optional.of(user.getUsers().stream().filter(u -> u.getTags().contains("enabled")).collect(Collectors.toList()));
        if(enabledUsers.isPresent()) {
            User enabledUser = new User(enabledUsers.get());
            LOG.info("Fetch was successful");
            return enabledUser;
        } else {
            LOG.error("Fetch was unsuccessful");
            throw new Exception("User with tag enabled was not found");
        }
    }

    @Override
    public User fetchDisabledUsers(User user) throws Exception {
        LOG.info("Disabled Users fetching initiated");
        Optional<List<UserDTO>> enabledUsers = Optional.of(user.getUsers().stream().filter(u -> u.getTags().contains("disabled")).collect(Collectors.toList()));
        if(enabledUsers.isPresent()) {
            User disabledUser = new User(enabledUsers.get());
            LOG.info("Fetch was successful");
            return disabledUser;
        } else {
            LOG.error("Fetch was unsuccessful");
            throw new Exception("User with tag disabled was not found");
        }
    }
}
