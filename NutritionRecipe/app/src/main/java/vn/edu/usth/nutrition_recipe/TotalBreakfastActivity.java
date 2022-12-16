package vn.edu.usth.nutrition_recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//DAY LA FRAME 10
public class TotalBreakfastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_breakfast);

        View btn = findViewById(R.id.arrow_total_breakfast);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TotalBreakfastActivity.this, MainPageActivity.class));
            }
        });
    }
}