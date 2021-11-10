package com.example.demo.student.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.bean.StudentlibraryBean;
import com.example.demo.student.entity.Student;
import com.example.demo.student.repository.StudentLibraryRepository;
import com.example.demo.student.repository.StudentRepository;


@Transactional
@Service
public class StudentLibraryImplement implements  StudentLibraryService {
	
	@Autowired
	StudentLibraryRepository studentLibraryRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Map<String, Object> addStudentlibrary(StudentlibraryBean studenlibraryBean) {
		// TODO Auto-generated method stub
		Map<String,Object> response=new HashMap<String,Object>();
		response.put("method_Name","SAVE LIBRARY STUDENT");
		response.put("respose", "");
		  
		Student studentObj=studentRepository.findOne(studenlibraryBean.getStudentId());
		if(studentObj != null){
			StudentLibrary studentLibraryObj=new StudentLibrary();
			studentLibraryObj.setBookName(studenlibraryBean.getBookName());
			studentLibraryObj.setBookAuthorName(studenlibraryBean.getBookAuthorName());
			studentLibraryObj.setBookPrice(studenlibraryBean.getBookPrice());
			studentLibraryObj.setStudentId(studentObj.getId());
			
			StudentLibrary studentLibraryRtrn=studentLibraryRepository.save(studentLibraryObj);
			
			
			//return Libray values
		    Map<String,Object> studentLibraryParams=new HashMap<String,Object>();
		    studentLibraryParams.put("Book_name",studentLibraryRtrn.getBookName());
		    studentLibraryParams.put("Author_name",studentLibraryRtrn.getBookAuthorName());
		    studentLibraryParams.put("Book_price",studentLibraryRtrn.getBookPrice());
		    studentLibraryParams.put("BookId",studentLibraryRtrn.getBookId());
		    studentLibraryParams.put("student_id",studentLibraryRtrn.getStudentId());
		    
		    response.put("response_code", "0");
		     response.put("response_message", "Success");
		     
		     response.put("response",studentLibraryParams );
		     return response;
		}
		else{
			response.put("response_code","1");
			response.put("response_message","studentId not exist");
			return response;
		}
		
	}

}
