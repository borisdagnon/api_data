package com.exemple.springstart.Course;

import com.exemple.springstart.Topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService service;

    @RequestMapping("/topics/{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable String topicId){
        return service.getAllCourses(topicId);
    }

    /**
     * Je passe en paramètre un token grâce aux crochets, le token doit avoir le même nom par default On peut aussi le changer, mais ce n'est pas recommandé
     * Ensuite grâce à l'annotation @PathVariable je précise que le String est en fait le token récupéré
     * J'utlise le Service service pour demander la function getTopic()
     * @param id
     * @return
     */
 @RequestMapping("/topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String id){

return service.getCourse(id);
    }

    /**
     * Je précise dans le RequestMapping qu'il s'agit d'une méthode POST
     * Je précise ensuite que je veux récupérer un objet Course grâce à l'annotation @RequestBody
     *
     * @param course
     */
    @RequestMapping(value = "/topics/{topicId}/courses",method = RequestMethod.POST)
    public void addCourse(@RequestBody Course course, @PathVariable String topicId){
        course.setTopic(new Topic(topicId,"",""));
        service.addCourse(course);
    }

    @RequestMapping(value = "/topics/{topicId}/courses/{id}",method = RequestMethod.PUT)
    public void updateCourse(@RequestBody Course course,@PathVariable String topicId, @PathVariable String id){
       course.setTopic(new Topic(topicId,"",""));
        service.updateCourse(course);
    }

    @RequestMapping(value = "/topics/{topicId}/courses/{id}",method = RequestMethod.DELETE)
    public void deleteCourse(@PathVariable String id){
        service.deleteCourse(id);
    }



}
