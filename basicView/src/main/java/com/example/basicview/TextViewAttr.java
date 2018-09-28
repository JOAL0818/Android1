package com.example.basicview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class TextViewAttr extends AppCompatActivity {
    //찾아오고자 하는 위젯을 인스턴스 변수로 선언
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_attr);

        //XML파일에 만든 뷰 가져오기 *형변환해줘야한다.
        TextView tv = (TextView) findViewById(R.id.joal);
        //text속성을 설정할 때는 String을 대입할 수 있다.
        tv.setText("안녕하세요");
        //가져올 때는 toString()을 이용해서 String으로 변환해서 가져와야한다.
        String msg = tv.getText().toString();


        editText = (EditText)findViewById(R.id.edit);
        textView = (TextView)findViewById(R.id.text);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                textView.setText(editText.getText());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
}
