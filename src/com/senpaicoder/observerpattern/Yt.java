package com.senpaicoder.observerpattern;

public class Yt {
    public static void main(String[] args) {
        Subscriber subscriber1 = new Subscriber("Eldis");
        Subscriber subscriber2 = new Subscriber("Jinan");
        Subscriber subscriber3 = new Subscriber("Oniel");

        Channel channel = new Channel();
        channel.subscriber(subscriber1); // Subject get observe
        channel.subscriber(subscriber2);
        channel.subscriber(subscriber3);

        subscriber1.subscribeChannel(channel); //Observer observe the subject
        subscriber2.subscribeChannel(channel);


        channel.uploadVideo("Oi Oi Oi");
        channel.notifySubsciber();
    }
}
