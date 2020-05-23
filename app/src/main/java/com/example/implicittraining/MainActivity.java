package com.example.implicittraining;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv;
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Bundle b = data.getExtras();
        //Intent data  ile alınan veriyi bitmap objesine typecasting yaparak aktardık.
        Bitmap bm = (Bitmap) b.get("data");
        iv.setImageBitmap(bm);



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = findViewById(R.id.imageView);
    }

    public void call(View v){
        Intent i = new Intent(Intent.ACTION_DIAL);
        //set data metodu URI istiyor. Telefon numarasını uri ya parse ederek gönderiyoruz.
        i.setData(Uri.parse("tel:05555555555"));
        startActivity(i);
        i.putExtra("phoneNumber",05555555555);

    }

    public void camera (View v){
        Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(i,1);
    }
}
