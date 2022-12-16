package vn.edu.usth.nutrition_recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

//DAY LA FRAME 6
public class BreakfastActivity extends AppCompatActivity {

    SearchView searchView;
    ListView listView;
    Button button;

    String[] nameList = {"Salad","Eggs","BanhMi","Milk","Cacao"};
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);



        searchView = findViewById(R.id.search_breakfast);
        listView = findViewById(R.id.list_item);
        button = findViewById(R.id.salad_nutrition);

        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,nameList);
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(BreakfastActivity.this, "You Click -"+adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
                button.setVisibility(View.VISIBLE);
                listView.setVisibility(View.INVISIBLE);
            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                BreakfastActivity.this.arrayAdapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                BreakfastActivity.this.arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });



        View bt = findViewById(R.id.arrow_total_breakfast);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BreakfastActivity.this, MainPageActivity.class));
            }
        });
    }
}