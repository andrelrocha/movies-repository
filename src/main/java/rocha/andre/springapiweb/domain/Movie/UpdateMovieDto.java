package rocha.andre.springapiweb.domain.Movie;

public record UpdateMovieDto(Long id,
                             String name,
                             Integer duration,
                             Integer yr_of_release,
                             String genre) { }
