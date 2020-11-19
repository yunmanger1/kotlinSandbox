import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class UtilsKtTest {
    @Test
    fun testSum() {
        assertEquals(3, sum(1 ,2))
    }

    @Test
    fun failingTest() {
        assertEquals(2, sum(1, 1))
    }
}