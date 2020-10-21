package com.example.homemade_guardian_beta.Main.activity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import androidx.annotation.LayoutRes;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.homemade_guardian_beta.R;

//AppCompatActivity를 기본으로 부가적인 기능을 추가하여 BasicActivity으로 만들었으며 다른 액티비티에서 이를 호출하여 사용한다.
//      Ex) public class 쓰려는 액티비티 (extends AppCompatActivity) --> (extends BasicActivity)

public class BasicActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
    }

    // 툴바 설정
    @Override
    public void setContentView(@LayoutRes int layoutResID) {                                            // part19 : tollbar(상단바) 설정 함수
        super.setContentView(layoutResID);
        Toolbar Mytoolbar = findViewById(R.id.toolbar);
        setSupportActionBar(Mytoolbar);
    }

    // 툴바 이름 설정
    public void setToolbarTitle(String title){                                                          // part19 : 상단바 제목 지정(28'30")
        ActionBar Actionbar = getSupportActionBar();
        if(Actionbar != null){ Actionbar.setTitle(title); }
    }
}
