package com.example.davidkrief.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gigya.socialize.GSObject;
import com.gigya.socialize.android.GSAPI;
import com.gigya.socialize.android.GSPluginFragment;

public class SignUpScreenSetModeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen_set_mode);

/*

        GSObject params = new GSObject();
        params.put("screenSet", "Default-RegistrationLogin");
        params.put("startScreen", "gigya-register-screen");
        GSPluginFragment pluginFragment = GSPluginFragment.newInstance("accounts.screenSet", params);
        getSupportFragmentManager().beginTransaction().add(R.id.container, pluginFragment, "registration").commit();

*/


        GSObject params = new GSObject();
        params.put("screenSet", "Default-RegistrationLogin");
        params.put("startScreen", "gigya-register-screen");

       // GSAPI.getInstance().showPluginDialog("accounts.screenSet", params, null, null);





        GSPluginFragment pluginFragment = GSPluginFragment.newInstance("accounts.screenSet", params);
        getSupportFragmentManager().beginTransaction().add(R.id.container, pluginFragment, "screenSet").commit();
    }
}
