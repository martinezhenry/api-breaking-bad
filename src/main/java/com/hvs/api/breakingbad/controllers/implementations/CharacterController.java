package com.hvs.api.breakingbad.controllers.implementations;

import com.hvs.api.breakingbad.controllers.contracts.ICharacterController;
import com.hvs.api.breakingbad.models.Character;
import com.hvs.api.breakingbad.services.contracts.ICharacterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("characters")
public class CharacterController implements ICharacterController {
    private final ICharacterService characterService;
    public CharacterController(ICharacterService characterService){
        this.characterService = characterService;
    }
    @Override
    @GetMapping
    public List<Character> getCharacters() {
        return this.characterService.getCharacters();
    }

    @Override
    @GetMapping("{id}")
    public Character getCharacterById(long id) {
        return this.characterService.getCharacterById(id);
    }
}
