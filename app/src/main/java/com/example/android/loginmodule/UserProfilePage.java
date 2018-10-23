package com.example.android.loginmodule;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class UserProfilePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setTitle("Profile");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile_page);

        TextView email = (TextView) findViewById(R.id.profileemail);
        TextView pass = (TextView) findViewById(R.id.profilepassword);

        Bundle extras = getIntent().getExtras();

        email.setText(extras.getString("Email"));
        pass.setText(extras.getString("Pass"));

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_profile_page,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem){
        if (menuItem.getItemId()==R.id.logout){
            startActivity(new Intent(this,MenuPage.class));
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

}
