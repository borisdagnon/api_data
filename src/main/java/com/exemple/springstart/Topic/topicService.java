package com.exemple.springstart.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class topicService {

    @Autowired
    private topicRespository topicRespository;


public List<Topic> getAllTopics(){
    //return topics;
    List<Topic> topics = new ArrayList<>();
    topicRespository.findAll().forEach(topics::add);

    return topics;
}



public Topic getTopic(String id){
return topicRespository.findOne(id);
}

public void addTopic(Topic topic){
    //topics.add(topic);
    topicRespository.save(topic);
}

public void updateTopic(String id,Topic topic ){

    /**
     * C'est la même méthode appelé pour l'ajout
     * Spring regarde si il y a déjà un Course avec le même id et le met à jour
     * Si jamais l'indentifiant n'existe pas, il ajoute le Course
     */
   topicRespository.save(topic);
}

public void deleteTopic(String id){

    topicRespository.delete(id);
}

}
