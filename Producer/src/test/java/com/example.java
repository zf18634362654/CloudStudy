package com;

import com.stream.cloudstream.CloudStreamApplication;
import com.stream.cloudstream.consumer.SmsAndEmailConsumer;
import com.stream.cloudstream.producer.MessageProducer;
import com.stream.cloudstream.producer.SourceProcessor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author zhaof
 * @date 2021/8/14 22:07
 */

@SpringBootTest(classes = {CloudStreamApplication.class})
public class example {


    @Autowired
    MessageProducer producer;

    @Autowired
    SourceProcessor producer2;

    @Autowired
    SmsAndEmailConsumer consumer;


    @Test
    public void testSend(){

        //producer.send("德玛西亚");
        //producer.send("我无敌你随意");
        producer2.send("13834882548|654736673@qq.com");
    }
}
