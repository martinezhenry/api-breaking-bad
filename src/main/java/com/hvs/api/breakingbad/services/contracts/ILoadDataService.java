package com.hvs.api.breakingbad.services.contracts;

import java.io.IOException;

public interface ILoadDataService {


    int loadCharacters(String dataPath) throws IOException;
    int loadEpisodes(String dataPath) throws IOException;

}
