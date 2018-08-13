package com.springboot.starter.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(

			new Topic("1", "spring", "spring description"), new Topic("2", "hibernate", "hibernate description"),
			new Topic("3", "redis", "redis description"), new Topic("4", "mongo", "mongo description")

	);

	public List<Topic> getAllTopics() {

		return topics;

	}
	
	public Topic getTopic(String id) {
		
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
	}

}
