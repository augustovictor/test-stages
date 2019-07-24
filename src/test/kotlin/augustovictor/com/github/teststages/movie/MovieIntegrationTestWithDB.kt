package augustovictor.com.github.teststages.movie

import augustovictor.com.github.teststages.TestStagesApplicationTests
import org.junit.Assert
import org.junit.Test
import org.junit.experimental.categories.Category
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional
import javax.persistence.EntityManager

@RunWith(SpringRunner::class)
@SpringBootTest(classes = [TestStagesApplicationTests::class])
@Transactional(propagation = Propagation.NESTED)
@Category(DatabaseTest::class)
@EnableAutoConfiguration
class MovieIntegrationTestWithDB {
    @Autowired
    private lateinit var entityManager: EntityManager

    @Test
    fun `should insert data to the movies table`() {
        Assert.assertTrue(true)
    }
}