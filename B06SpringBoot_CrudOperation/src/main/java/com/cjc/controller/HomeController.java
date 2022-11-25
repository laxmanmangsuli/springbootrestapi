package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.homeservice.HomeService;
import com.cjc.model.Student;

@RestController
public class HomeController {
	@Autowired
	HomeService hs;

	@GetMapping(value = "/getStudent")
	public Iterable Prelogin() {
		Iterable list = hs.displayAllData();

		return list;

	}

	@PostMapping(value = "/registration")
	public String Preregister(@RequestBody Student stu) {
		hs.saveAll(stu);

		return "registered";

	}

	@DeleteMapping(value = "/delete/{uid}")
	public String deleteData(@PathVariable("uid") int uid, Student stu, Model m) {

		hs.deleteData(stu);
		Iterable list = hs.displayAllData();
		m.addAttribute("data", list);
		return "Deleted";

	}

	@GetMapping(value = "/edit/{uid}")
	public Student editData(@PathVariable("uid") int uid) {

		Student s = hs.eitdData(uid);

		return s;

	}

	@PutMapping(value = "/update/{uid}")
	public String editData(@PathVariable("uid") int uid, @RequestBody Student stu) {

		Student s = hs.eitdData(uid);
		hs.saveAll(stu);
//	m.addAttribute("data", s);
		return "edit";

	}

	@PatchMapping(value = "/patchs/{uid}")
	public String patch(@PathVariable("uid") int uid, @RequestBody Student stu) {

		Student s = hs.eitdData(uid);
		hs.saveAll(stu);
//	m.addAttribute("data", s);
		return "edit";

	}

}
