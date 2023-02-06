package com.hvs.api.breakingbad.controllers.contracts;


import java.util.List;
import java.util.Optional;

import com.hvs.api.breakingbad.models.Episode;

public interface IEpisodeController {
    List<Episode> getEpisodes();
    Optional<Episode> getEpisodeById(long id);
}
