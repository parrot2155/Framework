package com.test03;

import org.springframework.stereotype.Component;

@Component("lgTV")
public class LgTV implements TV{

	@Override
	public void powerOn() {
		System.out.println("lg tv power on");
		
	}

	@Override
	public void powerOff() {
		System.out.println("lg tv power off");
		
	}
	
}
