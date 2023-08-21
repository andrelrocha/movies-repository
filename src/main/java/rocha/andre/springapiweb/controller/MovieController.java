package rocha.andre.springapiweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import rocha.andre.springapiweb.domain.Movie.*;


@Controller
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    CreateMovieUseCase createMovieUseCase;
    @Autowired
    DeleteMovieUseCase deleteMovieUseCase;

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping
    public String loadListPage(Model model) {
        //model, adicione na pagina um atributo "list" que receba listMovie
        model.addAttribute("list", movieRepository.findAll());

        return "movies/listMovies";
    }

    @DeleteMapping
    public String deleteMovie(Long id) {
        deleteMovieUseCase.deleteMovie(id);
        return "redirect:/movies";
    }

    @GetMapping("/forms")
    public String loadFormsPage() {
        return "movies/forms";
    }

    @PostMapping("/forms")
    public String createMovie(CreateMovieDto data) {
        createMovieUseCase.createMovie(data);
        return "redirect:/movies";
    }
}
