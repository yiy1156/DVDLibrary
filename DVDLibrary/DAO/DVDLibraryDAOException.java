/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
/**
 * This class defines the DVDLibraryDAOException and the error message
 * @author yiy1156
 *
 */
public class DVDLibraryDAOException extends Exception {
    
	private static final long serialVersionUID = 1L;
	/**
	 * Constructs a new DVDLibraryDAOException given message
	 * @param message
	 */
	public DVDLibraryDAOException(String message) {
        super(message);
    }
	/**
	 * 
	 * Constructs a new DVDLibraryDAOException given message and cause
	 * @param message
	 * @param cause
	 */
    public DVDLibraryDAOException(String message, Throwable cause) {
        super(message, cause);
    }
}
