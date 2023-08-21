package rocha.andre.springapiweb.domain.Movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    @Query("SELECT m FROM Movie m WHERE m.name = ?1 AND m.yr_of_release = ?2")
    Movie findByNameAndYrOfRelease(String name, Integer yr_of_release);
}