import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val service = WallService()
        val original = service.add(Post("20.08.2021","текст поста #1", id = 3))
        val expected = original.copy(id=1)
        assertEquals(expected, original)
    }

    @Test
    fun updateTrue() {
        val service = WallService()
        service.add(Post("20.08.2021","текст поста #1"))
        service.add(Post("21.08.2021","текст поста #2"))
        val updatePost = Post("21.08.2021","измененный текст поста #2", id = 1)
        val result = service.update(updatePost)
        assertTrue(result)
    }

    @Test
    fun updateFalse() {
        val service = WallService()
        service.add(Post("20.08.2021","текст поста #1"))
        service.add(Post("21.08.2021","текст поста #2"))
        val updatePost = Post("21.08.2021","измененный текст поста #2", id = 3)
        val result = service.update(updatePost)
        assertFalse(result)
    }
}