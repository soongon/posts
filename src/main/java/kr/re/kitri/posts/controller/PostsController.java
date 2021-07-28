package kr.re.kitri.posts.controller;

import kr.re.kitri.posts.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {

    @Autowired
    private PostsService postsService;

    @GetMapping("/posts")
    public String getAllPosts() {
        return postsService.viewAllPosts();
    }
}
