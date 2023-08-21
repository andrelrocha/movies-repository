package rocha.andre.springapiweb.domain.Movie;

import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer duration;

    private Integer yr_of_release;
    private String genre;

    public Movie(CreateMovieDto data) {
        this.name = data.name();
        this.duration = data.duration();
        this.yr_of_release = data.yr_of_release();
        this.genre = data.genre();
    }

    public Movie() {
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", yrOfRelease=" + yr_of_release +
                ", genre='" + genre + '\'' +
                '}';
    }

    public Long getId() { return id; }
    public String getName() {
        return name;
    }

    public Integer getDuration() {
        return duration;
    }

    public Integer getyr_of_release() {
        return yr_of_release;
    }

    public String getGenre() {
        return genre;
    }

    public void updateData(UpdateMovieDto data) {
        if(data.name() != null) {
            this.name = data.name();
        }

        if(data.duration() != null) {
            this.duration = data.duration();
        }

        if (data.yr_of_release() != null) {
            this.yr_of_release = data.yr_of_release();
        }

        if (data.genre() != null) {
            this.genre = data.genre();
        }
    }
}

