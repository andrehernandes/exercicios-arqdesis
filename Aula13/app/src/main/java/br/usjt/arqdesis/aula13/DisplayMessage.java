package br.usjt.arqdesis.aula13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        TextView textView = (TextView) findViewById(R.id.textView1);
        textView.setText(getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE));
        textView.setTextSize(32);
    }
}
