package com.domodel.log.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domodel.log.domain.Login;
import com.domodel.log.repository.LogRepo;

@Service
public class LogService {
    @Autowired
    private LogRepo rep;

    public Login log(String username, String password) {
        Login user = rep.findByUsernameAndPassword(username, password);
        return user;
    }

}
