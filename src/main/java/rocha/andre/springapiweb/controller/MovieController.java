package rocha.andre.springapiweb.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/movies")
public class MovieController {
    @GetMapping
    public String loadFormsPage() {
        return "movies/forms";
    }
}
