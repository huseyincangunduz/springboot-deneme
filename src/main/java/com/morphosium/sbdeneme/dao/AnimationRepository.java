package com.morphosium.sbdeneme.dao;

import com.morphosium.sbdeneme.model.Animation;

import java.util.List;

public interface AnimationRepository {
  List<Animation> findAll();
  Animation getById(Long id);
  List<Animation> findByName(String name);
  void create(Animation animation);
  Animation update(Animation animation);
  void delete(long id);
}
