package com.morphosium.sbdeneme.dao.mem;

import com.morphosium.sbdeneme.model.Animation;
import com.morphosium.sbdeneme.model.Character;

import java.util.HashMap;
import java.util.Map;

public class MemoryCharacterRepository {
  private Map<Long, Animation> characterMap = new HashMap();

  public MemoryCharacterRepository() {
    Character character = new Character();
    character.setName("Dipper Pines");
    character.setId(1L);

    character.setName("Mabel Pines");
    character.setId(2L);
  }
}
