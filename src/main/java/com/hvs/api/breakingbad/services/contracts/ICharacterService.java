package com.hvs.api.breakingbad.services.contracts;

import com.hvs.api.breakingbad.models.Character;

import java.util.List;
import java.util.Optional;

public interface ICharacterService {
    Optional<Character> getCharacterById(long id);

    List<Character> getCharacters();

    Character saveCharacter(Character character);
}
