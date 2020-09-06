package com.chrome.my;

public class languageNameList {
    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    String name1,name2;
    int color;
    public languageNameList(String name1,String name2,int color){
           this.name1=name1;
           this.name2=name2;
           this.color=color;
    }
}
