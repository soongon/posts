package kr.re.kitri.posts.service;

import kr.re.kitri.posts.model.Post;

import java.util.List;

public interface PostsService {

    List<Post> viewAllPosts();
    String viewPostByPostId(long postId);
    void removePostByPostId(long postId);

}
