package com.batch.service;

import com.batch.entities.Empleados;

import java.util.List;

public interface IPersonService {

    void save(Empleados person);

    void saveAll(List<Empleados> personList);
}
