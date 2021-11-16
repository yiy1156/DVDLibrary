/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DVDLibraryDAO;
import DAO.DVDLibraryDAOException;
import DTO.DVD;
import UI.DVDLibraryView;
import java.util.*;

/**
 * This class is the controller, it controls the menu, as well as
 * implementing different methods for different options.
 * This program allows 5 different features for users to interact with the dvd library
 * @author yiy1156
 *
 */
public class DVDLibraryController {

    private DVDLibraryView view;
    private DVDLibraryDAO dao;
    /**
     * Constructs a new DVDLibraryController object
     * @param dao DVDLibraryDAO object
     * @param view DVDLibraryView object
     */
    public DVDLibraryController(DVDLibraryDAO dao, DVDLibraryView view) {
        this.dao = dao;
        this.view = view;
    }
    /**
     * Creates a loop that will execute different features
     * when a menu option is selected
     */
    public void run() {
        
        boolean keepGoing = true;
        int menuSelection = 0;
        
        try {
            while (keepGoing) {

                menuSelection = getMenuSelection();
                
                switch (menuSelection) {
                    case 1:
                        listDvds();
                        break;
                    case 2:
                        addDvd();
                        break;
                    case 3:
                        removeDvd();
                        break;
                    case 4:
                        editDvd(); 
                        break;
                    case 5:
                        searchAndViewDvd();
                        break;
                    case 6:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }

            }
            exitMessage();
        } catch (DVDLibraryDAOException e) {
	        view.displayErrorMessage(e.getMessage());
	    }
    }
    /**
     * Takes the menu option selected
     * @return the number selected
     */
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    /**
     * Displays dvd list
     * @throws DVDLibraryDAOException
     */
    private void listDvds() throws DVDLibraryDAOException{
        view.displayListAllDvdsBanner();
        List<DVD> dvdList = dao.getAllDvds(); 
        view.displayDvdList(dvdList);
    }
    /**
     * Adds new dvd
     * @throws DVDLibraryDAOException
     */
    private void addDvd() throws DVDLibraryDAOException{
        view.displayAddDvdBanner();
        DVD newDvd = view.getNewDvdInfo();
        dao.addDvd(newDvd.getTitle(), newDvd); 
        view.displayAddDvdSuccessBanner();
    }
    /**
     * Removes dvd in list
     * @throws DVDLibraryDAOException
     */
    private void removeDvd() throws DVDLibraryDAOException{
        view.displayRemoveDvdBanner();
        String dvdTitle = view.getDvdTitleChoice();
        dao.removeDvd(dvdTitle);
        view.displayRemoveDvdSuccessBanner();
    }
    /**
     * Edits dvd info
     * @throws DVDLibraryDAOException
     */
    private void editDvd() throws DVDLibraryDAOException{
        view.displayEditDvdBanner();
        String dvdTitle = view.getDvdTitleChoice();
        DVD dvd = dao.getDvd(dvdTitle);
        view.getEditDvdInfo(dvd);
        dao.addDvd(dvdTitle, dvd);
        view.displayEditDvdSuccessBanner();
    }
    /**
     * Searches for a specific dvd, and displays it
     * @throws DVDLibraryDAOException
     */
    private void searchAndViewDvd() throws DVDLibraryDAOException{
        view.displaySearchDvdByNameBanner();
        String dvdTitle = view.getDvdTitleChoice();
        DVD dvd = dao.getDvd(dvdTitle);
        view.displayDvd(dvd);
    }
    /**
     * Displays unknown command message if it is not a menu option
     */
    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }
    /**
     * Displays exit message when user decides to exit
     */
    private void exitMessage() {
        view.displayExitBanner();
    }
}
