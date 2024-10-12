package com.timesheet.project.repo;

import com.timesheet.project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}

