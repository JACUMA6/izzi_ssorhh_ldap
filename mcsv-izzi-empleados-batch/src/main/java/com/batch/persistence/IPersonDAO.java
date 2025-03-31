package com.batch.persistence;

import com.batch.entities.Empleados;
import org.springframework.data.repository.CrudRepository;

public interface IPersonDAO extends CrudRepository<Empleados, Long> {
}
