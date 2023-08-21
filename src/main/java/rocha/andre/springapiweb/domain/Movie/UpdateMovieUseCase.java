package rocha.andre.springapiweb.domain.Movie;

import org.springframework.stereotype.Component;

@Component
public class UpdateMovieUseCase {
    private Long id;
    private String name;
    private Integer duration;

    private Integer yr_of_release;
    private String genre;


    public UpdateMovieUseCase(UpdateMovieDto data) {
        this.id = data.id();
        this.name = data.name();
        this.duration = data.duration();
        this.yr_of_release = data.yr_of_release();
        this.genre = data.genre();
    }

    public UpdateMovieUseCase() {  }

    private MovieRepository movieRepository;

    public UpdateMovieUseCase(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie updateMovie(UpdateMovieDto data) {
        Movie movie = movieRepository.getReferenceById(id);

        movie.updateData(data);

        return movie;
    }
}
