package ee.kool.kool.actorsAndMovies.actors.service;


import ee.kool.kool.actorsAndMovies.actors.dto.Actor;
import ee.kool.kool.actorsAndMovies.actors.movies.dto.Film;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActorService {

    public List<Actor> mockActors() {
        List<Actor> actors = new ArrayList<>();
        Actor actor1 = new Actor();
        actor1.setId(1);
        actor1.setForeName("Matthew");
        actor1.setLastName("Mercer");
        Film film1 = new Film();
        film1.setId(1);
        film1.setName("Star Wars");

        List<Film> films = new ArrayList<>();
        films.add(film1);
        actor1.setFilms(films);
        actors.add(actor1);
        return actors;
    }

    public Actor mockOneActor(Integer id) {
        Actor actor2 = new Actor();
        actor2.setId(id);
        actor2.setForeName("Stacy");
        actor2.setLastName("Jule");
        return actor2;
    }
}
