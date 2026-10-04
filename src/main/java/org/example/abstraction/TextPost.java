package org.example.abstraction;

import org.example.implementor.SocialPublisher;

public class TextPost extends SocialPost {
    private String text;
    public TextPost(SocialPublisher publisher, String text) {
        super(publisher);
        this.text=text;
    }
    @Override
    public void publish() {
        publisher.sendContent(text, null);
    }
}
