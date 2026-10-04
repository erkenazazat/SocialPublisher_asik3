package org.example.abstraction;

import org.example.implementor.SocialPublisher;

public abstract class SocialPost {
    protected SocialPublisher publisher;
    public SocialPost(SocialPublisher publisher) {
        this.publisher=publisher;
    }
    public void setPublisher(SocialPublisher publisher) {
        this.publisher=publisher;
    }
    public abstract void publish();
}
