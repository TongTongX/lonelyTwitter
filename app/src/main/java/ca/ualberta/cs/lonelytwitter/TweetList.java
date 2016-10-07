package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by TongTong on 29/09/2016.
 */
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    /**
     * Instantiates a new Tweet list.
     */
    public TweetList() {

    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }

    // code taken from http://stackoverflow.com/questions/5207029/how-to-sort-a-list-of-objects-by-their-date-java-collections-listobject
    public ArrayList<Tweet> getTweets() {
        Collections.sort(tweets, new Comparator<Tweet>() {
            public int compare(Tweet t1, Tweet t2) {
                return t1.getDate().compareTo(t2.getDate());
            }
        });
        return tweets;
    }

    public int getCount() {
        return tweets.size();
    }

    /**
     * Has tweet boolean.
     *
     * @param tweet the tweet
     * @return the boolean
     */
    public boolean hasTweet(Tweet tweet){
        for (Tweet t : tweets) {
            if (t.equals(tweet)) {
                return true;
            }
        }
        return tweets.contains(tweet);
    }

    /**
     * Add tweet.
     *
     * @param tweet the tweet
     */
    public void addTweet(Tweet tweet) {
        if (tweets.contains(tweet)) {
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);
    }

    /**
     * Delete.
     *
     * @param tweet the tweet
     */
    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }
}
