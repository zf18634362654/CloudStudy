package com.stream.cloudstream.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author zhaof
 * @date 2021/8/14 22:48
 */
public interface MySource2 {


    String OUTPUT = "hello";

    /**
     * @return output channel
     */
    @Output(MySource2.OUTPUT)
    MessageChannel output();
}
