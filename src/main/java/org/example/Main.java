package org.example;

import org.example.abstraction.ImagePost;
import org.example.abstraction.SocialPost;
import org.example.abstraction.TextPost;
import org.example.implementor.SocialPublisher;
import org.example.implementor.TelegramPublisher;
import org.example.implementor.TwitterPublisher;

public class Main {
    public static void main(String[] args) {
        SocialPublisher telegram=new TelegramPublisher();
        SocialPublisher twitter=new TwitterPublisher();

        System.out.println("Testing Text Post: ");
        SocialPost textPost=new TextPost(telegram, "Hello, this is my first post.");
        textPost.publish();
        textPost.setPublisher(twitter);
        textPost.publish();

        System.out.println("Testing Image Post: ");
        SocialPost imagePost=new ImagePost(twitter, "My photo", "https://photo.jpg");
        imagePost.publish();
        imagePost.setPublisher(telegram);
        imagePost.publish();
    }
}
