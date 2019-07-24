package augustovictor.com.github.teststages

import org.junit.Test
import org.junit.experimental.categories.Category
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@Category(ContextLoad::class)
@SpringBootTest
class TestStagesApplicationTests {

	@Test
	fun contextLoads() {
	}

}
