package com.morphosium.sbdeneme.service;

import com.morphosium.sbdeneme.dao.IAnimationRepository;
import com.morphosium.sbdeneme.exception.AnimationNotFoundException;
import com.morphosium.sbdeneme.model.Animation;
import com.morphosium.sbdeneme.model.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FictionalEntitiesService implements IFictionalEntitiesService {

  private IAnimationRepository animationRepository;


  @Autowired
  public void setAnimationRepository(IAnimationRepository animationRepository) {
    this.animationRepository = animationRepository;
  }

  public IAnimationRepository getAnimationRepository() {
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
    else throw new AnimationNotFoundException("Requested animation is couldn't be located");
  }

  @Override
  public Animation findAnimation(Long id) throws AnimationNotFoundException {
    Animation animation = this.animationRepository.getById(id);
    if (animation != null) return animation;
    else throw new AnimationNotFoundException("Requested animation is couldn't be located");
  }

  @Override
  public Animation createAnimation(Animation animation) {
    return animationRepository.create(animation);
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
