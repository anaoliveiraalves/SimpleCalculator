package it.isec.ami.testfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText op1, op2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        op1 = findViewById(R.id.editText1);
        op2 = findViewById(R.id.editText2);
        result = findViewById(R.id.result);
    }
    public void sum(View v){
        Float value = new Float(0.0);
        try{
            value = Float.parseFloat(op1.getText().toString()) + Float.parseFloat(op2.getText().toString());
        }catch (NumberFormatException e){
            Toast.makeText(getApplicationContext(),"invalid numbers", Toast.LENGTH_LONG).show();
        }

        result.setText(value.toString());

    }
    public void subtract(View v){
        Float value = new Float(0.0);
        try{
            value = Float.parseFloat(op1.getText().toString()) - Float.parseFloat(op2.getText().toString());
        }catch (NumberFormatException e){
            Toast.makeText(getApplicationContext(),"invalid numbers", Toast.LENGTH_LONG).show();
        }

        result.setText(value.toString());

    }
    public void multiply(View v){
        Float value = new Float(0.0);
        try{
            value = Float.parseFloat(op1.getText().toString()) * Float.parseFloat(op2.getText().toString());
        }catch (NumberFormatException e){
            Toast.makeText(getApplicationContext(),"invalid numbers", Toast.LENGTH_LONG).show();
        }

        result.setText(value.toString());

    }
    public void divide(View v){
        Float value = new Float(0.0);
        try{
            value = Float.parseFloat(op1.getText().toString()) / Float.parseFloat(op2.getText().toString());
        }catch (NumberFormatException e){
            Toast.makeText(getApplicationContext(),"invalid numbers", Toast.LENGTH_LONG).show();
        }catch (ArithmeticException e){
            Toast.makeText(getApplicationContext(),"invalid denominator", Toast.LENGTH_LONG).show();
        }

        result.setText(value.toString());

    }

    public void getInfo(View v){
        Intent intent = new Intent(getApplicationContext(), InfoActivity.class);
        intent.putExtra("message_key", result.getText().toString());
        startActivity(intent);
    }
}
