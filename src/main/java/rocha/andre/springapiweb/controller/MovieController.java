package rocha.andre.springapiweb.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import rocha.andre.springapiweb.domain.Movie.CreateMovieDto;

@Controller
@RequestMapping("/movies")
public class MovieController {
    @GetMapping
    public String loadFormsPage() {
        return "movies/forms";
    }

    @PostMapping
    public String createMovie(CreateMovieDto data) {
        System.out.println(data);
        return "movies/forms";
    }
}
