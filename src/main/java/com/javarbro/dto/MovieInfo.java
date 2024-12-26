package com.javarbro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovieInfo {
    private Integer movieId;
    private String name;
    private String description;
    private String releaseDate;
}
