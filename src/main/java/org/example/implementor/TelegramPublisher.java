package org.example.implementor;

public class TelegramPublisher implements SocialPublisher {
    @Override
    public void sendContent(String text, String mediaUrl) {
        System.out.println("TELEGRAM POST");
        System.out.println("Text: "+text);
        if (mediaUrl!=null) {
            System.out.println("MediaUrl: "+mediaUrl);
        }
        System.out.println("Published to Telegram successfully.\n");
    }
}
