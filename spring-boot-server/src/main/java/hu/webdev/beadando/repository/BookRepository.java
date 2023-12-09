package hu.webdev.beadando.repository;

import java.util.List;

import hu.webdev.beadando.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByPublished(boolean published);

    List<Book> findByTitleContainingIgnoreCase(String title);
}
