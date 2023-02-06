package com.hvs.api.breakingbad.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Episode {
    @Id
    private long id;
    private String title;
    private String season;
    private String episode;
    private String air_date;
    private String[] characteres;

}
