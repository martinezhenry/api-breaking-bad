package com.hvs.api.breakingbad.controllers.implementations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hvs.api.breakingbad.models.Episode;

import java.util.List;
import java.util.Optional;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("episodes")
public class EpisodeController implements IEpisodeController {
    private final IEpisodeService episodeService;
    public EpisodeController(IEpisodeService episodeService){
        this.episodeService = episodeService;
    }
    @Override
    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<Character> getEpisodes() {
        return this.episodeService.getEpisodes();
    }

    @Override
    @GetMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public Optional<Episode> getEpisodeById(@PathVariable long id) {
        return this.episodeService.getEpisodeById(id);
    }
}
