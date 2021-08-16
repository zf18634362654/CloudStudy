package com.stream.cloudstream.producer;

import com.stream.cloudstream.channel.MyProcesser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * @author zhaof
 * @date 2021/8/14 23:13
 */
@Component
@EnableBinding(MyProcesser.class)
public class SourceProcessor {

    private final Logger logger = LoggerFactory.getLogger(SourceProcessor.class);

    @Autowired
    private  MyProcesser myProcesser;


    public void send(String sourceMessage){

        logger.info("原始消息发送成功 {}",sourceMessage);
        myProcesser.sourceOutput().send(MessageBuilder.withPayload(sourceMessage).build());
    }
}
