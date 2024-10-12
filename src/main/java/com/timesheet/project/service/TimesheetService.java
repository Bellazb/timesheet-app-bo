package com.timesheet.project.service;

import com.timesheet.project.model.Timesheet;
import com.timesheet.project.repo.TimesheetRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TimesheetService {
    private final TimesheetRepo timesheetRepo;

    @Autowired
    public TimesheetService(TimesheetRepo timesheetRepo) {
        this.timesheetRepo = timesheetRepo;
    }

    public Timesheet createTimesheet(Timesheet timesheet) {
         return timesheetRepo.save(timesheet);
    }

    public List<Timesheet> findAllTimesheet() {
         return timesheetRepo.findAll();
    }

    public Timesheet updateTimesheet(Timesheet timesheet) {
        return timesheetRepo.save(timesheet);
    }

    public void deleteTimesheet(Long id) {
        timesheetRepo.deleteTimesheetById(id);
    }




}
