package com.stream.cloudstream.consumer;

import com.stream.cloudstream.channel.MyProcesser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * @author zhaof
 * @date 2021/8/14 23:29
 */

@EnableBinding(MyProcesser.class)
public class SmsAndEmailConsumer {

    private final Logger logger = LoggerFactory.getLogger(SmsAndEmailConsumer.class);

    @StreamListener(MyProcesser.SMS_MESSAGE)
    public void receiveSms(String message){
        logger.info("发送短信成功{}",message);
    }



    @StreamListener(MyProcesser.EMAIL_MESSAGE)
    public void receiveEmail(String message){
        logger.info("发送邮件成功{}",message);
    }
}
