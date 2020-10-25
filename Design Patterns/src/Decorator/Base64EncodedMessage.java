/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import java.util.Base64;

/**
 *
 * @author tarek
 */



public class Base64EncodedMessage implements Message {

	private Message msg;
	
	public Base64EncodedMessage(Message msg) {
		this.msg = msg;
	}

	@Override
	public String getContent() {
		//Be wary of charset!! This is platform dependent..
		return Base64.getEncoder().encodeToString(msg.getContent().getBytes());
	}
	
	
}