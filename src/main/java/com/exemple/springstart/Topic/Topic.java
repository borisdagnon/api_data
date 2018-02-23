package com.exemple.springstart.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Grâce à cette annotation on dit à Spring que ce Bean est en fait une
 * table de la BDD avec ces éléments identifiants, mdp etc...
 * L'annotation @Entity nous permet de dire celà
 * L'annotation @Id quand à elle nous permet de connaître la clé primaire de la table
 */
@Entity
public class Topic {

    @Id
    private String id;
    private String name;
    private String description;




    public Topic(){

    }

    public Topic(String id, String name, String description){
        super();
        this.id=id;
        this.name=name;
        this.description=description;
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
