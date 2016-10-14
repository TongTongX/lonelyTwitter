package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {
    private TextView tweetText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        tweetText = (TextView) findViewById(R.id.new_tweet_text);
        Intent intent = getIntent();
        String msg = intent.getStringExtra(LonelyTwitterActivity.EXTRA_MESSAGE);
        tweetText.setText(msg);

    }
}