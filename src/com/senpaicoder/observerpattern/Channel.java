package com.senpaicoder.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private List<Subscriber> subscribers = new ArrayList<>();
    String title;

    @Override
    public void subscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubsciber() {
        for (Subscriber subscriber : subscribers) {
            subscriber.updateInfoNewVideoReceived();
        }
    }

    @Override
    public void uploadVideo(String title) {
        this.title = title;
    }
}
