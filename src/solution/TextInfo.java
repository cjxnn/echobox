/**
 * @author Niannan Xue
 * All rights reserved.
 */

package solution;

public class TextInfo {
    public final int noOfLinks;
    public final String textWithoutUrl;
        
    public TextInfo(int numberOfLinks, String editedText){
        noOfLinks = numberOfLinks;
        textWithoutUrl = editedText;
    }
}