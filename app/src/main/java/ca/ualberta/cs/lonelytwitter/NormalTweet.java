package ca.ualberta.cs.lonelytwitter; /**
 * Created by donglin3 on 9/12/17.
 */
import java.util.Date;


public class NormalTweet extends Tweet {
    public NormalTweet(String message){
        super(message);


    }
    public NormalTweet(String message, Date date) {
        super(message, date);
    }


    @Override
    public Boolean isImportant(){

        return Boolean.FALSE;

    }
}
