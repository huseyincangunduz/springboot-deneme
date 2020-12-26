package com.morphosium.sbdeneme.model;

import java.util.HashSet;
import java.util.Set;

public class Animation {
  private Long id;
  private String name;

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

  private Set<Character> characters = new HashSet<>();

  public Set<Character> getCharacters() {
    return characters;
  }

  public void setCharacters(Set<Character> characters) {
    this.characters = characters;
  }

  @Override
  public String toString() {
    return name;
  }
}
