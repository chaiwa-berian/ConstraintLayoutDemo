package com.bantulogic.learn.constraintlayoutgroupdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.security.acl.Group;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    android.support.constraint.Group group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        group = findViewById(R.id.group);

        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (group.getVisibility() == View.VISIBLE){
            group.setVisibility(View.VISIBLE);
            button.setText(R.string.hide_details);

        }
        else {
            group.setVisibility(View.GONE);
            button.setText(R.string.show_details);
        }
    }
}
