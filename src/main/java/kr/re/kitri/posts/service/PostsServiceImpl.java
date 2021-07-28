package kr.re.kitri.posts.service;

import org.springframework.stereotype.Service;

@Service
public class PostsServiceImpl implements PostsService {
    @Override
    public String viewAllPosts() {
        return "전체 글보기 입니다.";
    }

    @Override
    public String viewPostByPostId(long postId) {
        return null;
    }

    @Override
    public void removePostByPostId(long postId) {

    }
}
