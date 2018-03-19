import java.util.HashMap;

public class CoinCase {
    HashMap<String,Integer> coin=new HashMap<>();

    public CoinCase(){
        coin.put("jpy_500",0);
        coin.put("jpy_100",0);
        coin.put("jpy_50",0);
        coin.put("jpy_10",0);
        coin.put("jpy_5",0);
        coin.put("jpy_1",0);
    }

    public void AddCoins(int jpy,int num){
        int tmp_num=0;

        if(jpy==500){
            tmp_num=coin.get("jpy_500");
            coin.put("jpy_500",num+tmp_num);
        }else if (jpy==100){
            tmp_num=coin.get("jpy_100");
            coin.put("jpy_100",num+tmp_num);
        }else if(jpy==50){
            tmp_num=coin.get("jpy_50");
            coin.put("jpy_50",num+tmp_num);
        }else if(jpy==10){
            tmp_num=coin.get("jpy_10");
            coin.put("jpy_10",num+tmp_num);
        }else if(jpy==5){
            tmp_num=coin.get("jpy_5");
            coin.put("jpy_5",num+tmp_num);
        }else if(jpy==1){
            tmp_num=coin.get("jpy_1");
            coin.put("jpy_1",num+tmp_num);
        }else{
            System.out.println("ERROR in AddCoins");
        }
    }

    public int GetCount(int jpy){
        int num=0;

        if(jpy==500){
            num=coin.get("jpy_500");
        }else if (jpy==100){
            num=coin.get("jpy_100");
        }else if(jpy==50){
            num=coin.get("jpy_50");
        }else if(jpy==10){
            num=coin.get("jpy_10");
        }else if(jpy==5){
            num=coin.get("jpy_5");
        }else if(jpy==1){
            num=coin.get("jpy_1");
        }else{
            System.out.println("ERROR in GetCount");
        }
        return num;
    }

    public int GetAmount(){
        int amount=500*coin.get("jpy_500")+100*coin.get("jpy_100")+50*coin.get("jpy_50")+10*coin.get("jpy_10")+5*coin.get("jpy_5")+coin.get("jpy_1");
        return amount;
    }
}
