package com.cjc.homeservice;

import com.cjc.model.Student;

public interface HomeService {

	public void saveAll(Student stu);

	public Student loginCheck(String un, String ps);

	public Iterable displayAllData();

	public void deleteData(Student stu);

	public Student eitdData(int uid);

}
