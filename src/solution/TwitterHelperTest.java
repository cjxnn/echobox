/**
 * @author Niannan Xue
 * All rights reserved.
 */

package solution;

//TODO: use JUnit to automate tests
public class TwitterHelperTest {
    public static void english(){
        String input = "echobox";
        int count = 7;
         
        assert count == TwitterHelper.getCount(input, false);
    }
     
    public static void russian(){
        String input = "Вам нравится эта квартира?";
        int count = 26;
         
        assert count == TwitterHelper.getCount(input, false);
    }
     
    public static void norwegian(){
        String input = "Hva liker du å gjøre?";
        int count = 21;
         
        assert count == TwitterHelper.getCount(input, false);
    }
     
    public static void persian(){
        String input = "خوش آمدید";
        int count = 9;
         
        assert count == TwitterHelper.getCount(input, false);
    }
     
    public static void korean(){
        String input = "저는 7년 동안 한국에서 살았어요";
        int count = 18;
         
        assert count == TwitterHelper.getCount(input, false);
    }
     
    public static void imageOnly(){
        String input = "";
        int count = 23;
         
        assert count == TwitterHelper.getCount(input, true);
    }
     
    public static void imageWithText(){
        String input = "Hello";
        int count = 28;
         
        assert count == TwitterHelper.getCount(input, true);
    }
    
    public static void urlOnly(){
        String input = "www.echobox.com";
        int count = 23;

        assert count == TwitterHelper.getCount(input, false);
    }
    
    public static void urlTextAndImage(){
        String input = "Former UNM law professor named FERC chair http://www.imperial.ac.uk";
        int count = 88;
        
        assert count == TwitterHelper.getCount(input, true);
    }
}