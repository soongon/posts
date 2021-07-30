package kr.re.kitri.posts.dao;

import kr.re.kitri.posts.model.Post;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class PostsRepositoryTests {

    @Autowired
    private PostsRepository postsRepository;

    @Test
    public void testSelectPostsAll() {
        List<Post> result = postsRepository.selectPostsAll();

        assertTrue(result.size() > 0);
        //Assertions.assertEquals(true, result.size() > 0);
    }

    @Test
    public void testSelectPostByPostId() {
        Post result = postsRepository.selectPostByPostId(13);
        assertNotNull(result);
        assertEquals(100, result.getLikes());
    }

    @Test
    public void testInsertPost() {
        postsRepository.insertPost(
                new Post(10000, "test", "test", 0));
    }


}
