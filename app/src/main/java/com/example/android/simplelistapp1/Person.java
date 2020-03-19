package com.example.android.simplelistapp1;

public class Person {
    private String mName , mText;
    private int mImg;
    public Person(String name , String text , int img){
        mName = name;
        mText = text;
        mImg = img;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public int getmImg() {
        return mImg;
    }

    public void setmImg(int mImg) {
        this.mImg = mImg;
    }
}
