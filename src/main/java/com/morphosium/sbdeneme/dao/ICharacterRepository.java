package com.morphosium.sbdeneme.dao;


import com.morphosium.sbdeneme.model.Animation;
import com.morphosium.sbdeneme.model.Character;

import java.util.List;

public interface ICharacterRepository {
  List<Character> findAll();
  List<Character> findByAnimation(Animation animation);
  Character getById(Long id);
  List<Character> findByName(String name);
  void create(Character animation);
  Character update(Character animation);
  void delete(Long id);
}
