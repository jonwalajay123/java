package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@Autowired
	MyRepo repo;
	@RequestMapping("/student")
	public String show()
	{
		//System.out.println("show is running");
		return "first";
	}
	
	
	@RequestMapping("/addstudent")
	public String addStudent(Student s, Model m )
	{
		repo.save(s);
		return "student";
	}
	
	@RequestMapping("/updatestudent")
	public String updateStudent(Student s, Model m )
	{
		repo.save(s);
		List<Student> al=(List<Student>) repo.findAll();
		m.addAttribute("data", al);
		return "show";
	}
	
	@RequestMapping("/show")
	public String showStudends(Model m )
	{
		List<Student> al=(List<Student>) repo.findAll();
		m.addAttribute("data", al);
		return "show";
	}
	
	@RequestMapping("/search")
	public String searchStudent(@RequestParam("id") int id, Model m )
	{
		Student s=repo.findById(id).orElse(new Student());
		m.addAttribute("s", s);
		return "showbysearch";
	}
	
	@RequestMapping("/searchname")
	public String searchStudent(@RequestParam("name") String name, Model m )
	{
		Student s=repo.findByName(name);
		m.addAttribute("s", s);
		return "showbysearch";
	}
	
	@RequestMapping("/searchfees")
	public String showStudentfees(@RequestParam("fees") int fees, Model m )
	{
		List<Student> al=repo.findByFees(fees);
		m.addAttribute("data", al);
		return "show";
	}
	
	@RequestMapping("/delete")
	public String deleteStudents(@RequestParam("id") int id,Model m )
	{
		Student s=repo.findById(id).orElse(new Student());
		repo.delete(s);
		List<Student> al=(List<Student>) repo.findAll();
		m.addAttribute("data", al);
		return "show";
	}
}
