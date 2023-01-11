package com.hvs.api.breakingbad.repositories.contracts;

import com.hvs.api.breakingbad.models.Character;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICharacterRepository extends CrudRepository<Character, Long> {
}
