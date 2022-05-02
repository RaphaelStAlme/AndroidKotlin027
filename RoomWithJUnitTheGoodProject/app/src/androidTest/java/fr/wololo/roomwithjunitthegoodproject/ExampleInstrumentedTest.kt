package fr.wololo.roomwithjunitthegoodproject

import androidx.room.Room
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import fr.wololo.roomwithjunitthegoodproject.dao.FilmDao
import fr.wololo.roomwithjunitthegoodproject.dao.MaBaseDeDonnees
import fr.wololo.roomwithjunitthegoodproject.entities.Film

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    lateinit var bdd:MaBaseDeDonnees
    lateinit var dao:FilmDao

    @Before
    fun useAppContext() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        bdd = Room.inMemoryDatabaseBuilder(appContext,MaBaseDeDonnees::class.java).allowMainThreadQueries().build()
        dao = bdd.filmDao()

        dao.insert(Film(titre = "Il était une fois dans l'ouest",duree =90, nationalite = "USA"))
        dao.insert(Film(titre="1984",duree=90,nationalite="USA"))
    }

    @Test
    fun insert()
    {

        var film = dao.get(1)

        assertEquals(film.titre,"Il était une fois dans l'ouest")
        assertEquals(film.duree,90);
        assertEquals(film.nationalite,"USA")
    }

    @Test
    fun getAll()
    {
        assertTrue(dao.get().isNotEmpty());
    }

    @Test
    fun getById()
    {
        var film = dao.get(1)
        assertEquals(film.titre,"Il était une fois dans l'ouest")
        assertEquals(film.duree,90);
        assertEquals(film.nationalite,"USA")
    }






}