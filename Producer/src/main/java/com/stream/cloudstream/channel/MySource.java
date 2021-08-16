package com.stream.cloudstream.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author zhaof
 * @date 2021/8/14 22:48
 */
public interface MySource {


    String OUTPUT = "my_output";

    /**
     * @return output channel
     */
    @Output(MySource.OUTPUT)
    MessageChannel output();
}
