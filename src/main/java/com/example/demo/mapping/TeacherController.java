package com.example.demo.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TeacherImplement;
import com.example.demo.repository.TeacherRepository;

@RestController
public class TeacherController {

	
	@Autowired
	TeacherRepository teacherRepository;
	@Autowired
	TeacherImplement teacherImplement;
	
	@PostMapping("/saveTeacher")
public TeacherDetails addBook(@RequestBody TeacherDetails teacher) {
        this.teacherImplement.addteacherDetails(teacher);
        return teacher;
    }
	}
