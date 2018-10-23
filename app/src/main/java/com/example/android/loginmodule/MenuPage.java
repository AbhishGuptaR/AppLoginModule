package com.example.android.loginmodule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);
    }

    public void menuSignUp(View view){
        Intent i = new Intent(MenuPage.this,SignUpPage.class);
        startActivity(i);
        MenuPage.this.finish();
    }

    public void menuSignIn(View view){
        Intent i = new Intent(MenuPage.this,SignInPage.class);
        startActivity(i);
        MenuPage.this.finish();
    }

}
