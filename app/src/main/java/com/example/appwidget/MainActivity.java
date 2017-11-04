package com.example.appwidget;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = (TextView) findViewById(R.id.textView);
        changeText(getIntent());
    }

    /*onNewIntent():
    * This is called for activities that set launchMode to "singleTop" in their package, or if
    * a client used the FLAG_ACTIVITY_SINGLE_TOP flag when calling startActivity(Intent).
    * In either case, when the activity is re-launched while at the top of the activity stack
    * instead of a new instance of the activity being started, onNewIntent() will be called on
    * the existing instance with the Intent that was used to re-launch it.
    * */
    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        changeText(intent);
    }

    private void changeText(Intent intent){
        int result=intent.getIntExtra("data",-1);
        if(result!=-1)
        textview.setText(result+"");
    }
}
