package direction123.jokedisplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    public static String JOKE_KEY = "joke_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent = getIntent();
        String joke = intent.getStringExtra(JOKE_KEY);

        TextView jokeTextView = (TextView)findViewById(R.id.jokeTextView);
        if (joke != null && !joke.isEmpty()) {
            jokeTextView.setText(joke);
        } else {
            jokeTextView.setText(R.string.no_joke);
        }
    }
}
