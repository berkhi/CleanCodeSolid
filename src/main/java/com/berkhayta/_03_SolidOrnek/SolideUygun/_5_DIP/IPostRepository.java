package com.berkhayta._03_SolidOrnek.SolideUygun._5_DIP;

public interface IPostRepository {
    void addPost(Post post);
    void editPost(int index, Post newPost);
    boolean isValidIndex(int index);
    void deletePost(int index);
    void listPosts();
}
