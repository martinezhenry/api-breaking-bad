package com.hvs.api.breakingbad.services.implementations;

import com.hvs.api.breakingbad.models.Episode;
import com.hvs.api.breakingbad.repositories.contracts.IEpisodeRepository;
import com.hvs.api.breakingbad.services.contracts.IEpisodeService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EpisodeService implements IEpisodeService {

    private IEpisodeRepository episodeRepository;

    public EpisodeService(IEpisodeRepository episodeRepository){
        this.episodeRepository = episodeRepository;
    }

    @Override
    public Optional<Episode> getEpisodeById(long id) {
        return this.episodeRepository.findById(id);
    }

    @Override
    public List<Episode> getEpisodes() {
        return (List<Episode>) this.episodeRepository.findAll();
    }

    @Override
    public Episode saveEpisode(Episode episode) {
        return this.episodeRepository.save(episode);
    }
}
