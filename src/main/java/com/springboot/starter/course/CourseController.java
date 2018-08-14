package com.springboot.starter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	
	@Autowired
	CourseServiceUsingJpa courseService;
	
	@RequestMapping("/topic/{topicId}/courses")  //By Default its RequestMethod is GET
	public List<Course> getAllTopics(@PathVariable String topicId) {
		
		return courseService.getAllCourses(topicId);
				
				
	}
	
	@RequestMapping("/topic/{topicId}/courses/{courseId}")  //By Default its RequestMethod is GET
	public Course getCoursById(@PathVariable String topicId, @PathVariable String courseId) {
		
		return courseService.getCourse(courseId);
				
	}
	
	@RequestMapping(value="/topic/{topicId}/courses", method = RequestMethod.POST)  //By Default its RequestMethod is GET
	public void addTopics(@RequestBody Course course) {
		courseService.addCourse(course);		
				
	}
	
	@RequestMapping(value="/topic/{topicId}/courses/{courseId}", method = RequestMethod.PUT)  //By Default its RequestMethod is GET
	public void updateTopic(@RequestBody Course course,
			@PathVariable String id) {
		courseService.addCourse(course);		
				
	}
	
	@RequestMapping(value="/topic/{topicId}/courses/{courseId}", method = RequestMethod.DELETE)  //By Default its RequestMethod is GET
	public void deleteTopic(@PathVariable String id) {
		courseService.delete(id);		
				
	}

}
