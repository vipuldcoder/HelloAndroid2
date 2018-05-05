package com.example.vipul.helloandroid;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String schoolName = getString(R.string.school_name);
        String schoolConactNumber = getString(R.string.contact_no_school);
        String schoolWebsite = getString(R.string.school_website);
        String schoolAddress = getString(R.string.school_address);

    }
}
