package com.example.Terraview.service.serviceinterface;

import com.example.Terraview.entities.User;

public interface Service {
    User fetchEnabledUsers(User user) throws Exception;
    User fetchDisabledUsers(User user) throws Exception;
}
