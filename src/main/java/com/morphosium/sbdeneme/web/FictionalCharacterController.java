package com.morphosium.sbdeneme.web;

import com.morphosium.sbdeneme.model.Animation;
import com.morphosium.sbdeneme.service.FictionalEntitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
public class FictionalCharacterController {

  @Autowired
  private FictionalEntitiesService fictionalEntitiesService;

  @RequestMapping("/wa")
  @ResponseBody
  public String welcome() {
    return "<img src='https://i.pinimg.com/originals/93/60/d7/9360d7c105afd16618a89ea02f61d63b.jpg'/>";
  }
  //ANIMATIONS
  @RequestMapping(method = RequestMethod.GET, value = "/animations")
  public ResponseEntity<List<Animation>> animations() {
    try
    {
        List<Animation> animations = fictionalEntitiesService.findAnimations();
        return ResponseEntity.ok(animations);
    }
    catch (Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }

  //ANIMATION
  @RequestMapping(method = RequestMethod.POST, value = "/animation")
  public ResponseEntity<Animation> addAnimation(@RequestBody Animation animation) {
    try {
      final Animation animNew = fictionalEntitiesService.createAnimation(animation);
      return ResponseEntity.ok(animNew);
    }
    catch (Exception ex) {
      return ResponseEntity.status(500).build();
    }
  }
}
