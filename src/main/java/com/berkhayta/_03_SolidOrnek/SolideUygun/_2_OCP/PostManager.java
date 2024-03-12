package com.berkhayta._03_SolidOrnek.SolideUygun._2_OCP;

public class PostManager {
    // Blog işlemleri
    public void addPost(Post post) {
        Database.posts.add(post);
        System.out.println("Post added.");
    }

    public void editPost(int index, Post newPost) {
        if (isValidIndex(index)) {
            Database.posts.set(index, newPost);
            System.out.println("Post edited.");
        }
    }
    private boolean isValidIndex(int index) {
        return index >= 0 && index < Database.posts.size();
    }


    public void deletePost(int index) {
        if (isValidIndex(index)) {
            Database.posts.remove(index);
            System.out.println("Post deleted.");
        }
    }

    public void listPosts() {
        for (Post post : Database.posts) {
            System.out.println(post.display()+"\n");
        }
    }
}
