package com.senpaicoder.observerpattern;

public interface Obs {
    void updateInfoNewVideoReceived();
    void subscribeChannel(Channel channel);
}
