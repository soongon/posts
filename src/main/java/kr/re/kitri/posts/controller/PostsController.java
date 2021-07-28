package kr.re.kitri.posts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {

    @GetMapping("/posts")
    public String getAllPosts() {
        return "글 전체보기..";
    }
}
