import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val service = WallService()
        service.add(Post("20.08.2021","текст поста #1"))
        assertEquals(true, service.posts.last().id != 0)
    }

    @Test
    fun updateTrue() {
        val service = WallService()
        service.add(Post("20.08.2021","текст поста #1"))
        service.add(Post("21.08.2021","текст поста #2"))
        val updatePost = Post("21.08.2021","измененный текст поста #2", id = 1)
        val result = service.update(updatePost)
        assertEquals(true, result)
    }

    @Test
    fun updateFalse() {
        val service = WallService()
        service.add(Post("20.08.2021","текст поста #1"))
        service.add(Post("21.08.2021","текст поста #2"))
        val updatePost = Post("21.08.2021","измененный текст поста #2", id = 3)
        val result = service.update(updatePost)
        assertEquals(false, result)
    }
}