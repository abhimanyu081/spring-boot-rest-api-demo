package com.springboot.starter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceUsingJpa {


	@Autowired
	CourseRepository courseRepository;
	

	public List<Course> getAllCourses(String topicId) {
		
		return courseRepository.findByTopicId(topicId);
		

	}
	
	public Course getCourse(String id) {
		
		return courseRepository.findOne(id);
		
	}
	
	public void addCourse(Course Course ) {
		courseRepository.save(Course);
	}
	
	public void updateCourse(Course Course ) {
		courseRepository.save(Course);
	}

	public void delete(String id) {
		courseRepository.delete(id);
	}


}
