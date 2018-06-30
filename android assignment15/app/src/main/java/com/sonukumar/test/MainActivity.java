package com.sonukumar.test;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast=Toast.makeText(MainActivity.this, "hello im gupta", Toast.LENGTH_LONG).show();
        toast.setGravity(Gravity.Top,0,0);
         toast.show();
        
    }


    @Override
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(MainActivity.this, "onstart", Toast.LENGTH_LONG).show();


    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "pause", Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "resume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "on stop", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this, "restart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "destroy", Toast.LENGTH_LONG).show();
    }
}

