package vn.edu.usth.nutrition_recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//DAY LA FRAME 4
public class MainPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        View breakfast_btn = findViewById(R.id.breakfast);
        breakfast_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPageActivity.this, TotalBreakfastActivity.class));
            }
        });
        View add_breakfast_btn = findViewById(R.id.add_food_breakfast);
        add_breakfast_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPageActivity.this, BreakfastActivity.class));
            }
        });


        View lunch_btn = findViewById(R.id.lunch);
        lunch_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPageActivity.this, TotalLunchActivity.class));
            }
        });
        View add_lunch_btn = findViewById(R.id.add_food_lunch);
        add_lunch_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPageActivity.this, LunchActivity.class));
            }
        });

        View dinner_btn = findViewById(R.id.dinner);
        dinner_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPageActivity.this, TotalDinnerActivity.class));
            }
        });
        View add_dinner_btn = findViewById(R.id.add_food_dinner);
        add_dinner_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPageActivity.this, DinnerActivity.class));
            }
        });

        View snacks_btn = findViewById(R.id.snacks);
        snacks_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPageActivity.this, TotalSnacksActivity.class));
            }
        });
        View add_snacks_btn = findViewById(R.id.add_food_snacks);
        add_snacks_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPageActivity.this, SnackActivity.class));
            }
        });


        View menubtn = findViewById(R.id.menu_btn);
        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPageActivity.this, MenuChoiceActivity.class));
            }
        });
    }


}