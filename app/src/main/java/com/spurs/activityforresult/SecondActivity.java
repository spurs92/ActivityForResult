package com.spurs.activityforresult;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText editName,editAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editName=(EditText) findViewById(R.id.edit_name);
        editAge=(EditText) findViewById(R.id.edit_age);
    }

    public void clickBtn(View v){
        String name=editName.getText().toString();
        int age=Integer.parseInt(editAge.getText().toString());

        Intent intent =getIntent();
        intent.putExtra("Name",name);
        intent.putExtra("Age",age);

        setResult(Activity.RESULT_OK,intent);

        finish();
    }
}
