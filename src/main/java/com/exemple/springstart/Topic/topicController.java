package com.exemple.springstart.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class topicController {

    @Autowired
    private topicService service;

    @RequestMapping("/topics")
    public List<Topic> getTopics(){
        return service.getAllTopics();
    }

    /**
     * Je passe en paramètre un token grâce aux crochets, le token doit avoir le même nom par default On peut aussi le changer, mais ce n'est pas recommandé
     * Ensuite grâce à l'annotation @PathVariable je précise que le String est en fait le token récupéré
     * J'utlise le Service service pour demander la function getTopic()
     * @param id
     * @return
     */
 @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){

return service.getTopic(id);
    }

    /**
     * Je précise dans le RequestMapping qu'il s'agit d'une méthode POST
     * Je précise ensuite que je veux récupérer un objet Course grâce à l'annotation @RequestBody
     *
     * @param topic
     */
    @RequestMapping(value = "/topics",method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic){
        service.addTopic(topic);
    }

    @RequestMapping(value = "/topics/{id}",method = RequestMethod.PUT)
    public void updateTopic(@PathVariable String id,@RequestBody Topic topic){
        service.updateTopic(id,topic);
    }

    @RequestMapping(value = "/topics/{id}",method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable String id){
        service.deleteTopic(id);
    }



}
