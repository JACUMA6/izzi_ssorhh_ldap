package com.batch.service;

import com.batch.entities.Empleados;
import com.batch.persistence.IPersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private IPersonDAO personDAO;

    @Override
    public void save(Empleados person) {
        personDAO.save(person);
    }

    @Override
    @Transactional
    public void saveAll(List<Empleados> personList) {
        personDAO.saveAll(personList);
    }
}
