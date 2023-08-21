package rocha.andre.springapiweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import rocha.andre.springapiweb.domain.Movie.CreateMovieDto;
import rocha.andre.springapiweb.domain.Movie.CreateMovieUseCase;
import rocha.andre.springapiweb.domain.Movie.Movie;
import rocha.andre.springapiweb.domain.Movie.MovieRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    CreateMovieUseCase createMovieUseCase;

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/forms")
    public String loadFormsPage() {
        return "movies/forms";
    }

    @GetMapping
    public String loadListPage(Model model) {
        //model, adicione na pagina um atributo "list" que receba listMovie
        model.addAttribute("list", movieRepository.findAll());

        return "movies/listMovies";
    }

    @PostMapping("/forms")
    public String createMovie(CreateMovieDto data) {
        createMovieUseCase.createMovie(data);

        return "redirect:/movies";
    }
}
