package kr.re.kitri.posts.service;

import kr.re.kitri.posts.model.Post;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PostsServiceTest {

    @Autowired
    private PostsService postsService;

    @Test
    public void testViewPostByPostId() {
        Post result = postsService.viewPostByPostId(13);
        assertNotNull(result);
    }

}
