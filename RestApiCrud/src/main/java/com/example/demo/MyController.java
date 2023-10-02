package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController {
@Autowired
MyRepo repo;
@GetMapping("/student")
public List<Student> showAll()
{
	return repo.findAll();
}

@GetMapping("/student/{id}")
 public Optional<Student> search(@PathVariable("id") int id)
 {
	 return repo.findById(id);
 }

@PostMapping("/student")
public Student addStudent(@RequestBody Student s)
{
	 return repo.save(s);
}

@DeleteMapping("/student/{id}")
public String deleteStudent(@PathVariable("id") int id)
{
	Optional<Student> e=repo.findById(id);
	if(e==null )
	{
		return "not deleted";
	}
	else
	{
		repo.deleteById(id);
		return "deleted";
	}
}

@PutMapping("/student/{id}/")
public Student updateStudent(@PathVariable("id") int id,@RequestBody Student s )
{
	Optional<Student> e1=repo.findById(id);
	if(e1==null )
	{
		return new Student();
	}
	else
	{
		s.setId(id);
		return repo.save(s);
	}
}
}








