package vn.edu.usth.nutrition_recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

//ACTIVITY DAU APP
public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_login);


        View btn = findViewById(R.id.login);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });

        View btn1 = findViewById(R.id.signUp);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SignUpActivity.class));
            }
        });

        Log.i("Activity Lifecycle", "onCreate");

    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity Lifecycle", "onResume");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Activity Lifecycle", "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Activity Lifecycle", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Activity Lifecycle", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity Lifecycle", "onDestroy");
    }
}