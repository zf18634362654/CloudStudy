package com.stream.cloudstream.consumer;

import com.stream.cloudstream.channel.MyProcesser;
import com.stream.cloudstream.producer.SmsAndEmailProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;



/**
 * @author zhaof
 * @date 2021/8/14 23:18
 */
@Component
@EnableBinding(MyProcesser.class)
public class SourceConsumer {

    private final Logger logger = LoggerFactory.getLogger(SourceConsumer.class);

    @Autowired
    SmsAndEmailProducer producer;

    @StreamListener(MyProcesser.SOURCE_MESSAGE)
    public void  receive(String message){

        logger.info("收到原始消息 [{}]",message);

        //发送短信
        producer.sendSmsMessage(message.split("\\|")[0]);
        //发送email
        producer.sendEmailMessage(message.split("\\|")[1]);
    }


}
