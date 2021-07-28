package kr.re.kitri.posts.dao;

import kr.re.kitri.posts.model.Post;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;


@Repository
public class PostsRepository {

    public List<Post> selectPostsAll() {
        // DB에 접속하여 데이터를 가지고 온다.
        List<Post> postList = Arrays.asList(
                new Post(1, "제목무", "냉무", 0),
                new Post(2, "제목무2", "냉무", 20),
                new Post(3, "제목무3", "냉무", 30),
                new Post(4, "제목무4", "냉무", 40)
        );
        return postList;
    }

    public Post selectPostByPostId(long postId) {
        return new Post(postId, "제목무", "냉무", 100);
    }
}
