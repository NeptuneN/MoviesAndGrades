package ee.kool.kool.actorsAndMovies.actors.movies.service;

import ee.kool.kool.actorsAndMovies.actors.dto.Actor;
import ee.kool.kool.actorsAndMovies.actors.movies.dto.Film;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    public List<Film> mockMovies() {
        List<Film> films = new ArrayList<>();
        Film film1 = new Film();
        film1.setId(1);
        film1.setName("Star Wars");
        Actor actor1 = new Actor();
        actor1.setForeName("Matthew");
        actor1.setLastName("Mercer");
        actor1.setId(1);

        List<Actor> actors = new ArrayList<>();
        actors.add(actor1);
        film1.setActors(actors);
        films.add(film1);
        return films;
    }

    public Film mockOneMovie(Integer id) {
        Film film2 = new Film();
        film2.setId(id);
        film2.setName("Overwatch");
        return film2;
    }

    public Film mockTwoMovie(Integer id) {
        Film film3 = new Film();
        film3.setId(id);
        film3.setName("Bingo");
        film3.setRating(7);
        return film3;
    }
}
