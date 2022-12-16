package vn.edu.usth.nutrition_recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//LA FRAME 6 NHUNG THAY BREAKFAST = DINNER
public class DinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);

        View bt = findViewById(R.id.arrow_total_dinner);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DinnerActivity.this, MainPageActivity.class));
            }
        });
    }
}