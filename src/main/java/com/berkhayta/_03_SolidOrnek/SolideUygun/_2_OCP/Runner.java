package com.berkhayta._03_SolidOrnek.SolideUygun._2_OCP;

/*
InstagramPostlarında artık fotoğraf ve video olabilir.
LinkedInPostlarında fotoğraf olabilir.
BLogPostlarımızda sadece metin olabilir.
 */

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

        LinkedinPost linkedinPost1=new LinkedinPost("LinkedinPost Başlık 1","LinkedinPost içerik 1");
        postManager.addPost(linkedinPost1);

        System.out.println("______________________ALL POSTS_________________");
        postManager.listPosts();
        System.out.println("________________________________________________");

        InstagramPost instagramPost1=new InstagramPost("Instagram","Instagram icerik","Instagram aciklama");
        postManager.addPost(instagramPost1);

        System.out.println("______________________ALL POSTS_________________");
        postManager.listPosts();
        System.out.println("________________________________________________");
    }
}

