package com.alterbliss.wganz.testemailproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextEmail;
    private EditText editTextSubject;
    private EditText editTextMessage;

    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmail = (EditText)findViewById(R.id.editTextEmail);
        editTextSubject = (EditText)findViewById(R.id.editTextSubject);
        editTextMessage = (EditText)findViewById(R.id.editTextMessage);

        btnSend = (Button)findViewById(R.id.btnSend);

        btnSend.setOnClickListener(this);


    }

    private void sendEmail(){
        String email = editTextEmail.getText().toString();
        String subject = editTextSubject.getText().toString();
        String message = editTextMessage.getText().toString();

        SendMail sm = new SendMail(this, email, subject, message);

        sm.execute();
    }

    public void onClick(View v){
        sendEmail();
    }
}
