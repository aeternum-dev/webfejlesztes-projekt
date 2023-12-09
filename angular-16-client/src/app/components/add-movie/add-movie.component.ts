import { Component } from '@angular/core';
import { Movie } from 'src/app/models/movie.model';
import { MovieService } from 'src/app/services/movie.service';

@Component({
  selector: 'app-add-movie',
  templateUrl: './add-movie.component.html',
  styleUrls: ['./add-movie.component.css'],
})
export class AddMovieComponent {
  movie: Movie = {
    title: '',
    description: '',
    published: false
  };
  submitted = false;

  constructor(private movieService: MovieService) { }

  saveMovie(): void {
    const data = {
      title: this.movie.title,
      description: this.movie.description
    };

    this.movieService.create(data).subscribe({
      next: (res) => {
        console.log(res);
        this.submitted = true;
      },
      error: (e) => console.error(e)
    });
  }

  newMovie(): void {
    this.submitted = false;
    this.movie = {
      title: '',
      description: '',
      published: false
    };
  }
}
