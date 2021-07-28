package kr.re.kitri.posts.controller;

import kr.re.kitri.posts.model.Post;
import kr.re.kitri.posts.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostsController {

    @Autowired
    private PostsService postsService;

    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return postsService.viewAllPosts();
    }

    @GetMapping("/posts/{postId}") // /posts/3
    public Post getPostByPostId(@PathVariable long postId) {
        return postsService.viewPostByPostId(postId);
    }

    @PostMapping("/posts")
    public Post registPost(@RequestBody Post post) {
        return postsService.setPost(post);
    }
}
