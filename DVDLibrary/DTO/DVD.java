/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;
/**
 * This class is the DVD class that contains 
 * getters and setters for each feature of the movie,
 * as well as a constructor to construct a new DVD variable.
 * @author Yi Yang
 *
 */
public class DVD {
    private String title;
    private int releaseDate;
    private String mpaaRating;
    private String directorsName;
    private String studio;
    private String viewerNotes;
    /**
     * Constructs a new DVD object given the title
     * @param title
     */
    public DVD(String title) {
        this.title = title;
    }
    /**
     * Returns the title
     * @return title
     */
    public String getTitle() {
        return title;
    }
    /**
     * Returns the release date
     * @return release date
     */
    public int getReleaseDate() {
        return releaseDate;
    }
    /**
     * Sets the release date
     * @param releaseDate
     */
    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
    /**
     * Returns the mpaa rating
     * @return mpaa rating
     */
    public String getMpaaRating() {
        return mpaaRating;
    }
    /**
     * Sets the mpaa rating
     * @param mpaaRating
     */
    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }
    /**
     * Returns the director's name
     * @return director's name
     */
    public String getDirectorsName() {
        return directorsName;
    }
    /**
     * Sets the director's name
     * @param directorsName
     */
    public void setDirectorsName(String directorsName) {
        this.directorsName = directorsName;
    }
    /**
     * Returns the studio name
     * @return studio
     */
    public String getStudio() {
        return studio;
    }
    /**
     * Sets the studio name
     * @param studio
     */
    public void setStudio(String studio) {
        this.studio = studio;
    }
    /**
     * Returns viewer notes
     * @return viewer notes
     */
    public String getViewerNotes() {
        return viewerNotes;
    }
    /**
     * Sets viewer notes
     * @param viewerNotes
     */
    public void setViewerNotes(String viewerNotes) {
        this.viewerNotes = viewerNotes;
    }    
}
