package com.exemple.springstart.Topic;

import org.springframework.data.repository.CrudRepository;

/**
 * Le CrudRepository permet de faire des opérations basiques
 * tels que:
 * Create, Read, Update, Delete
 * Il suffit de dire que cette interface est une extension de CrudRepository
 * Au préalable il faut préciser que le Bean est une table de la BDD
 */
public interface topicRespository extends CrudRepository<Topic, String>{


}
