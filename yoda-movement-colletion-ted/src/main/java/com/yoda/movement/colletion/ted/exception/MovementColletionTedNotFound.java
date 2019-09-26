package com.yoda.movement.colletion.ted.exception;

public class MovementColletionTedNotFound extends Exception {
	
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MovementColletionTedNotFound(String msg){
        super(msg);
    }

    public MovementColletionTedNotFound(String msg, Throwable cause){
        super(msg, cause);
    }
    
}
