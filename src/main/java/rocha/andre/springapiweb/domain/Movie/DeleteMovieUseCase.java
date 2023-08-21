package rocha.andre.springapiweb.domain.Movie;

import org.springframework.stereotype.Component;

@Component
public class DeleteMovieUseCase {
    private MovieRepository movieRepository;

    public DeleteMovieUseCase(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }
}
