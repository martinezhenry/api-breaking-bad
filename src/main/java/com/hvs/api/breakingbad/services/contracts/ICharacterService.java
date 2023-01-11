package com.hvs.api.breakingbad.services.contracts;

import com.hvs.api.breakingbad.models.Character;

import java.util.List;

public interface ICharacterService {
    Character getCharacterById(long id);

    List<Character> getCharacters();
}
