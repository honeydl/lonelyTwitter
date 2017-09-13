import java.util.Date;

import ca.ualberta.cs.lonelytwitter.Tweet;

/**
 * Created by donglin3 on 9/13/17.
 */

public class MoodGood extends CurrentMood{


        public MoodGood(String message){
            super(message);


        }
        public MoodGood(String message, Date date) {
            super(message, date);
        }


        @Override
        public Boolean isGood(){

            return Boolean.FALSE;

        }
    }

}
