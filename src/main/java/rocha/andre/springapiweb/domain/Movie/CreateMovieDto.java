package rocha.andre.springapiweb.domain.Movie;

public record CreateMovieDto(
        String name,
        Integer duration,
        Integer yrOfRelease,
        String genre
) { }
