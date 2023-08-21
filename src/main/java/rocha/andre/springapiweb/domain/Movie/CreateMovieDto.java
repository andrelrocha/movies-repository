package rocha.andre.springapiweb.domain.Movie;

public record CreateMovieDto(
        String name,
        Integer duration,
        Integer yr_of_release,
        String genre
) { }
