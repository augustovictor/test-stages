package augustovictor.com.github.teststages.movie

import augustovictor.com.github.teststages.IntegrationTest
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.experimental.categories.Category
import java.util.*

@Category(IntegrationTest::class)
class MovieIntegrationTest {
    private var performanceDelay = 0L

    @Before
    fun setup() {
//        performanceDelay = (Random().nextInt(4) +1).toLong().times(1000)
        performanceDelay = 1000
    }

    @After
    fun teardown() {
        println("This test took $performanceDelay seconds to complete!")
    }

    @Test
    fun `this is an integration test 1`() {
        Thread.sleep(performanceDelay)
        Assert.assertTrue(true)
    }

    @Test
    fun `this is an integration test 2`() {
        Thread.sleep(performanceDelay)
        Assert.assertTrue(true)
    }

    @Test
    fun `this is an integration test 3`() {
        Thread.sleep(performanceDelay)
        Assert.assertTrue(true)
    }

    @Test
    fun `this is an integration test 4`() {
        Thread.sleep(performanceDelay)
        Assert.assertTrue(true)
    }

    @Test
    fun `this is an integration test 5`() {
        Thread.sleep(performanceDelay)
        Assert.assertTrue(true)
    }
}