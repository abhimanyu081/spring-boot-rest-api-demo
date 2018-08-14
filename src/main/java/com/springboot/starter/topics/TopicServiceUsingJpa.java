package com.springboot.starter.topics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicServiceUsingJpa {


	@Autowired
	TopicRepository topicRep;
	

	public List<Topic> getAllTopics() {

		List<Topic> topics = new ArrayList<>();
		
		topicRep.findAll().forEach(t->topics.add(t));
		return topics;

	}
	
	public Topic getTopic(String id) {
		
		return topicRep.findOne(id);
		
	}
	
	public void addTopic(Topic topic ) {
		topicRep.save(topic);
	}
	
	public void updateTopic(Topic topic ) {
		topicRep.save(topic);
	}

	public void delete(String id) {
		topicRep.delete(id);
	}


}
