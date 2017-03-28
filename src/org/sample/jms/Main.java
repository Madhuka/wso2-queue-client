package org.sample.jms;

import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.naming.NamingException;


public class Main {
	private static String fileName;
	
	public static void main(String[] args) throws NamingException, JMSException {
		fileName = args[0];
        //SampleQueueReceiver queueReceiver = new SampleQueueReceiver();
        //MessageConsumer consumer = queueReceiver.registerSubscriber();
        SampleQueueSender queueSender = new SampleQueueSender();
        queueSender.sendMessages(fileName);
        //queueReceiver.receiveMessages(consumer);

    }

}









