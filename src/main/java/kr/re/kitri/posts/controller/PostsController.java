package kr.re.kitri.posts.controller;

import kr.re.kitri.posts.model.Post;
import kr.re.kitri.posts.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostsController {

    @Autowired
    private PostsService postsService;

    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return postsService.viewAllPosts();
    }
}
