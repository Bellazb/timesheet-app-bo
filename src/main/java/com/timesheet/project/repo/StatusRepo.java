package com.timesheet.project.repo;

import com.timesheet.project.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepo extends JpaRepository<Status, Long> {

}

