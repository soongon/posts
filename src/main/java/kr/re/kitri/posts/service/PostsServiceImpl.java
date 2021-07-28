package kr.re.kitri.posts.service;

import kr.re.kitri.posts.dao.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostsServiceImpl implements PostsService {

    @Autowired
    private PostsRepository postsRepository;

    @Override
    public String viewAllPosts() {
        // DB에서 글을 가지고 온다.
        return postsRepository.selectPostsAll();
    }

    @Override
    public String viewPostByPostId(long postId) {
        return null;
    }

    @Override
    public void removePostByPostId(long postId) {

    }
}
