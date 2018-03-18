package com.company.package1;

public class Monster {
    private String name;
    private int HP;
    private String waza;
    private String type;

    //コンストラクタ
    public Monster(String name, int HP, String waza, String type){
        this.name=name;
        this.HP=HP;
        this.waza=waza;
        this.type=type;
    }

    public void attack(){
        System.out.println(this.name+"は"+this.waza+"を繰り出した！");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getWaza(){
        return waza;
    }

    public void setWaza(String waza){
        this.waza=waza;
    }

}
