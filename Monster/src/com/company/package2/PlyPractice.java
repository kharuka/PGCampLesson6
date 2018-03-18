package com.company.package2;

import com.company.package1.DQMonster;
import com.company.package1.Monster;
import com.company.package1.PoketMonster;

public class PlyPractice {
    public static void main(String[] args) {
        Monster[] monsterArr={
                new PoketMonster("ピカチュウ",90,"電光石火","ねずみポケモン","ライチュウ"),
                new DQMonster("スライム",80,"なし","スライム",10)};

        for(int i=0;i<monsterArr.length;i++){
            monsterArr[i].attack();
        }
    }
}
