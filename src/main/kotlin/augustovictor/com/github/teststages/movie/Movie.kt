package augustovictor.com.github.teststages.movie

import javax.persistence.*

@Entity
class Movie(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,

        @Column(name = "title")
        val title: String
)