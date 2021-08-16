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
 * @date 2021/8/14 23:21
 */

@Component
@EnableBinding(MyProcesser.class)
public class SmsAndEmailProducer {

    private final Logger logger = LoggerFactory.getLogger(SmsAndEmailProducer.class);
    @Autowired
    MyProcesser myProcesser;


    public void sendSmsMessage(String smsMessage){

        logger.info("短信服务调用成功 {}",smsMessage);
        myProcesser.smsOut().send(MessageBuilder.withPayload(smsMessage).build());

    }


    public void sendEmailMessage(String smsMessage){

        logger.info("邮箱服务调用成功 {}",smsMessage);
        myProcesser.emailOut().send(MessageBuilder.withPayload(smsMessage).build());

    }
}
