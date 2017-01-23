package com.jinwoo.android.settings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// 이벤트(버튼 눌림)를 발생시키기 위해 인터페이스를 사용한다.
public class SettingsActivity extends AppCompatActivity implements View.OnClickListener{
    //1. 레이아웃 .xml에서 사용하는 뷰 객체 정의
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        //2. findViewById로 뷰 세팅
        btn = (Button) findViewById(R.id.button);   // Library 문제는 Alt + Enter를 누르면 된다.
        tv = (TextView) findViewById(R.id.textView);//findViewByID는 항상 View를 반환한다. View는 가장 상위클래스이기 때문에 Button으로 타입 캐스팅을 해주어야 한다.

        //3. 버튼에 onClickListener 달기
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button:
                tv.setText(BuildConfig.MYURL);
        }
    }


}
