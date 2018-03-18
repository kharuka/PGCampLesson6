package com.company.package1;

public class DQMonster extends Monster{
    public int damage;

    public DQMonster(String name,int HP,String waza,String type,int damage){
        super(name,HP,waza,type);
        this.damage=damage;
    }

    @Override
    public void attack(){
        System.out.println(this.getName()+"は攻撃した！");
        System.out.println(this.damage+"のダメージをあたえた！");
    }
}
