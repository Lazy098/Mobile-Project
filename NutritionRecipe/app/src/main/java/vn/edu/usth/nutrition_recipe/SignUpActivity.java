package vn.edu.usth.nutrition_recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Calendar;
import java.sql.SQLException;
//DAY LA FRAME 24

public class SignUpActivity extends AppCompatActivity {

    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    Button alert;
//    String classs = "com.mysql.jdbc.Driver";
//    String url="jdbc://localhost/huy";
//    String un="root";
//    String password="";

//    ResultSet rs;
//    Statement st;
//    ResultSetMetaData rsmd;
    Connection connect;
    String ConnectionResult="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        mDisplayDate = (TextView) findViewById(R.id.datePickerButton);

        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        SignUpActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d("SignUpActivity", "onDateSet: mm/dd/yyy: " + month + "/" + day + "/" + year);

                String date = month + "/" + day + "/" + year;
                mDisplayDate.setText(date);
            }
        };

        Spinner spin = (Spinner) findViewById(R.id.planets_spinner);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(SignUpActivity.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.sex));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(myAdapter);

        View btn = findViewById(R.id.enter_sign_up);
//
//
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
//                switch(view.getId()){
//                    case R.id.enter_sign_up:
//                        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
//                        StrictMode.setThreadPolicy(policy);
//                        Connection conn = null;
//                        try {
//                            Class.forName(classs);
//
//                            conn = DriverManager.getConnection(url,un,password);
//                            Toast.makeText(SignUpActivity.this,"Connected Successfull!",Toast.LENGTH_SHORT).show();
//
////                            st = conn.createStatement();
////                            rs = st.executeQuery("select * from users");
////                            rsmd = rs.getMetaData();
////
////                            while (rs.next()){
////
////                            }
//
//                        } catch (SQLException e) {
//                            Toast.makeText(SignUpActivity.this,"Error 2" + e.getMessage(), Toast.LENGTH_SHORT).show();
//                            System.out.println("Error; "+e.getMessage());
//                        } catch (ClassNotFoundException e) {
//                            Toast.makeText(SignUpActivity.this,"Error 1", Toast.LENGTH_SHORT).show();
//                        }
//                        break;
//
//                }
            }
        });

        View btn1 = findViewById(R.id.arrow_signup_btn);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUpActivity.this, MainActivity.class));
            }
        });

//        alert = (Button)findViewById(R.id.enter);
//        alert.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                AlertDialog alertDialog = new AlertDialog.Builder(SignUpActivity.this).create();
//                alertDialog.setTitle("Message");
//                alertDialog.setMessage("Sign Up Successfully");
//                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        dialogInterface.dismiss();
//
//                    }
//                });
//
//            }
//        });

    }

    public void GetTextFromSQL(View v){
        TextView tx1 = (TextView) findViewById(R.id.username);
        TextView tx2 = (TextView) findViewById(R.id.password);
        TextView tx3 = (TextView) findViewById(R.id.full_name_txt);
        Spinner sp = (Spinner) findViewById(R.id.planets_spinner);
        TextView btd = (TextView) findViewById(R.id.datePickerButton);

        try {
            ConnectionHelper connectionHelper = new ConnectionHelper();
            connect = connectionHelper.connectionclass();
            if(connect!=null){
                String query = "Select * from users";
                Statement st = connect.createStatement();
                ResultSet rs = st.executeQuery(query);

                while (rs.next()){
                    tx1.setText(rs.getString(1));
                    tx2.setText(rs.getString(2));
                    tx3.setText(rs.getString(3));
                    btd.setText(rs.getString(4));
//                    sp.setOnClickListener(rs.getString(5));
                }
            }
            else{
                ConnectionResult = "Check Connection";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }





}