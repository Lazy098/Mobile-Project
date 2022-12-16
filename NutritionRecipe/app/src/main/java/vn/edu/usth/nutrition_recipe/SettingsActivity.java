package vn.edu.usth.nutrition_recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//DAY LA FRAME 9
public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        View backbtn = findViewById(R.id.arrow_btn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SettingsActivity.this, MenuChoiceActivity.class));
            }
        });

        View about_us_btn = findViewById(R.id.aboutus);
        about_us_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SettingsActivity.this, AboutUsActivity.class));
            }
        });

        View comtact_btn = findViewById(R.id.contact);
        comtact_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SettingsActivity.this, ContactActivity.class));
            }
        });

        View feed_back_btn = findViewById(R.id.feedback);
        feed_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SettingsActivity.this, FeedbackActivity.class));
            }
        });

        View credits_btn = findViewById(R.id.credits);
        credits_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SettingsActivity.this, CreditActivity.class));
            }
        });
    }
}