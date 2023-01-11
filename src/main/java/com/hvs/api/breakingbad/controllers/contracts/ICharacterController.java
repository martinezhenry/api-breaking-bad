package com.hvs.api.breakingbad.controllers.contracts;

import com.hvs.api.breakingbad.models.Character;

import java.util.List;

public interface ICharacterController {
    List<Character> getCharacters();
    Character getCharacterById(long id);
}
