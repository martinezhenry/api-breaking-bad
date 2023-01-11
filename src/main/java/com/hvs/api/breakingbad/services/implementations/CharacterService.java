package com.hvs.api.breakingbad.services.implementations;

import com.hvs.api.breakingbad.models.Character;
import com.hvs.api.breakingbad.services.contracts.ICharacterService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService implements ICharacterService {
    @Override
    public Character getCharacterById(long id) {
        return null;
    }

    @Override
    public List<Character> getCharacters() {
        return null;
    }
}
