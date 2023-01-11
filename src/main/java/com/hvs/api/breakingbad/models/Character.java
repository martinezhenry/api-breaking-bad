package com.hvs.api.breakingbad.models;

import lombok.Data;

@Data
public class Character {
    private long id;
    private String name;
    private String birthday;
    private String[] occupation;
    private String img;
    private String status;
    private String nickname;
    private int[] appearance;
}
