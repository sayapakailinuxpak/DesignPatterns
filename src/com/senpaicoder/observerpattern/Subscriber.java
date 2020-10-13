package com.senpaicoder.observerpattern;

public class Subscriber implements Obs {
    private String name;
    Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }


    //invoked automatically if observer already subs to Subject
    @Override
    public void updateInfoNewVideoReceived() {
        System.out.println("Hey " + name + ", New video : " + channel.title);
    }

    @Override
    public void subscribeChannel(Channel channel) {
        this.channel = channel;
    }
}
