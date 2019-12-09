import java.util.List;
import java.util.ArrayList;

/**
 * Representation of an SMS text message inbox.
 * @version 1.0
 */
public class TextMessage
{
    /**
     * Instance variable for the SMS text message inbox.
     */
    private List<String> inbox;

    /**
     * A constructor that creates a new TextMessage object which represents
     * an SMS text message inbox.
     */
    public TextMessage(List<String> messages)
    {
        inbox = messages;
    }

    /**
     * Adds the incoming SMS text message to the end of the inbox.
     *
     * @param textOfSMS  the content of the SMS text message 
     */
    public void addNewArrival(String textOfSMS)
    {
        inbox.add(textOfSMS);
    }

    /**
     * @return the number of SMS text messages in the inbox
     */
    public int messageCount()
    {
        return inbox.size();
    }

    /**
     * Retrieves the SMS text message at position i.
     *
     * @param i  the index of the SMS text message to be retrieved
     * @return the SMS text message at position i
     */
    public String getMessage(int i)
    {
        return inbox.get(i);
    }

    /**
     * Deletes the SMS text message at position i.
     *
     * @param i  the index of the SMS text message to be deleted
     */
    public void delete(int i)
    {
        inbox.remove(i);
    }

    /**
     * Clears all SMS text messages from the inbox.
     */
    public void clear()
    {
        inbox = new ArrayList<String>();
    }

    /**
     * Displays all SMS text messages to the output terminal.
     */
    public String toString()
    {
        String result = "";
        for (String item : inbox)
        {
            result += item + "\n";
        }
        return result;
    }
}



