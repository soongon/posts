package kr.re.kitri.posts.dao;

import kr.re.kitri.posts.model.Post;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface PostsRepository {
    List<Post> selectPostsAll();
    Post selectPostByPostId(long postId);
    void insertPost(Post post);
    void deletePostByPostId(long postId);
}
