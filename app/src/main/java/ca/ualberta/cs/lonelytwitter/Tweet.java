package ca.ualberta.cs.lonelytwitter;


import java.util.Date;
import java.util.ArrayList;

/**
 * Created by donglin3 on 9/12/17.
 */

public abstract class Tweet {
    private String message;
    private Date date;
    private ArrayList<CurrentMood> moodsList = new ArrayList<CurrentMood>();


    public Tweet(String message) {
        this.message = message;
        this.date = new Date();

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

    public ArrayList CurrentMood() {
        return moodsList;
    }

    //setMood method , get helped from Yongjia Huang
    public void setMood(String input, Date date) {
        if (input == "good") {
            moodsList.add(new MoodGood(date));


        } else if (input == "Bad") {
            moodsList.add(new MoodBad(date));

        }
    }
}