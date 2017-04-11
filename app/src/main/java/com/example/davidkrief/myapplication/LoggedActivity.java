package com.example.davidkrief.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.gigya.socialize.GSObject;
import com.gigya.socialize.GSResponse;
import com.gigya.socialize.GSResponseListener;
import com.gigya.socialize.android.GSAPI;

public class LoggedActivity extends AppCompatActivity {

    private TextView userStatus;
    private Button logoutButton;
    public static LoggedActivity ma;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        ma = this;
        // Gigya
        logoutButton = (Button) findViewById(R.id.logoutButton);
        userStatus = (TextView) findViewById(R.id.userStatus);
        userStatus.setText("");

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        userStatus.setText("Logged as "+message);


        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GSAPI.getInstance().logout();
            }
        });







/*
        // Step 1 - Defining request parameters
        GSObject paramss = new GSObject();

        paramss.put("UID", "2531f77cf4da4d9c83532bb959dcd728");
        paramss.put("newPassword", "bbbbbB");
        paramss.put("password", "aaaaaA");

        GSResponseListener ressListener;



        ressListener = new GSResponseListener() {
            @Override
            public void onGSResponse(String method, GSResponse response, Object context) {
                try {
                    Log.d("ef", response.toString());
                    if (response.getErrorCode()==0) { // SUCCESS! response status = OK
                        System.out.println("Success in setStatus operation.");
                        Toast.makeText(getApplicationContext(), "An email regarding your password change has been sent to your email address.",
                                Toast.LENGTH_LONG).show();

                    } else {  // Error
                        System.out.println("Got error on setStatus: " + response.getLog());
                        Toast.makeText(getApplicationContext(), (String) response.getErrorMessage(),
                                Toast.LENGTH_LONG).show();
                    }
                } catch (Exception ex) {  ex.printStackTrace();  }
            }
        };

        String methoddName = "accounts.setAccountInfo";
        GSAPI.getInstance().sendRequest(methoddName, paramss, ressListener, null);*/

    }


}
