package com.example.implicittraining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void call(View v){
        Intent i = new Intent(Intent.ACTION_DIAL);
        //set data metodu URI istiyor. Telefon numarasını uri ya parse ederek gönderiyoruz.
        i.setData(Uri.parse("tel:05555555555"));
        startActivity(i);
        i.putExtra("phoneNumber",05555555555);

    }
}
