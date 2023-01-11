package com.hvs.api.breakingbad.controllers.contracts;

import com.hvs.api.breakingbad.models.Character;

import java.util.List;
import java.util.Optional;

public interface ICharacterController {
    List<Character> getCharacters();
    Optional<Character> getCharacterById(long id);
}
