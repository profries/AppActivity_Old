package com.example.iossenac.appactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.w("CicloVida","Create");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    protected void onStart() {
        Log.w("CicloVida","Start");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.w("CicloVida","Stop");

        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.w("CicloVida","Destroy");

        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.w("CicloVida","Pause");

        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.w("CicloVida","Resume");

        super.onResume();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent it = new Intent(this,MinhaActivity.class);
        startActivity(it);
    }

    @Override
    protected void onRestart() {
        Log.w("CicloVida","Restart");

        super.onRestart();
    }
}
