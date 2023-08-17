package rocha.andre.springapiweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import rocha.andre.springapiweb.domain.Movie.CreateMovieDto;
import rocha.andre.springapiweb.domain.Movie.CreateMovieUseCase;

@Controller
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    CreateMovieUseCase createMovie;

    @GetMapping
    public String loadFormsPage() {
        return "movies/forms";
    }

    @PostMapping
    public String createMovie(CreateMovieDto data) {
        createMovie(data);
        return "movies/forms";
    }
}
