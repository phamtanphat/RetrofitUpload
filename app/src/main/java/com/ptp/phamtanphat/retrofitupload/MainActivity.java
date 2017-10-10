package com.ptp.phamtanphat.retrofitupload;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    ImageView imgfolder;
    Button btnsenddata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgfolder = (ImageView) findViewById(R.id.imageviewfolder);
        btnsenddata = (Button) findViewById(R.id.buttonsenddata);

        OkHttpClient.Builder okhttp = new OkHttpClient.Builder();
        Retrofit.Builder builder = new Retrofit.Builder()
                            .baseUrl("")
    }
}
