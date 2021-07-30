package kr.re.kitri.posts.service;

import kr.re.kitri.posts.dao.PostsRepository;
import kr.re.kitri.posts.model.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsServiceImpl implements PostsService {

    public static Logger logger =
            LoggerFactory.getLogger(PostsServiceImpl.class);

    @Autowired
    private PostsRepository postsRepository;

    @Override public List<Post> viewAllPosts() {
        logger.info("서비스 호출......");
        return postsRepository.selectPostsAll();
    }
    @Override public Post viewPostByPostId(long postId) {
        logger.info((3 / postId) + "");
        return postsRepository.selectPostByPostId(postId);
    }
    @Override public void removePostByPostId(long postId) {
        postsRepository.deletePostByPostId(postId);
    }
    @Override public Post setPost(Post post) {
        postsRepository.insertPost(post);
        return post;
    }
}
