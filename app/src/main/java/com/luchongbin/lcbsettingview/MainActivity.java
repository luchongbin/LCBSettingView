package com.luchongbin.lcbsettingview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.luchongbin.lcbsettingviewlibrary.LCBSettingItem;

public class MainActivity extends AppCompatActivity {
    private LCBSettingItem mSettingItemOne;
    private LCBSettingItem mSettingItemFour;
    private LCBSettingItem mSettingItemFive;
    private ImageView mIvHead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSettingItemOne =  findViewById(R.id.item_one);
        mSettingItemFour =  findViewById(R.id.item_four);
        mSettingItemFive =  findViewById(R.id.item_five);
        mIvHead =  findViewById(R.id.headimage);

        mSettingItemOne.setmOnLSettingItemClick(new LCBSettingItem.OnLCBSettingItemClick() {
            @Override
            public void click(boolean isChecked) {
                Toast.makeText(getApplicationContext(), "我的消息--1", Toast.LENGTH_SHORT).show();
            }
        });
        mSettingItemFour.setmOnLSettingItemClick(new LCBSettingItem.OnLCBSettingItemClick() {
            @Override
            public void click(boolean isChecked) {
                Toast.makeText(getApplicationContext(), "选中开关：" + isChecked, Toast.LENGTH_SHORT).show();
            }
        });
        mSettingItemOne.setRightText("我是右侧改变的文字");
        mSettingItemFive.setmOnLSettingItemClick(new LCBSettingItem.OnLCBSettingItemClick() {
            @Override
            public void click(boolean isChecked) {
                Toast.makeText(getApplicationContext(), "切换开关：" + isChecked, Toast.LENGTH_SHORT).show();
            }
        });
//        Picasso.with(this).load(R.drawable.girl).transform(new CircleTransform()).into(mIvHead);
    }
}
