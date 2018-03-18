package com.company.package2;

import com.company.package1.Monster;

public class Main {
    public static void main(String[] args){
        Monster picachu=new Monster("ピカチュウ",100,"100万ボルト","ネズミポケモン");
        Monster hitokage=new Monster("ヒトカゲ",90,"火の粉","トカゲポケモン");

        picachu.attack();
        hitokage.attack();
    }
}
