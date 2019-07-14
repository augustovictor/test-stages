package augustovictor.com.github.teststages

import org.junit.Assert
import org.junit.Test
import org.junit.experimental.categories.Category

@Category(IntegrationTest::class)
class MovieIntegrationTest {
    @Test
    fun `this is an integration test`() {
        Assert.assertTrue(true)
    }
}