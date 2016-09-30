package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by TongTong on 29/09/2016.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testDelete() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        list.delete(tweet);
        assertFalse(list.hasTweet(tweet));
    }

    public void testGetTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.addTweet(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
    }

    public void testHasTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        assertTrue(list.hasTweet(tweet));
    }
}
