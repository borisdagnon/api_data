package com.exemple.springstart.Course;

import com.exemple.springstart.Topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Grâce à cette annotation on dit à Spring que ce Bean est en fait une
 * table de la BDD avec ces éléments identifiants, mdp etc...
 * L'annotation @Entity nous permet de dire celà
 * L'annotation @Id quand à elle nous permet de connaître la clé primaire de la table
 */
@Entity
public class Course {

    @Id
    private String id;
    private String name;
    private String description;

    @ManyToOne
    private Topic topic;

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }




    public Course(){

    }

    public Course(String id, String name, String description, String topicId){
        super();
        this.id=id;
        this.name=name;
        this.description=description;
        this.topic= new Topic(topicId,"","");
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
