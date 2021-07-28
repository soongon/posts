package kr.re.kitri.posts.service;

public interface PostsService {

    String viewAllPosts();
    String viewPostByPostId(long postId);
    void removePostByPostId(long postId);

}
