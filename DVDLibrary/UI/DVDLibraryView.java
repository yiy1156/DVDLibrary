/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DTO.DVD;
import java.util.*;
/**
 * This class will show all the messages that will print to the user when running
 * the application.
 * @author yiy1156
 *
 */
public class DVDLibraryView {
    private UserIO io;
    /**
     * Constructs a new DVDLibraryView object
     * @param io
     */
    public DVDLibraryView(UserIO io) {
        this.io = io;
    }
    
    /**
     * Prints out all the menu options to display
     * @return the option that is selected between 1-6
     */
    public int printMenuAndGetSelection() {
    	// show the menu options
        io.print("Main Menu");
        io.print("1. List All DVDs");
        io.print("2. Add a DVD");
        io.print("3. Remove a DVD");
        io.print("4. Edit a DVD Information");
        io.print("5. Search and View by DVD Title");
        io.print("6. Exit");

        return io.readInt("Please select from the above choices.", 1, 6);
    }
    /**
     * Asks and creates dvd objects with all the information needed, 
     * including title, release date, mpaa rating, studio, director, notes
     * @return a new DVD object with given information
     */
    public DVD getNewDvdInfo() {
    	// Ask users for all info needed for the dvd
        String dvdName = io.readString("Please enter DVD Title");
        int releaseDate = io.readInt("Please enter release date", 0, 2021);
        String mpaaRating = io.readString("Please enter the DVD's MPAA Rating");
        String studio = io.readString("Please enter the Studio");
        String directorsName = io.readString("Please enter the director");
        String viewerNotes = io.readString("Please enter your notes and/or rating");
        // Create new DVD object
        DVD currentDvd = new DVD(dvdName);
        currentDvd.setReleaseDate(releaseDate);
        currentDvd.setMpaaRating(mpaaRating);
        currentDvd.setStudio(studio);
        currentDvd.setDirectorsName(directorsName);
        currentDvd.setViewerNotes(viewerNotes);
        return currentDvd;
    }
    /**
     * Edits a dvd information if user choses to edit
     * @param dvd
     * @return Edited DVD object
     */
    public DVD getEditDvdInfo(DVD dvd) {
    	// Checks if that dvd exists to be edited
        if(dvd != null){
        	// Lets user rewrite all info of the dvd
            int releaseDate = io.readInt("Please enter release date", 0, 2021);
            String mpaaRating = io.readString("Please enter the DVD's MPAA Rating");
            String directorsName = io.readString("Please enter the director");
            String studio = io.readString("Please enter the Studio");
            String viewerNotes = io.readString("Please enter your notes and/or rating");
         
            dvd.setReleaseDate(releaseDate);
            dvd.setMpaaRating(mpaaRating);
            dvd.setStudio(studio);
            dvd.setDirectorsName(directorsName);
            dvd.setViewerNotes(viewerNotes);
        }
        // Lets user know if there's no dvd to be edited
        else{
            io.print("No such DVD.");
        }    
        return dvd;
    }
    /**
     * Displays the list of dvds stored in library
     * @param dvdList
     */
    public void displayDvdList(List<DVD> dvdList) {
        
        for (DVD currentDvd : dvdList) {
            io.print(currentDvd.getTitle() + ": "
                    + currentDvd.getReleaseDate() + " "
                    + currentDvd.getMpaaRating()  + " "
                    + currentDvd.getStudio()      + " "
                    + currentDvd.getDirectorsName()+ " "
                    + currentDvd.getViewerNotes());
        }
        io.readString("Please hit enter to continue.");
    }
    /**
     * Displays single dvd's information
     * @param dvd
     */
    public void displayDvd(DVD dvd) {
        if (dvd != null) {
            io.print( dvd.getTitle() + ": "
                    + dvd.getReleaseDate() + " "
                    + dvd.getMpaaRating()  + " "
                    + dvd.getStudio()      + " "
                    + dvd.getDirectorsName()+ " "
                    + dvd.getViewerNotes());
        } else {
            io.print("No such DVD.");
        }
        
        io.readString("Please hit enter to continue.");
    }
   /**
    * Message to be printed out when displaying all dvd
    */
    public void displayListAllDvdsBanner() {
        io.print("=== DVD Collection ===");
    }
    /**
     * Message to be printed out when adding dvd
     */
    public void displayAddDvdBanner() {
        io.print("=== Add DVD ===");
    }
    /**
     * Message to be printed out after successfully added a dvd
     */
    public void displayAddDvdSuccessBanner() {
        io.readString("DVD successfully added. Hit enter to continue");
    }
    /**
     * Message to be printed out after removing a dvd
     */
    public void displayRemoveDvdBanner() {
        io.print("=== Remove DVD ===");
    }
    /**
     * Asks for DVD title
     * @return Title of dvd
     */
    public String getDvdTitleChoice() {
        return io.readString("Please enter the DVD Title.");
    }
    /**
     * Message to be printed out after successfully removed a dvd
     */
    public void displayRemoveDvdSuccessBanner() {
        io.readString("DVD successfully removed. Hit enter to continue");
    }
    /**
     * Message to be printed out asking which dvd to be edited
     */
    public void displayEditDvdBanner() {
        io.readString("Enter the DVD you wish to edit. Hit enter to continue");
    }
    /**
     * Message to be printed out after successfully edited a dvd
     */
    public void displayEditDvdSuccessBanner() {
        io.readString("DVD succcessfully edited. Hit enter to continue");
    }
    /**
     * Message to be printed out when searching for dvd
     */
    public void displaySearchDvdByNameBanner() {
        io.print("=== Search DVD By Name ===");
    }
    /**
     * Message to be printed out prompting user to continue
     */
    public void displayPromptToContinueBanner() {
        io.print("Please hit enter to continue.");
    }
    /**
     * Message to be printed out when user exits
     */
    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }
    /**
     * Message to be printed out when unknown command is entered
     */
    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }
    /**
     * Shows the error message
     * @param errorMsg
     */
    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }
    
}
