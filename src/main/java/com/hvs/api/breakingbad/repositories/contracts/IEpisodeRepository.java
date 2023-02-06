package com.hvs.api.breakingbad.repositories.contracts;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hvs.api.breakingbad.models.Episode;

@Repository
public interface IEpisodeRepository extends CrudRepository<Episode, Long> {
}
