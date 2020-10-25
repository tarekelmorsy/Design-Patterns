/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author tarek
 */


public class TextMessage implements Message {

	private String msg;
	
	public TextMessage(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String getContent() {
		return msg;
	}
}