package com.cjc.repositoryimpl;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;

@Repository
public interface HomeRepository extends CrudRepository<Student, Integer>{

	public Student findAllByUnameAndPassword(String un, String ps);//Write the method  here in the form of camel


	public Student findAllByUid(int uid);//Write the method  here in the form of camel

	



}
