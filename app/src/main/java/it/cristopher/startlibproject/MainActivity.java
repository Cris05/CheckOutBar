package it.cristopher.startlibproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import it.cristopher.checkoutbar.CheckOutBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckOutBar checkOutBar = (CheckOutBar) findViewById(R.id.barraCheck);
    }
}
