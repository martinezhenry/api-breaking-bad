package com.hvs.api.breakingbad.services.implementations;

import com.hvs.api.breakingbad.models.Character;
import com.hvs.api.breakingbad.repositories.contracts.ICharacterRepository;
import com.hvs.api.breakingbad.services.contracts.ICharacterService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterService implements ICharacterService {

    private ICharacterRepository characterRepository;

    public CharacterService(ICharacterRepository characterRepository){
        this.characterRepository = characterRepository;
    }

    @Override
    public Optional<Character> getCharacterById(long id) {
        return this.characterRepository.findById(id);
    }

    @Override
    public List<Character> getCharacters() {
        return (List<Character>) this.characterRepository.findAll();
    }

    @Override
    public Character saveCharacter(Character character) {
        return this.characterRepository.save(character);
    }
}
