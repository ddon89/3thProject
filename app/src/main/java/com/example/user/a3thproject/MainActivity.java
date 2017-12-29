package com.example.user.a3thproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    final static int EDIT_VALUE = 0;
    ImageView imageView;
    TextView textView;
    String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
    }
    //맵 정보 게시판으로 넘어가는 메서드
    public void go_map_info(View view){
        Intent intent = new Intent(this, MapInfoListActivity.class);
        startActivityForResult(intent,EDIT_VALUE);
    }

    //공략 게시판으로 넘어가는 메서드
    public void go_map_tactics(View view){
        Intent intent = new Intent(this, MapTacticsListActivity.class);
        startActivityForResult(intent,EDIT_VALUE);
    }

    //마이페이지로 넘어가는 메서드
    public void go_mypage(View view){
        Intent intent = new Intent(this, MypageActivity.class);
        startActivityForResult(intent,EDIT_VALUE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case EDIT_VALUE :
                if (resultCode == RESULT_OK){
                    imageView.setImageResource(R.drawable.profile_03);
                    textView.setText(id);

                    String message = data.getStringExtra("Textout");
                    Toast.makeText(this, message, Toast.LENGTH_LONG).show();
                }else if (resultCode == RESULT_CANCELED){
                    String message = "처리실패";
                    Toast.makeText(this, message, Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}
