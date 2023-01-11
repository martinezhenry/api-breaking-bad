package com.hvs.api.breakingbad.services.implementations;

import com.hvs.api.breakingbad.models.Character;
import com.hvs.api.breakingbad.services.contracts.ICharacterService;
import com.hvs.api.breakingbad.services.contracts.ILoadDataService;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class LoadDataService implements ILoadDataService {

    private ICharacterService characterService;
    private static final String SEPARATOR = ",";

    public LoadDataService(ICharacterService characterService){
        this.characterService = characterService;
    }
    @Override
    public int loadCharacters(String dataPath) throws IOException {
        List<String> registers = Files.readAllLines(Paths.get(dataPath));
        AtomicInteger saved = new AtomicInteger();
        registers.parallelStream().forEach(register -> {
            var data = register.split(SEPARATOR);
            var character = new Character();
            character.setId(Long.parseLong(data[0]));
            character.setName(data[1]);
            character.setBirthday(data[2]);
            character.setOccupation(data[3].split(SEPARATOR));
            character.setImg(data[4]);
            character.setStatus(data[5]);
            character.setNickname(data[6]);
            character.setAppearance(data[7].split(SEPARATOR));

            this.characterService.saveCharacter(character);
            saved.getAndIncrement();
        });
        return saved.get();
    }
}
