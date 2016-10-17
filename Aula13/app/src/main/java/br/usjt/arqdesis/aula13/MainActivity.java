package br.usjt.arqdesis.aula13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     public void sendMessage(View v) {
         Intent intent = new Intent(this, DisplayMessage.class);
         EditText editText = (EditText) findViewById(R.id.editText1);
         intent.putExtra(EXTRA_MESSAGE, editText.getText().toString());
         startActivity(intent);
     }
}
