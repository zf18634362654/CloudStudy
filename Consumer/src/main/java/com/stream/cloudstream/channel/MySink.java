package com.stream.cloudstream.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author zhaof
 * @date 2021/8/14 22:46
 */
public interface MySink {

    String INPUT = "my_input";

    /**
     * @return input channel.
     */
    @Input(MySink.INPUT)
    SubscribableChannel input();
}
