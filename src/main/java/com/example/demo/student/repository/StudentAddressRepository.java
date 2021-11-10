package com.example.demo.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.student.entity.StudentAddress;

@Repository
public interface StudentAddressRepository extends JpaRepository<StudentAddress,Integer> {
	List<StudentAddress> findBystudentId(int studentId);
	List<StudentAddress> findByCityName(String cityName);
	List<StudentAddress> findByStateName(String stateName);

}
