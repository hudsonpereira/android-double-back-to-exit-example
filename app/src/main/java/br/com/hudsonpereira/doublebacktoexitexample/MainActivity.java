package br.com.hudsonpereira.doublebacktoexitexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toast doubleBackButtonToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doubleBackButtonToast = Toast.makeText(this, "Double tap back to exit.", Toast.LENGTH_SHORT);
    }

    @Override
    public void onBackPressed() {
        if (doubleBackButtonToast.getView().isShown()) {
            super.onBackPressed();
        }

        doubleBackButtonToast.show();
    }
}
