package com.springboot.starter.topics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	
	@Autowired
	TopicService topicService;
	
	@RequestMapping("/topics")  //By Default its RequestMethod is GET
	public List<Topic> getAllTopics() {
		
		return topicService.getAllTopics();
				
				
	}
	
	@RequestMapping("/topics/{id}")  //By Default its RequestMethod is GET
	public Topic getTopic(@PathVariable String id) {
		
		return topicService.getTopic(id);
				
				
	}
	
	@RequestMapping(value="/topics", method = RequestMethod.POST)  //By Default its RequestMethod is GET
	public void addTopics(@RequestBody Topic topic) {
		topicService.addTopic(topic);		
				
	}
	
	@RequestMapping(value="/topics/{id}", method = RequestMethod.PUT)  //By Default its RequestMethod is GET
	public void updateTopic(@RequestBody Topic topic,
			@PathVariable String id) {
		topicService.addTopic(topic);		
				
	}
	
	@RequestMapping(value="/topics/{id}", method = RequestMethod.DELETE)  //By Default its RequestMethod is GET
	public void deleteTopic(@PathVariable String id) {
		topicService.delete(id);		
				
	}

}
