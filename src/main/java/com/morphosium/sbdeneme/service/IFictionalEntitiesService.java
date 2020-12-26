package com.morphosium.sbdeneme.service;

import com.morphosium.sbdeneme.exception.AnimationNotFoundException;
import com.morphosium.sbdeneme.model.Animation;
import com.morphosium.sbdeneme.model.Character;

import java.util.List;

public interface IFictionalEntitiesService {
  List<Animation> findAnimations();
  Animation findAnimation(Long id) throws AnimationNotFoundException;
  Animation findAnimationByCharacter(Character character) throws  AnimationNotFoundException;
  Animation createAnimation(Animation animation);
  Animation updateAnimation(Animation animation);
  void deleteAnimation(Long id);
}

