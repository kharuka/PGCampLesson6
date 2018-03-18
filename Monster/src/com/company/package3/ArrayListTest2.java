package com.company.package3;

import com.company.package1.Monster;
import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<Monster> monster_array=new ArrayList<>();
        monster_array.add(new Monster("ピカチュウ",90,"電光石火","ねずみポケモン"));
        monster_array.add(new Monster("ヒトカゲ",90,"火の粉","トカゲポケモン"));

        for(int i=0;i<monster_array.size();i++){
            monster_array.get(i).attack();
        }

    }

}
