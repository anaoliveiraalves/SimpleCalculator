package it.isec.ami.testfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        text = findViewById(R.id.textView);
        Intent intent = getIntent();
        text.setText(text.getText() + intent.getStringExtra("message_key"));
    }
}