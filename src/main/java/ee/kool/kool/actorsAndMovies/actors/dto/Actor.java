package ee.kool.kool.actorsAndMovies.actors.dto;

import ee.kool.kool.actorsAndMovies.actors.movies.dto.Film;
import lombok.Data;

import java.util.List;

@Data
public class Actor {
    private int id;
    private String foreName;
    private String lastName;
    private List<Film> films;
}
