package com.morphosium.sbdeneme.dao.mem;

import com.morphosium.sbdeneme.dao.AnimationRepository;
import com.morphosium.sbdeneme.model.Animation;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class AnimationRepositoryInMemoryImpl implements AnimationRepository {

  private Map<Long, Animation> animationMap = new HashMap();

  public AnimationRepositoryInMemoryImpl() {
    Animation gravityFalls = new Animation();
    gravityFalls.setId(1l);
    gravityFalls.setName("Gravity Falls");

    Animation familyGuy = new Animation();
    familyGuy.setId(2l);
    familyGuy.setName("Family Guy");

    Animation southPark = new Animation();
    southPark.setId(3l);
    southPark.setName("South Park");

    animationMap.put(1l, gravityFalls);
    animationMap.put(2l, familyGuy);
    animationMap.put(3l, southPark);
  }

  @Override
  public List<Animation> findAll() {
    return new ArrayList<>(animationMap.values());
  }

  @Override
  public Animation getById(Long id) {
    return animationMap.get(id);
  }

  @Override
  public List<Animation> findByName(String name) {
    return animationMap.values().stream().filter(animation -> animation.getName().
      equals(name)).collect(Collectors.toList());
  }

  @Override
  public void create(Animation animation) {
    animation.setId(new Date().getTime());
    animationMap.put(animation.getId(), animation);
  }

  @Override
  public Animation update(Animation animation) {
    animationMap.replace(animation.getId(), animation);
    return animation;
  }

  @Override
  public void delete(long id) {
    animationMap.remove(id);
  }
}
