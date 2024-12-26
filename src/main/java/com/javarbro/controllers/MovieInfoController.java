package com.javarbro.controllers;

import com.javarbro.dto.MovieInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("movies")
public class MovieInfoController {

    private static final List<MovieInfo> movieInfoList = Arrays.asList(
            new MovieInfo(1, "movie1", "movie1 desc", "10-10-1988"),
            new MovieInfo(2, "movie2", "movie2 desc", "11-10-1988"),
            new MovieInfo(3, "movie3", "movie3 desc", "12-10-1988"),
            new MovieInfo(4, "movie4", "movie4 desc", "13-10-1988"),
            new MovieInfo(5, "movie5", "movie5 desc", "14-10-1988")

    );

    @GetMapping("{movieId}")
    public MovieInfo getMovieInfo(@PathVariable Integer movieId) {
        return movieInfoList.stream().filter(movieInfo -> movieInfo.getMovieId().intValue() == movieId.intValue()).findFirst().orElse(null);
    }
}
