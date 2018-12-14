# LCBSettingView
常用的设置界面（主要是有多行相同差不多的布局），方便以后使用
## 使用前准备  
1、Add it in your root build.gradle at the end of repositories:  
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
2、Add the dependency  
```
	dependencies {
	        implementation 'com.github.luchongbin:LCBSettingView:v1.0.0'
	}
 ```
3、在mxl文件中使用如下：  
```
<com.luchongbin.lcbsettingviewlibrary.LCBSettingItem
        android:id="@+id/item_one"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        lcb:isShowRightText="true"
        lcb:leftIconSize="36dp"
        lcb:leftText="我的name"
        lcb:leftTextMarginLeft="30dp"
        lcb:rightText="99+"
        lcb:rightTextColor="@color/gray"
        lcb:rightTextSize="14"/>
 ```
 4、点击方式 
 ```
  LCBSettingItem mSettingItemOne =  findViewById(R.id.item_one);
   mSettingItemOne.setmOnLSettingItemClick(new LCBSettingItem.OnLCBSettingItemClick() {
            @Override
            public void click(boolean isChecked) {
                Toast.makeText(getApplicationContext(), "我的消息--1", Toast.LENGTH_SHORT).show();
            }
        });
```

## 自定义属性
```
属性	说明	类型
leftText	左侧文字	string
leftIcon	左侧图标	integer
rightIcon	右侧图标	integer
LtextSize	左侧文字大小	dimension
LtextColor	左侧文字颜色	color
isShowUnderLine	是否显示底部分割线	boolean
rightStyle	右侧图标风格	enum
isShowRightText	是否显示右侧文字	boolean
rightText	右侧文字	string
rightTextSize	右侧文字大小	boolean
rightTextColor	右侧文字颜色	color
leftIconSize	左侧图标大小	dimension
leftTextMarginLeft	左侧图标与文字间距	dimension
```
## 右侧图标风格
```
iconShow 显示图标
iconHide 隐藏图标
iconCheck 显示复选框
iconSwitch 显示切换开关
```
## License  
```
MIT License

Copyright (c) 2018 卢崇斌

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
