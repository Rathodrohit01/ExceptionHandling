package com.sep05;

public class AgeTooLowException  extends RuntimeException{
	
	public AgeTooLowException()
{
	super();
}
public AgeTooLowException( String  s)
{
	super(s);
}

}