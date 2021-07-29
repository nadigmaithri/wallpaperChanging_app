package com.example.wallpaperchange;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    Button btnChangeWallpaper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChangeWallpaper = (Button) findViewById(R.id.button);
        btnChangeWallpaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeWallpaper();
            }
        });

}
    void changeWallpaper()
    {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.img1);
        WallpaperManager manager = WallpaperManager.getInstance(getApplicationContext());
        try {
            manager.setBitmap(bitmap);
            Toast.makeText(this, "Wallpaper set!", Toast.LENGTH_SHORT).show();
        }
        catch(IOException e)
        {
            Toast.makeText(this, "Error!", Toast.LENGTH_SHORT).show();
        }
    }
}