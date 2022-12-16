package vn.edu.usth.nutrition_recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
//DAY LA FRAME 10 NHUNG THAY BREAKFAST = LUNCH

public class TotalLunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_lunch);

        View btns = findViewById(R.id.arrow_total_lunch);
        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TotalLunchActivity.this, MainPageActivity.class));
            }
        });
    }
}