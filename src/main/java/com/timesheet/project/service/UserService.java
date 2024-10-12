package com.timesheet.project.service;

import com.timesheet.project.model.User;
import com.timesheet.project.repo.TimesheetRepo;
import com.timesheet.project.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> findAllUser() {
        return userRepo.findAll();
    }
}
