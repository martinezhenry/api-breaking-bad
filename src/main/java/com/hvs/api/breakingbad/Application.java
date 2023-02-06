package com.hvs.api.breakingbad;

import com.hvs.api.breakingbad.services.contracts.ILoadDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;
import java.io.IOException;

@SpringBootApplication
@EnableJpaRepositories
@EnableAutoConfiguration
public class Application {

    @Autowired
    private ILoadDataService loadDataService;
    @Value("${data.characters.path}")
    private String dataCharactersPath;
    @Value("${data.episodes.path}")
    private String dataEpisodesPath;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void loadDataAfterStartup() throws IOException {
        this.loadDataService.loadCharacters(dataCharactersPath);
        this.loadDataService.loadEpisodes(dataEpisodesPath);
    }

}
