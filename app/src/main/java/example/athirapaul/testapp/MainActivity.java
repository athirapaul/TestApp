package example.athirapaul.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView;
        Button button1;
        textView = (TextView)findViewById(R.id.textView);
        button1 = (Button)findViewById(R.id.button1);

    }
}
