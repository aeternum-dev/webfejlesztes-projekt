package hu.webdev.beadando.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "movies")
public class Movie {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String title;

  @Column(name = "description")
  private String description;

  @Column(name = "published")
  private boolean published;


  @ManyToMany(mappedBy = "movieAdaptations")
  private Set<Book> adaptedBooks = new HashSet<>();

  public Movie() {

  }

  public Movie(String title, String description, boolean published) {
    this.title = title;
    this.description = description;
    this.published = published;
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isPublished() {
    return published;
  }

  public void setPublished(boolean isPublished) {
    this.published = isPublished;
  }

  public Set<Book> getAdaptedBooks() {
    return adaptedBooks;
  }

  public void setAdaptedBooks(Set<Book> adaptedBooks) {
    this.adaptedBooks = adaptedBooks;
  }

  @Override
  public String toString() {
    return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
  }


}
