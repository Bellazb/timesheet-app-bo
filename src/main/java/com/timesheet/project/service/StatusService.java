package com.timesheet.project.service;

import com.timesheet.project.model.Status;
import com.timesheet.project.repo.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService {
    private final StatusRepo statusRepo;

    @Autowired
    public StatusService(StatusRepo statusRepo) {
        this.statusRepo = statusRepo;
    }

    public List<Status> findAllStatus() {
        return statusRepo.findAll();
    }
}