package com.batsandrey.mq;

import com.batsandrey.mq.config.MQConfig;
import com.batsandrey.mq.entity.CustomMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.MESSAGE_QUEUE)
    public void listener(CustomMessage message) {
        System.out.println(message);
    }
}
