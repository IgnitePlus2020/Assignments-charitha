package com.ignite.spring.SpringbootCassandraCRUD.repository;

import com.ignite.spring.SpringbootCassandraCRUD.model.Employee;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface EmployeeRepository extends CassandraRepository<Employee, Integer> {
    Employee save(Employee emp);
}
