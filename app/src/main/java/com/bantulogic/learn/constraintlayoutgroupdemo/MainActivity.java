package com.bantulogic.learn.constraintlayoutgroupdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.security.acl.Group;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    Button layoutButton;
    android.support.constraint.Group group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        layoutButton = findViewById(R.id.buttonLoadAnotherLayout);
        group = findViewById(R.id.group);

        button.setOnClickListener(this);
        layoutButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                if (group.getVisibility() == View.GONE){
                    group.setVisibility(View.VISIBLE);
                    button.setText(R.string.hide_details);

                }
                else {
                    group.setVisibility(View.GONE);
                    button.setText(R.string.show_details);
                }
            break;
            case R.id.buttonLoadAnotherLayout:
                Intent intent = new Intent();
                intent.setClass(this,ConstraintLayoutActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
