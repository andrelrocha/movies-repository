package rocha.andre.springapiweb.domain.Movie;

import org.springframework.stereotype.Component;

@Component
public class CreateMovieUseCase {
    private MovieRepository movieRepository;

    public CreateMovieUseCase(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie createMovie(CreateMovieDto data) {
        Movie existingMovie = movieRepository.findByNameAndYrOfRelease(data.name(), data.yr_of_release());

        if (existingMovie != null) {
            throw new IllegalArgumentException("A movie with the same name and year of release already exists.");
        }

        Movie newMovie = new Movie(data);

        return movieRepository.save(newMovie);
    }
}
