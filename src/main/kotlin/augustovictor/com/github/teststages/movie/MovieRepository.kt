package augustovictor.com.github.teststages.movie

import org.springframework.data.repository.Repository

interface MovieRepository : Repository<Movie, Long> {
    fun findAll(): List<Movie>
}