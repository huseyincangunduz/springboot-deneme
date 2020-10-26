package com.morphosium.sbdeneme.service;

import com.morphosium.sbdeneme.dao.AnimationRepository;
import com.morphosium.sbdeneme.exception.AnimationNotFoundException;
import com.morphosium.sbdeneme.model.Animation;
import com.morphosium.sbdeneme.model.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class FictionalEntitiesService implements  IFictionalEntitiesService {

  private AnimationRepository animationRepository;


  @Autowired
  public void setAnimationRepository(AnimationRepository animationRepository) {
    this.animationRepository = animationRepository;
  }

  public AnimationRepository getAnimationRepository() {
    return animationRepository;
  }

  @Override
  public List<Animation> findAnimations() {
    return animationRepository.findAll();
  }

  @Override
  public Animation findAnimationByCharacter(Character character) throws AnimationNotFoundException {
    Animation animation = this.animationRepository.findAnimationByCharacter(character);
    if (animation != null) return animation;
    else throw new AnimationNotFoundException("Requested animation by id is couldn't be located");
  }

  @Override
  public Animation findAnimation(Long id) throws AnimationNotFoundException {
      Animation animation = this.animationRepository.getById(id);
      if (animation != null) return animation;
      else throw new AnimationNotFoundException("Requested animation by id is couldn't be located");
  }

  @Override
  public void createAnimation(Animation animation) {
    animationRepository.create(animation);
  }

  @Override
  public Animation updateAnimation(Animation animation) {
    return animationRepository.update(animation);
  }

  @Override
  public void deleteAnimation(Long id) {
    animationRepository.delete(id);
  }
}
