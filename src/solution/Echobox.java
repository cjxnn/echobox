/**
 * @author Niannan Xue
 * All rights reserved.
 */

package solution;

public class Echobox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TwitterHelperTest.english();
        TwitterHelperTest.russian();
        TwitterHelperTest.norwegian();
        TwitterHelperTest.persian();
        TwitterHelperTest.korean();
        
        TwitterHelperTest.imageOnly();
        TwitterHelperTest.imageWithText();
        
        TwitterHelperTest.urlOnly();
        
        TwitterHelperTest.urlTextAndImage();
        
        //TODO: more combinations of text, url and images with urls in different formats
    }   
}