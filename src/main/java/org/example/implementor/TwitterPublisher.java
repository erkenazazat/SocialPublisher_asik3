package org.example.implementor;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public void sendContent(String text, String mediaUrl) {
        System.out.println("TWITTER POST");
        System.out.println("Text: "+text);
        if (mediaUrl!=null) {
            System.out.println("MediaUrl: "+mediaUrl);
        }
        System.out.println("Published to Twitter successfully.\n");
    }
}
