package com.daoInterface;

import org.springframework.data.repository.CrudRepository;

import com.model.Student;

public interface DaoInterface extends CrudRepository<Student,Integer>{

}
