import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Tests {
    @Test
    fun TestFindHighestScore() {
        assertEquals(32, findHighScore(9, 25, true))
    }

    @Test
    fun TestAppend() {
        val subject = Ring(0)
        subject.append(1)
        subject.append(2)
        assertEquals(listOf(2, 1, 0), subject.toList())
    }

    @Test
    fun TestRemoveCurrent() {
        val subject = Ring(0)
        subject.append(1)
        subject.append(2)
        subject.removeCurrent()
        assertEquals(listOf(0, 1), subject.toList())
    }

    @Test
    fun TestDefaultingMap() {
        val subject = DefaultingMap<String, Int>(5)
        assertEquals(5, subject["foo"])
        subject["foo"] += 2
        assertEquals(7, subject["foo"])
        subject["bar"]--
        assertEquals(4, subject["bar"])
        subject["baz"] = 1
        assertEquals(1, subject["baz"])
    }
}