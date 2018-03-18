package com.company.package1;

public class PoketMonster extends Monster{
    private String nextName;

    public PoketMonster(String name,int HP,String waza,String type,String nextName){
        super(name,HP,waza,type);
        this.nextName=nextName;
    }

    public void evolution(){
        System.out.println(this.getName()+"は"+this.nextName+"に進化した！");
        this.setName(this.nextName);
    }
}