package rocha.andre.springapiweb.domain.Movie;

public class Movie {
    private String name;
    private Integer duration;

    private Integer yrOfRelease;
    private String genre;

    public Movie(CreateMovieDto data) {
        this.name = data.name();
        this.duration = data.duration();
        this.yrOfRelease = data.yrOfRelease();
        this.genre = data.genre();
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", yrOfRelease=" + yrOfRelease +
                ", genre='" + genre + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getDuration() {
        return duration;
    }

    public Integer getYrOfRelease() {
        return yrOfRelease;
    }

    public String getGenre() {
        return genre;
    }
}
