package com.timesheet.project.controller;

import com.timesheet.project.model.Status;
import com.timesheet.project.model.User;
import com.timesheet.project.service.StatusService;
import com.timesheet.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/status")
public class StatusResource {
    private final StatusService statusService;

    @Autowired
    public StatusResource(StatusService statusService) {
        this.statusService = statusService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Status>> getAllStatus() {
        List<Status> status = statusService.findAllStatus();
        return new ResponseEntity<>(status, HttpStatus.OK);
    }
}
