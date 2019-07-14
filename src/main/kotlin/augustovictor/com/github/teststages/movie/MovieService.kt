package augustovictor.com.github.teststages.movie

import org.springframework.stereotype.Service

@Service
class MovieService(private val movieRepository: MovieRepository) {
    fun allMovies(): List<Movie> = movieRepository.findAll()
}
