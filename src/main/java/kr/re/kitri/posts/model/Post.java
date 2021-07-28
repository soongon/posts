package kr.re.kitri.posts.model;

import java.io.Serializable;

public class Post {
    private long id;
    private String title;
    private String body;
    private long likes;

    public Post() {}
    public Post(long id, String title, String body, long likes) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.likes = likes;
    }
    public long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getBody() {
        return body;
    }
    public long getLikes() {
        return likes;
    }
    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", likes=" + likes +
                '}';
    }
}
