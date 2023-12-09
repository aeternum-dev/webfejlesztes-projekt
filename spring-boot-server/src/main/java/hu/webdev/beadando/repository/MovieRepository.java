package hu.webdev.beadando.repository;

import hu.webdev.beadando.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
  List<Movie> findByPublished(boolean published);

  List<Movie> findByTitleContainingIgnoreCase(String title);
}
