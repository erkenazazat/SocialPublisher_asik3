package org.example.abstraction;

import org.example.implementor.SocialPublisher;

public class ImagePost extends SocialPost {
    private String caption;
    private String imageUrl;
    public ImagePost(SocialPublisher publisher, String caption, String imageUrl) {
        super(publisher);
        this.caption=caption;
        this.imageUrl=imageUrl;
    }
    @Override
    public void publish() {
        publisher.sendContent(caption, imageUrl);
    }
}
