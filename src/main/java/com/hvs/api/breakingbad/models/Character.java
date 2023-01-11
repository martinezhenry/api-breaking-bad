package com.hvs.api.breakingbad.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Character {
    @Id
    private long id;
    private String name;
    private String birthday;
    private String[] occupation;

    @Column(columnDefinition="TEXT", length = 2048)
    private String img;
    private String status;
    private String nickname;
    private String[] appearance;
}
