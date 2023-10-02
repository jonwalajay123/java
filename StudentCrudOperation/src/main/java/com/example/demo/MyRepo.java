package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MyRepo  extends CrudRepository<Student, Integer>{
	public Student findByName(String name);
	@Query("from Student where fees>?1")
	public List<Student> findByFees(int fees);

}
