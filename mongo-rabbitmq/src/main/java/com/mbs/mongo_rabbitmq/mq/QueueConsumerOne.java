package com.mbs.mongo_rabbitmq.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class QueueConsumerOne {
    @RabbitListener(queues = {"${queue.name.one}"})
    public void receive(@Payload String fileBody) {
        System.out.println("Message " + fileBody);
    }

}
