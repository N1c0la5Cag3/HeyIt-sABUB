
import static jdk.nashorn.internal.objects.NativeString.indexOf;
public class text {
    //declare variables
    int pos;
    String text;

    /**
     * this is the constructor
     * pre: iText, iHtmlText 
     * post: constructed paragraph or header
     */
    public text(String iText, String iHtmlText) {
        //set variables
        boolean underlined = false;
        boolean bold = false;
        int header = 0;
        
        text = iText;
        String htmlText = iHtmlText;
        //find position 
        pos = getPosition(text, htmlText);
    }

    /**
     * this method finds the position of the paragraph or header relative to the entire html code
     * pre: text, htmlText
     * post: position 
     */
    public int getPosition(String text, String htmlText) {
        int position = indexOf(htmlText, text); //set the position to the index of the paragraph or header in the html code
        return position;
    }

    /**
     * this method sets the position to the number inputed
     * pre: position 
     * post: new position
     */
    public void setPosition(int position) {
        pos = position;
    }

    /**
     * this method returns the text of the paragraph or header
     * post: returns text 
     */
    public String returnText() {
        return text;
    }

    /**
     * this method returns the position of the paragraph or header relative to the entire html code
     * post: returns pos 
     */
    public int returnPosition() {
        return pos;
    }
}
