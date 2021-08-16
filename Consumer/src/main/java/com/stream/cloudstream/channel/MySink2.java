package com.stream.cloudstream.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author zhaof
 * @date 2021/8/14 22:46
 * @description 没有配置yml  约定大于配置
 */
public interface MySink2 {

    String INPUT = "hello";

    /**
     * @return input channel.
     */
    @Input(MySink2.INPUT)
    SubscribableChannel input();
}
