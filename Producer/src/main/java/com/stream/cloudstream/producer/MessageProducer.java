package com.stream.cloudstream.producer;

import com.stream.cloudstream.channel.MySource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * @author zhaof
 * @date 2021/8/14 20:55
 */

@Component
@EnableBinding(MySource.class)
public class MessageProducer {

    @Autowired
    MySource source;

    @Autowired
    MySource source2;

    public void send(String message){
        source.output().send(MessageBuilder.withPayload(message).build());

    }



    public void send2(String message){
        source2.output().send(MessageBuilder.withPayload(message).build());

    }
}
