package com.packet.gloov.app;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;
import android.widget.EditText;

import com.google.gson.Gson;

import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent conector = new Intent(MainActivity.this, map.class);
                startActivity(conector);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



    class userJson extends AsyncTask<Void, Void,Boolean>{
        private Intent accept;


        @Override
        protected Boolean doInBackground(Void... arg0) {
            try {
                EditText mailText = (EditText) findViewById(R.id.email);
                EditText passwordText = (EditText) findViewById(R.id.password);

                Gson gson = new Gson();
                URL url = new URL ("http://de12aa1900d786bde364e77edda243c1.loguealo.com");






            }catch (Exception e){
                Log.i("error", "esta mierda se daño");
                e.printStackTrace();
            }
            return  false;
        }
    }


}


