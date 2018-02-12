package com.example.coed152.server;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.os.Environment;

/*
 * Permission needed:
 * <uses-permission android:name="android.permission.INTERNET"/>
 * <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
 */

public class Second extends Activity {

    EditText editTextAddress;
    Button buttonConnect;
    TextView textPort, t2;
    ImageView image;
    Button b1;

    static final int SocketServerPORT = 18080;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        image = (ImageView) findViewById(R.id.imageView);
        Bundle bundle = this.getIntent().getExtras();
        String data = bundle.get("operation").toString();
        Drawable d = Drawable.createFromPath("/storage/emulated/0/test.png");
        if (data.equals("0")) {
            image.setRotation((float) -90.0);
            image.setImageDrawable(d);
        }
        else if(data.equals("1"))
        {
            image.setRotation((float) 90.0);
            image.setImageDrawable(d);
        }


    }
}