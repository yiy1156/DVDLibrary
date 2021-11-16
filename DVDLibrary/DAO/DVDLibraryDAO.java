/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DTO.DVD;
import java.util.*;

/**
 * This interface provides all methods needed to be implemented in DVDLibraryDAOImpl
 * @author yiy1156
 *
 */
public interface DVDLibraryDAO {
    
    /**
     * Returns list of all dvds in the library. 
     * @return DVD list containing all the library in the library
     * @throws DVDLibraryDAOException
     */
    List<DVD> getAllDvds() throws DVDLibraryDAOException;
    
    /**
     * Adds dvd to the library and associates it with the given title.
     * If there is one already with that name, that title will be returned,
     * otherwise returns null
     * @param dvdTitle dvd's associated title
     * @param dvd the dvd to be added
     * @return The DVD object with the title if it exists, null otherwise
     * @throws DVDLibraryDAOException
     */
    DVD addDvd(String dvdTitle, DVD dvd) throws DVDLibraryDAOException;
    
    /**
     * Removes the dvd that has the associated title.
     * Returns the title that is removed, null if there is none to be removed.
     * @param dvdTitle the title that dvd is associated with
     * @return removed dvd title, null if there is no title that matches to be removed.
     * @throws DVDLibraryDAOException
     */
    DVD removeDvd(String dvdTitle) throws DVDLibraryDAOException;
    
    /**
     * Returns the DVD object with that title,
     * null if none exists.
     * @param dvdTitle the title of the dvd
     * @return the DVD object with that title, if none exists, null
     * @throws DVDLibraryDAOException
     */
    DVD getDvd(String dvdTitle) throws DVDLibraryDAOException;
    
}

