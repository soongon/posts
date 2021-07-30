package kr.re.kitri.posts.dao;

import kr.re.kitri.posts.model.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostsRepository {
    @Autowired
    private SqlSession session;

    public List<Post> selectPostsAll() {
        return session.selectList("selectPostsAll");
    }
    public Post selectPostByPostId(long postId) {
        return session.selectOne("selectPostByPostId", postId);
    }
    public void insertPost(Post post) {
        session.insert("insertPost", post);
    }
    public void deletePostByPostId(long postId) {
        session.delete("deletePostByPostId", postId);
    }
}


//@Repository
//@Mapper
//public interface PostsRepository {
//    List<Post> selectPostsAll();
//    Post selectPostByPostId(long postId);
//    void insertPost(Post post);
//    void deletePostByPostId(long postId);
//}
