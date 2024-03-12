package com.berkhayta._03_SolidOrnek.SolideUygun._5_DIP;

public class ListPostRepository implements IPostRepository {
    @Override
    public void addPost(Post post) {
        Database.posts.add(post);
    }

    @Override
    public void editPost(int index, Post newPost) {
        if (isValidIndex(index)) {
            Database.posts.set(index, newPost);
        }
    }

    @Override
    public boolean isValidIndex(int index) {
        return index >= 0 && index < Database.posts.size();
    }

    @Override
    public void deletePost(int index) {
        if (isValidIndex(index)) {
            Database.posts.remove(index);

        }
    }

    @Override
    public void listPosts() {
        for (Post post : Database.posts) {
            System.out.println(post.display()+"\n");
        }
    }
}
