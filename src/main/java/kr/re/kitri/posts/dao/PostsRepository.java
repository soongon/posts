package kr.re.kitri.posts.dao;

import org.springframework.stereotype.Repository;

@Repository
public class PostsRepository {

    public String selectPostsAll() {
        // DB에 접속하여 데이터를 가지고 온다.
        return "전체 글 반환한다.";
    }
}
