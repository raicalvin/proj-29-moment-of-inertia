package com.a29moon.momentofinertia;

public class CalcItem {

    /** The title for the single calculator that will be displayed in list item */
    private String mNameOfCalculator;

    /** The description (if applicable) that will be displayed in the list item */
    private String mDescriptionOfCalculator;

    /** The resource for the thumbnail that will be displayed in the list item */
    private int mThumbnailID;

    /**
     * Constructor to take in name, description, and thumbnail of single calculator
     * @param nameOfCalculator
     * @param descriptionOfCalculator
     * @param thumbnailID
     */
    public CalcItem(String nameOfCalculator, String descriptionOfCalculator, int thumbnailID) {
        mNameOfCalculator = nameOfCalculator;
        mDescriptionOfCalculator = descriptionOfCalculator;
        mThumbnailID = thumbnailID;
    }

    /** Returns the name of the single calculator */
    public String getNameOfCalculator() {
        return mNameOfCalculator;
    }

    /** Returns the description of calculator */
    public String getDescriptionOfCalculator() {
        return mDescriptionOfCalculator;
    }

}
