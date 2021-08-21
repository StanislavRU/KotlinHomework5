fun main() {
}

class WallService {
    var posts = emptyArray<Post>()
    private var counter: Int = 0

    fun add(post: Post): Post {
        counter++
        val postId = post.copy(id = counter)
        posts += postId
        return posts.last()
    }

    fun update(UpdatePost: Post): Boolean {
        var result = false
        for ((index, post) in posts.withIndex()) {
            if (post.id == UpdatePost.id) {
                posts[index] = post.copy(
                text = UpdatePost.text,
                ownerId = UpdatePost.ownerId,
                createdBy = UpdatePost.createdBy,
                replyOwnerId = UpdatePost.replyOwnerId,
                replyPostId = UpdatePost.replyPostId,
                friendsOnly = UpdatePost.friendsOnly,
                comments = UpdatePost.comments,
                copyright = UpdatePost.copyright,
                likes = UpdatePost.likes,
                reposts = UpdatePost.reposts,
                views = UpdatePost.views,
                postType = UpdatePost.postType,
                signerId = UpdatePost.signerId,
                canPin = UpdatePost.canPin,
                canDelete = UpdatePost.canDelete,
                canEdit = UpdatePost.canEdit,
                isPinned = UpdatePost.isPinned,
                markedAsAds = UpdatePost.markedAsAds,
                isFavorite = UpdatePost.isFavorite,
                donut = UpdatePost.donut,
                postponedId = UpdatePost.postponedId,
                )
                result = true
                println(posts[index])
            }
        }
        return result
    }
}
