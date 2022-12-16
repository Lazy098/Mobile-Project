package vn.edu.usth.nutrition_recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//DAY LA FRAME 5
public class MenuChoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_choice);

        View back_btn = findViewById(R.id.arrow_btn_frame_5);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuChoiceActivity.this, MainPageActivity.class));
            }
        });

        View setting_btn = findViewById(R.id.settings);
        setting_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuChoiceActivity.this, SettingsActivity.class));
            }
        });

        View helps_btn = findViewById(R.id.helps);
        helps_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuChoiceActivity.this, HelpsActivity.class));
            }
        });

        View total_nutritions_btn = findViewById(R.id.total_nutritions);
        total_nutritions_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuChoiceActivity.this, TotalNutritionActivity.class));
            }
        });

        View logout_btn = findViewById(R.id.logout);
        logout_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuChoiceActivity.this, MainActivity.class));
            }
        });
    }
}