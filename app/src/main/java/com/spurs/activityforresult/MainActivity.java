package com.spurs.activityforresult;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=(TextView) findViewById(R.id.text1);
    }
    public void clickBtn(View v){

        Intent intent=new Intent(this,SecondActivity.class);
        startActivityForResult(intent,1);
    }

    //startActivityforResult()메소드로 실행된 Activity가 종료되어
    //이 MainActivity가 다시 화면에 보일때 자동으로 실행되는 메소드
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        switch (requestCode){
            case 1:
                if(resultCode== Activity.RESULT_OK){
                    String name=data.getStringExtra("Name");
                    int age=data.getIntExtra("Age",0);
                    text.setText("결과값"+name+" / "+age);
                }
                break;
        }

        super.onActivityResult(requestCode, resultCode, data);
    }
}
