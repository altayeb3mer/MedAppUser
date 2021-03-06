package com.magsood.medappuser.Utils;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.magsood.medappuser.R;


public abstract class ToolbarClass extends AppCompatActivity {

    protected final void onCreate(int layoutId, String toolbar_title)
    {

        setContentView(layoutId);
        Toolbar toolbar = findViewById(R.id.public_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(toolbar_title);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

}
