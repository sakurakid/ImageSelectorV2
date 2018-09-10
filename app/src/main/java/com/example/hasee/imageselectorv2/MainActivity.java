package com.example.hasee.imageselectorv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.donkingliang.imageselector.utils.ImageSelectorUtils;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView show;
    private Button choose;
    private int REQUEST_CODE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        choose = (Button)findViewById(R.id.bt_choose);
        show = (ImageView)findViewById(R.id.iv_show);
        choose.setOnClickListener(this);
        show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_choose:
                ImageSelectorUtils.openPhoto(MainActivity.this,REQUEST_CODE,true,0);
                break;
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE && data != null) {
            //获取选择器返回的数据
            ArrayList<String> images = data.getStringArrayListExtra(
                    ImageSelectorUtils.SELECT_RESULT);

        }
    }
    protected void show(){
        CloneStudent cloneStudent1 = new CloneStudent(10, new Student("笑笑"),"哈哈");
        try {
            CloneStudent cloneStudent2 = (CloneStudent)cloneStudent1.clone();

            System.out.println("Student1.equals(Student) "+cloneStudent1.equals(cloneStudent2));
            System.out.println("student1==student2"+(cloneStudent1==cloneStudent2));
            System.out.println(cloneStudent1.getClass()==cloneStudent2.getClass());

            System.out.println(cloneStudent1.toString());
            System.out.println(cloneStudent2.toString());

            cloneStudent1.setAge(200);
            System.out.println(cloneStudent1.toString());
            System.out.println(cloneStudent2.toString());

            cloneStudent2.getStudent().setName("啦啦");
            System.out.println(cloneStudent1.toString());
            System.out.println(cloneStudent2.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
