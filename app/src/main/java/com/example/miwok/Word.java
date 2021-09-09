package com.example.miwok;

import android.widget.ImageView;

public class Word {


    /**
     * {@link Word} represents a vocabulary word that the user wants to learn.
     * It contains a default translation and a Miwok translation for that word.
     */


        /** Default translation for the word */
        private String mDefaultTranslation;

        /** Miwok translation for the word */
        private String mMiwokTranslation;

        private int mImageResourceId = NO_IMAGE_PROVIDED;
        public static final int NO_IMAGE_PROVIDED = -1;

        /**
         * Create a new Word object.
         *
         * @param defaultTranslation is the word in a language that the user is already familiar with
         *                           (such as English)
         * @param miwokTranslation is the word in the Miwok language

         */
        public Word(String defaultTranslation, String miwokTranslation) {
            mDefaultTranslation = defaultTranslation;
            mMiwokTranslation = miwokTranslation;
        }
        public Word(String defaultTranslation , String miwokTransaltion , int image){
            mDefaultTranslation = defaultTranslation;
            mMiwokTranslation = miwokTransaltion;
            mImageResourceId = image;
        }

        /**
         * Get the default translation of the word.
         */
        public String getDefaultTranslation() {
            return mDefaultTranslation;
        }

        /**
         * Get the Miwok translation of the word.
         */
        public String getMiwokTranslation() {
            return mMiwokTranslation;
        }


        public int getImageResourceId(){
            return mImageResourceId;
        }

    /**
     * This will get the status of the image
     */

    public boolean hasImage()
    {
        return mImageResourceId!=NO_IMAGE_PROVIDED;
    }


}
