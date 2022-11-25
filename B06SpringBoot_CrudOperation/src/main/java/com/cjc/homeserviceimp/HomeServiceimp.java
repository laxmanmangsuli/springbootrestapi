package com.cjc.homeserviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeservice.HomeService;
import com.cjc.model.Student;
import com.cjc.repositoryimpl.HomeRepository;
@Service
public class HomeServiceimp implements HomeService {
	@Autowired
	HomeRepository hr;

	@Override
	public void saveAll(Student stu) {
		hr.save(stu);
		
		
	}

	@Override
	public Student loginCheck(String un, String ps) {
		
		return hr.findAllByUnameAndPassword(un,ps);
	}

	@Override
	public Iterable displayAllData() {
		
		
		
		return hr.findAll();
	}

	@Override
	public void deleteData(Student stu) {
		hr.delete(stu);
		
	}

	@Override
	public Student eitdData(int uid) {
		
		return hr.findAllByUid(uid);//Write here in the form of camel
	}

	

}
