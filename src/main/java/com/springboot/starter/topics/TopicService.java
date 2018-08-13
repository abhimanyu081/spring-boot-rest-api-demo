package com.springboot.starter.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(

			new Topic("1", "spring", "spring description"), new Topic("2", "hibernate", "hibernate description"),
			new Topic("3", "redis", "redis description"), new Topic("4", "mongo", "mongo description")

	));

	public List<Topic> getAllTopics() {

		return topics;

	}
	
	public Topic getTopic(String id) {
		
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
	}
	
	public void addTopic(Topic topic ) {
		topics.add(topic);
	}
	
	public void updateTopic(String id, Topic topic ) {
		
		for(int i=0;i<topics.size();i++) {
			if(topics.get(i).getId().equals(id)) {
				topics.set(i, topic);
				break;
			}
		}
		
	}

	public void delete(String id) {
		topics.removeIf(t->t.getId().equals(id));
	}

}
