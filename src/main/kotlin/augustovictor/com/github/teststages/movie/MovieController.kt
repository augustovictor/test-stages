package augustovictor.com.github.teststages.movie

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/movies")
class MovieController(private val movieService: MovieService) {
    @GetMapping
    fun allMovies(): List<Movie> = movieService.allMovies()
}