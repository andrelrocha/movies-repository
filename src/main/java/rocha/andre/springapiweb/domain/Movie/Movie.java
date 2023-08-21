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
        this.yr_of_release = data.yrOfRelease();
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

    public Integer getYrOfRelease() {
        return yr_of_release;
    }

    public String getGenre() {
        return genre;
    }
}

