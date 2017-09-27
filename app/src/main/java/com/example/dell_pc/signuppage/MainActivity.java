package com.example.dell_pc.signuppage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void ClickFunction(View view){

        EditText userEditText = (EditText) findViewById(R.id.userEditText);
        Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
        startActivity(intent);
        Toast.makeText(this,"Hey there! " + userEditText.getText().toString(), Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
