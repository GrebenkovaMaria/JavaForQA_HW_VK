package manager;

import ru.netology.domain.PostInfo;

public class PostManager {
    private PostInfo[] posts;

    public PostInfo[] search(PostInfo[] posts, String ownerId, String domain, String query, boolean ownersOnly, int count, int offset) {
        // логика поиска поста
        return null;
    }

    public void deletePost(PostInfo[] posts, String ownerId, String postId) {
        // логика для удаления поста
    }


}
