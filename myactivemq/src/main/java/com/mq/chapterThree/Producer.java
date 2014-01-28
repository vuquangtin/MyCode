/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012 All rights reserved. =============================
 */

package com.mq.chapterThree;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Session;

import org.apache.activemq.spring.ActiveMQConnectionFactory;

public class Producer
{
    public static void main(String[] args)
        throws JMSException
    {
        ConnectionFactory factory = new ActiveMQConnectionFactory();
        Connection connection = factory.createConnection();
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        MessageProducer producer = session.createProducer(null);

        Message message = session.createTextMessage("Hello World!");
        producer.send(message);
    }
}
