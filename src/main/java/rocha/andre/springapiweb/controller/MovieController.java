package rocha.andre.springapiweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import rocha.andre.springapiweb.domain.Movie.*;


@Controller
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    CreateMovieUseCase createMovieUseCase;
    @Autowired
    DeleteMovieUseCase deleteMovieUseCase;
    @Autowired
    UpdateMovieUseCase updateMovieUseCase;

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping
    public String loadListPage(Model model) {
        //model, adicione na pagina um atributo "list" que receba listMovie
        model.addAttribute("list", movieRepository.findAll());

        return "movies/listMovies";
    }

    @DeleteMapping
    @Transactional
    public String deleteMovie(Long id) {
        deleteMovieUseCase.deleteMovie(id);
        return "redirect:/movies";
    }

    @PutMapping("/forms")
    @Transactional
    public String updateMovie(UpdateMovieDto data) {
        updateMovieUseCase.updateMovie(data);
        return "redirect:/movies";
    }

    @GetMapping("/forms")
    public String loadFormsPage(Long id, Model model) {
        if(id != null) {
            Movie movie = movieRepository.getReferenceById(id);
            model.addAttribute("movie", movie);
        }

        return "movies/forms";
    }

    @PostMapping("/forms")
    public String createMovie(CreateMovieDto data) {
        createMovieUseCase.createMovie(data);
        return "redirect:/movies";
    }
}
