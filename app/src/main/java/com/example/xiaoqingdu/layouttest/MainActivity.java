package com.example.xiaoqingdu.layouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=(Button)findViewById(R.id.button);
        final EditText editText=(EditText)findViewById(R.id.edit_name);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("注册成功");
            }
        });

    }

    public void onCheckboxClicked(View view){
        boolean checked=((CheckBox) view).isChecked();
        TextView text_name=(TextView)findViewById(R.id.text_name);
        String str_name=text_name.getText().toString();
        switch (view.getId()){
            case R.id.check_c:
                if(checked){
                    String str="选择C语言";
                    text_name.setText(str);
                }else {
                    text_name.setText("取消选择C");
                }
                break;
            case R.id.check_java:
                if(checked){
                    String str_java="选择Java语言";
                    text_name.setText(str_java);
                }
                else {
                    text_name.setText("取消选择Java");
                }
                break;
            case R.id.check_python:
                if(checked){
                    String str_python="选择Python语言";
                    text_name.setText(str_python);
                }
                else {
                    text_name.setText("取消选择Python");
                }
                break;
        }
    }

    public void onRadioButtonClicked(View view){
        boolean checked=((RadioButton) view).isChecked();
        TextView textView=(TextView)findViewById(R.id.text_sex);
        switch (view.getId()){
            case R.id.radio_male:
                if(checked){
                    textView.setText("性别为男");
                }break;
            case R.id.radio_female:
                if(checked){
                    textView.setText("性别为女");
                }break;
        }
    }
}
