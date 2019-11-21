package com.isc.t2p2colores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.bt1);
        b1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent inte=new Intent(this,frm2Activity.class);
        startActivity(inte);
        this.finish();
    }
    public void bMostrar(View view) {
        Intent inten=new Intent(this,frm3Activity.class);
        startActivity(inten);
        this.finish();
    }
}
