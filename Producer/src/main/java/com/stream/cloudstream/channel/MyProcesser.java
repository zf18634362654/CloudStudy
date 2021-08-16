package com.stream.cloudstream.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author zhaof
 * @date 2021/8/14 23:09
 */
public interface MyProcesser {


    String SOURCE_MESSAGE = "source";

    String SMS_MESSAGE = "sms.message";

    String EMAIL_MESSAGE  = "email.message";

    @Output(SOURCE_MESSAGE)
    MessageChannel sourceOutput();

    @Input(SMS_MESSAGE)
    SubscribableChannel smsInput();

    @Input(EMAIL_MESSAGE)
    SubscribableChannel emailInput();
}
