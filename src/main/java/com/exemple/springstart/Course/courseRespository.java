package com.exemple.springstart.Course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Le CrudRepository permet de faire des opérations basiques
 * tels que:
 * Create, Read, Update, Delete
 * Il suffit de dire que cette interface est une extension de CrudRepository
 * Au préalable il faut préciser que le Bean est une table de la BDD
 */
public interface courseRespository extends CrudRepository<Course, String>{

 List<Course> findByTopicId(String topicId);
}
