package com.timesheet.project.controller;

import com.timesheet.project.model.Timesheet;
import com.timesheet.project.service.TimesheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/timesheets")
public class TimesheetResource {
    private final TimesheetService timesheetService;

    @Autowired
    public TimesheetResource(TimesheetService timesheetService) {
        this.timesheetService = timesheetService;
    }

//    @GetMapping
//    public

    @GetMapping("/all")
    public ResponseEntity<List<Timesheet>> getAllEmployees() {
        List<Timesheet> timesheets = timesheetService.findAllTimesheet();
        return new ResponseEntity<>(timesheets, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Timesheet> createTimesheet(@RequestBody Timesheet timesheet) {
        Timesheet newTimesheet = timesheetService.createTimesheet(timesheet);
        return new ResponseEntity<>(newTimesheet, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Timesheet> updateTimesheet(@RequestBody Timesheet timesheet) {
        Timesheet updateTimesheet = timesheetService.updateTimesheet(timesheet);
        return new ResponseEntity<>(updateTimesheet, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteTimesheet(@PathVariable("id") Long id) {
       timesheetService.deleteTimesheet(id);
       return new ResponseEntity<>(HttpStatus.OK);
    }

}
