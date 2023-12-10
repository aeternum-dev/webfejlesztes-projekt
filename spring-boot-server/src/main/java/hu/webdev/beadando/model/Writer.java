package hu.webdev.beadando.model;

import jakarta.persistence.*;

@Entity
@Table(name = "writers")
public class Writer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    public Writer() {
    }

    public Writer(String name, String description) {
        this.name = name;
        this.description = description;

    }

    // getters and setters

    @Override
    public String toString() {
        return "Writer [id=" + id + ", name=" + name + "]";
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}