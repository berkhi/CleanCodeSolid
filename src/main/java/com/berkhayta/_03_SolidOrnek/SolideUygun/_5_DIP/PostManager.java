package com.berkhayta._03_SolidOrnek.SolideUygun._5_DIP;

public class PostManager {
    private IPostRepository postRepository;

    public PostManager(IPostRepository postRepository) {
        this.postRepository = postRepository;
    }

    // Blog işlemleri
    public void addPost(Post post) {
        postRepository.addPost(post);
        System.out.println("Post added.");
    }

    public void editPost(int index, Post newPost) {
        postRepository.editPost(index,newPost);
        System.out.println("Post edited.");
    }
    private boolean isValidIndex(int index) {
        return postRepository.isValidIndex(index);
    }


    public void deletePost(int index) {
       postRepository.deletePost(index);
        System.out.println("Post deleted.");
    }

    public void listPosts() {
        postRepository.listPosts();
    }
}
