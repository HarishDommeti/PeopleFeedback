package com.example.harish.peoplefeedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {
    private ImageView imageViewGoogle;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        imageViewGoogle=findViewById(R.id.imgview_google);
        imageViewGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoHomeTabActivity();
            }
        });



    }
    private void gotoHomeTabActivity(){
        Intent intent=new Intent(LoginActivity.this,HomeTabActivity.class);
        startActivity(intent);
    }
}
