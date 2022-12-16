package vn.edu.usth.nutrition_recipe;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHelper {
    ConnectionHelper conn;
    String uname, pass, ip, port, database;

    @SuppressLint("NewApi")
    public Connection connectionclass(){
        ip="127.0.0.1";
        uname="root";
        pass = "";
        port = "3306";
        database="nutrition_recipe";

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection connection = null;
        String ConnectionURL = null;

        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            ConnectionURL= "jdbc:jtds:sqlserver://"+ ip + ":"+ port+";"+ "databasename="+ database+";user="+uname+";password="+pass+";";
            connection = DriverManager.getConnection(ConnectionURL);
        }
        catch (Exception ex){
            Log.e("Error",ex.getMessage());
        }

        return connection;
    }
}
