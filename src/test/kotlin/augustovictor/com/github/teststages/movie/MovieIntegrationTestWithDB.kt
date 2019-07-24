package augustovictor.com.github.teststages.movie

import augustovictor.com.github.teststages.DatabaseTest
import org.junit.Assert
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import org.junit.experimental.categories.Category
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional
import javax.persistence.EntityManager
import javax.persistence.FlushModeType

@RunWith(SpringRunner::class)
@SpringBootTest
@Transactional(propagation = Propagation.NESTED)
@Category(DatabaseTest::class)
class MovieIntegrationTestWithDB {
    @Autowired
    private lateinit var entityManager: EntityManager

    @Before
    fun setup() {
        entityManager.flushMode = FlushModeType.AUTO
    }

    @Test
    fun `should insert data to the movies table`() {
        val movie = Movie(title = "Movie inserted with entityManager")
        entityManager.persist(movie)

        val persistedMovie = entityManager.find(Movie::class.java, movie.id)

        Assert.assertEquals("Movie inserted with entityManager", persistedMovie.title)
    }

    @Test
    fun `should insert data to the movies table2`() {
        val movie = Movie(title = "Movie inserted with entityManager")
        entityManager.persist(movie)

        val persistedMovie = entityManager.find(Movie::class.java, movie.id)

        Assert.assertEquals("Movie inserted with entityManager", persistedMovie.title)
    }
//
//    @Test
//    fun `should insert data to the movies table3`() {
//        entityManager.persist(Movie(title = "Movie inserted with entityManager"))
//
//        val persistedMovie = entityManager.find(Movie::class.java, 3L)
//
//        Assert.assertEquals("Movie inserted with entityManager", persistedMovie.title)
//    }
//
//    @Test
//    fun `should insert data to the movies table4`() {
//        entityManager.persist(Movie(title = "Movie inserted with entityManager"))
//
//        val persistedMovie = entityManager.find(Movie::class.java, 4L)
//
//        Assert.assertEquals("Movie inserted with entityManager", persistedMovie.title)
//    }
//
//    @Test
//    fun `should insert data to the movies table5`() {
//        entityManager.persist(Movie(title = "Movie inserted with entityManager"))
//
//        val persistedMovie = entityManager.find(Movie::class.java, 5L)
//
//        Assert.assertEquals("Movie inserted with entityManager", persistedMovie.title)
//    }
//
//    @Test
//    fun `should insert data to the movies table6`() {
//        entityManager.persist(Movie(title = "Movie inserted with entityManager"))
//
//        val persistedMovie = entityManager.find(Movie::class.java, 6L)
//
//        Assert.assertEquals("Movie inserted with entityManager", persistedMovie.title)
//    }
}