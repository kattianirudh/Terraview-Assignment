package com.example.Terraview.controller;

import com.example.Terraview.entities.User;
import com.example.Terraview.service.serviceinterface.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
@RequestMapping(value="/")
public class UsersController {

    final Logger LOG = LoggerFactory.getLogger(UsersController.class);
    @Autowired
    Service service;

    @GetMapping(value = "/users")
    public ResponseEntity<User> getEnabledUsers(@RequestBody User user) throws Exception {
        LOG.info("Reguest has been made");
        LOG.debug("The request body is {}",user);
        if(user!=null && user.getUsers()!=null) {
            return new ResponseEntity<User>(service.fetchEnabledUsers(user), HttpStatus.OK);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
