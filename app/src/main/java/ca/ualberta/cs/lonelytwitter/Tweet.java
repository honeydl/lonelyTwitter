package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by donglin3 on 9/12/17.
 */

public abstract class Tweet {
    private String message;
    private Date date;
    private ArrayList<mood> moods = new ArrayList<mood>();



    public Tweet(String message){
        this.message = message;
        this.date= new Date();

    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetsTooLongException {
        if (message.length() > 140) {
            throw new TweetsTooLongException();
        } else {


            this.message = message;
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract Boolean isImportant();

    public ArrayList Moods(){
        return moods;
    }




}



