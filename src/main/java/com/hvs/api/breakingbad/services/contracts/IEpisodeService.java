package com.hvs.api.breakingbad.services.contracts;

import com.hvs.api.breakingbad.models.Episode;

import java.util.List;
import java.util.Optional;

public interface IEpisodeService {
    Optional<Episode> getEpisodeById(long id);

    List<Episode> getEpisodes();

    Episode saveEpisode(Episode episode);
}
