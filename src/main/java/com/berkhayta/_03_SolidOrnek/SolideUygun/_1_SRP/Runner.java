package com.berkhayta._03_SolidOrnek.SolideUygun._1_SRP;

public class Runner {
    public static void main(String[] args) {
        SessionManager sessionManager = new SessionManager();
        PostManager postManager = new PostManager();

        User user1 = new User("ali");
        User user2 = new User("hülya");

        Database.users.add(user1);
        Database.users.add(user2);

        sessionManager.login("ali");
        sessionManager.login("alice");

        BlogPost post1 = new BlogPost("İlk Yazı", "Bu ilk yazının içeriği.");
        BlogPost post2 = new BlogPost("İkinci Yazı", "Bu ikinci yazının içeriği.");

        postManager.addPost(post1);
        postManager.addPost(post2);

        System.out.println("______________________ALL POSTS_________________");
        postManager.listPosts();
        System.out.println("________________________________________________");

        BlogPost postUpdated = new BlogPost("İlk Yazı(Güncel)", "Bu ilk yazının içeriğinin güncel hali.");
        postManager.editPost(0,postUpdated);

        System.out.println("______________________ALL POSTS_________________");
        postManager.listPosts();
        System.out.println("________________________________________________");

        postManager.deletePost(0);

        System.out.println("______________________ALL POSTS_________________");
        postManager.listPosts();
        System.out.println("________________________________________________");
    }
}
