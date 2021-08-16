package com.stream.cloudstream.consumer;

import com.stream.cloudstream.channel.MySink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @author zhaof
 * @date 2021/8/14 20:55
 */

@Component
@EnableBinding(MySink.class)
public class MessageConsumer {

    @Autowired
    MySink sink;

   @StreamListener(MySink.INPUT)
    public void receive(String message){
       System.out.println("message" + message);
    }
}
