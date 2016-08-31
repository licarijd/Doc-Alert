package com.example.doctorhookup.doctorhookup10;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
public static final String TAG = "LOL";
    int prefix [] = {289,647, 519};
    int smsNumber []= {7004817, 4893786,8079111,9635295};
    String message = "Hello world";
    Button btnSendSms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSendSms = (Button)findViewById(R.id.button2);

        btnSendSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendSms();
            }
        });}


        protected void sendSms() {
            String message1="WIll you be my haktine";
            String number = "2897004817";
        SmsManager manager = SmsManager.getDefault();
        manager.sendTextMessage(number, null, message1, null, null);
        Toast.makeText(getApplicationContext(), "sent successfully", Toast.LENGTH_LONG).show();
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    public void buttonClick(View view) {
        Log.i(TAG, "apples");
        Intent intent= new  Intent(MainActivity.this, Informationpage.class);
        startActivity(intent);
// An AWT program inherits from the top-level container java.awt.Frame


        // Do something in response to button click
    }
}
