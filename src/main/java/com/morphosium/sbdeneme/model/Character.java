package com.morphosium.sbdeneme.model;

public class Character {
  private Long id;
  private String name;

  private Animation animation;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Animation getAnimation() {
    return animation;
  }

  public void setAnimation(Animation animation) {
    this.animation = animation;
  }

  @Override
  public String toString() {
    String animationName = "NONE";
    if (animation != null) animationName = animation.getName();
    return name + " from " + animationName;
  }
}
