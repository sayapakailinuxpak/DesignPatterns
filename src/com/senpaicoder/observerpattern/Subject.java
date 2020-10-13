package com.senpaicoder.observerpattern;

public interface Subject {
    void subscriber(Subscriber subscriber);
    void unsubscriber(Subscriber subscriber);
    void notifySubsciber();
    void uploadVideo(String title);
}
