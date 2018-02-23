package com.exemple.springstart.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private courseRespository courseRespository;


public List<Course> getAllCourses(String topicId){

    List<Course> courses = new ArrayList<>();
    courseRespository.findByTopicId(topicId).forEach(courses::add);
    return courses;
}



public Course getCourse(String id){
return courseRespository.findOne(id);
}

public void addCourse(Course course){

    courseRespository.save(course);
}

public void updateCourse(Course topic ){

    /**
     * C'est la même méthode appelé pour l'ajout
     * Spring regarde si il y a déjà un Course avec le même id et le met à jour
     * Si jamais l'indentifiant n'existe pas, il ajoute le Course
     */
    courseRespository.save(topic);
}

public void deleteCourse(String id){

    courseRespository.delete(id);
}

}
