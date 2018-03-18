package com.company.package2;

import com.company.package1.DQMonster;
import com.company.package1.PoketMonster;

public class InherPractice {
    public static void main(String[] args) {
        PoketMonster pokemon=new PoketMonster("ピカチュウ",90,"電光石火","ねずみポケモン","ライチュウ");
        DQMonster dqmon=new DQMonster("スライム",80,"なし","スライム",10);
        pokemon.attack();
        pokemon.evolution();
        pokemon.attack();

        dqmon.attack();
    }
}
