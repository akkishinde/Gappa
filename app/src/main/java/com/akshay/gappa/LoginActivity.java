package com.akshay.gappa;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class LoginActivity extends Activity {
    protected EditText mUserName;
    protected EditText mPassword;
    protected TextView mSignUp;
    protected ImageView mImageView;
    protected Button mSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mSignIn=(Button) findViewById(R.id.button);
        mUserName=(EditText)findViewById(R.id.editText);
        mPassword=(EditText)findViewById(R.id.editText2);
        mSignUp=(TextView)findViewById(R.id.register_here);
        mImageView=(ImageView)findViewById(R.id.imageView);

        //Custom font
        Typeface typeface = Typeface.createFromAsset(getAssets(),"Comic_White_Rabbit_.otf");
        mSignIn.setText("Sign In");
        mSignIn.setTypeface(typeface);
        mSignUp.setTypeface(typeface);

        mSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,SignupActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
