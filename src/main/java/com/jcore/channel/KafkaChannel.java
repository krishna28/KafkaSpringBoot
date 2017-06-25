package com.jcore.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.SubscribableChannel;

public interface KafkaChannel extends Sink,Source{
	
	String PATRON = "patron";
	String VOUCHER = "voucher";
	String VOUCHERTYPE = "vouchertype";
	
	@Input(KafkaChannel.PATRON)
    SubscribableChannel patron();
	
	@Input(KafkaChannel.VOUCHER)
    SubscribableChannel voucher();
	
	
	@Input(KafkaChannel.VOUCHERTYPE)
    SubscribableChannel vouchertype();	

}
