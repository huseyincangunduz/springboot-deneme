package com.morphosium.sbdeneme.dao;

import com.morphosium.sbdeneme.model.Animation;
import com.morphosium.sbdeneme.model.Character;

import java.util.List;

public interface IAnimationRepository {
  List<Animation> findAll();
  Animation getById(Long id);
  List<Animation> findByName(String name);
  Animation create(Animation animation);
  Animation findAnimationByCharacter(Character character);
  Animation update(Animation animation);
  void delete(long id);
}
