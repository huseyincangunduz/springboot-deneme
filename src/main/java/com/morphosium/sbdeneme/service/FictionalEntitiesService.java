package com.morphosium.sbdeneme.service;

import com.morphosium.sbdeneme.exception.AnimationNotFoundException;
import com.morphosium.sbdeneme.model.Animation;

import java.util.List;

public interface FictionalEntitiesService {
  List<Animation> findAnimations();
  List<Animation> findAnimationsByCharacter(Character character);
  Animation findAnimation(Long id) throws AnimationNotFoundException;
  void createAnimation(Animation animation);
  Animation updateAnimation(Animation animation);
  void deleteAnimation(Long id);
}
