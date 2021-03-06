package com.example.basicview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;

public class JavaView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_java_view);

        //레이아웃을 생성 - 다른 뷰들을 묶어주기 위한 뷰 그룹
        //매개변수자리 this 앞 context는 복사하면 자동으로 없어진다.
        LinearLayout layout = new LinearLayout(this);
        //뷰를 생성해서 레이아웃에 추가
        Button btn1 = new Button(this);
        btn1.setText("버튼1");
        layout.addView(btn1);

        //뷰를 생성해서 레이아웃에 추가
        Button btn2 = new Button(this);
        btn2.setText("버튼2");
        layout.addView(btn2);

        //자바코드로 만든 뷰를 Activity의 뷰로 설정
        setContentView(layout);


    }
}
