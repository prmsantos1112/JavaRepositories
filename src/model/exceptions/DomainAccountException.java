package model.exceptions;

public class DomainAccountException extends RuntimeException {
	private static final long serialVersionUID = 1L;	
	
	public DomainAccountException(String msg) {
		super(msg);		
	}

}
