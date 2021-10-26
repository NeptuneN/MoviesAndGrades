package ee.kool.kool.actorsAndMovies.actors.movies.dto;

import ee.kool.kool.actorsAndMovies.actors.dto.Actor;
import lombok.Data;
import java.util.List;
@Data
public class Film {
    private int id;
    private String name;
    private int rating;
    private List<Actor> actors;
}
