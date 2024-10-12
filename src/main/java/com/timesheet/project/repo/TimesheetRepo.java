package com.timesheet.project.repo;

import com.timesheet.project.model.Timesheet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimesheetRepo extends JpaRepository<Timesheet, Long> {
    void deleteTimesheetById(Long id);
}
