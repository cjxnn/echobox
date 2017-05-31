/**
 * @author Niannan Xue
 * All rights reserved.
 */

package solution;

import java.text.Normalizer;
import java.util.regex.*;

//TODO: use twitter-text instead
public class TwitterHelper {
    // latest word count for wrapped links;
    private static final int linkLength = 23;
    
    // Image is represented as a link
    private static final int fileSize = linkLength;
    
    //regex for url
    //ToDo: need better regular expression for urls compliant with the twitter standard
    private static final String regex = "(@)?(href=')?(HREF=')?(HREF=\")?(href=\")?(http://)?[a-zA-Z_0-9\\-]+(\\.\\w[a-zA-Z_0-9\\-]+)+(/[#&\\n\\-=?\\+\\%/\\.\\w]+)?";
    
    public static int getCount(String stringToCount, boolean includesImage){
        //Normalize text via NFC
        stringToCount = Normalizer.normalize(stringToCount, Normalizer.Form.NFC);
        
        //remove links within text and count the number of links
        TextInfo result = removeLinks(stringToCount);
        
        //Conunt number of code points in text
        int count = stringToCount.codePointCount(0, result.textWithoutUrl.length());
        
        count += linkLength * result.noOfLinks;
        
        if (includesImage)
            count += fileSize;
        return count;
    }
    
    //remove urls within a text
    //return the number of links
    private static TextInfo removeLinks(String text){
        int numberOfLinks = 0;
        
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            numberOfLinks++;
        }
        
        //TODO: use Jave regex api to replace matches on the fly
        text = text.replaceAll(regex, "");
        
        return new TextInfo(numberOfLinks, text);
    }  
}