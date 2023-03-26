package dev.dex.employee_directory.dao;

import dev.dex.employee_directory.entity.*;
import org.springframework.data.jpa.repository.*;

// @RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // no need to write code, spring will provide implementation
}
