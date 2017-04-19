package com.droidapp.overdraw;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(getResources().getString(R.string.app_name));
        }

        findViewById(R.id.button_unneeded_background).setOnClickListener(this);
        findViewById(R.id.button_flat_views).setOnClickListener(this);
        findViewById(R.id.button_transparency).setOnClickListener(this);

        /*
        todo 1 removing unneeded backgrounds
        todo 2 flatten view hierarchy
        todo 3 remove transparency from images
         */
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.button_unneeded_background:
                intent = new Intent(MainActivity.this, UnneededBackgroundActivity.class);
                startActivity(intent);
                break;
            case R.id.button_flat_views:
                intent = new Intent(MainActivity.this, FlatViewHierarchyActivity.class);
                startActivity(intent);
                break;
            case R.id.button_transparency:
                intent = new Intent(MainActivity.this, TransparencyActivity.class);
                startActivity(intent);
                break;
        }
    }
}
