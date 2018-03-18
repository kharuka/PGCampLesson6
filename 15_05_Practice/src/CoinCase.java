import java.util.HashMap;

public class CoinCase {
    public int tmp_num;

    HashMap<String,Integer> coin=new HashMap<>();

    public CoinCase(){
        this.tmp_num=0;
        coin.put("jpy_500",0);
        coin.put("jpy_100",0);
        coin.put("jpy_50",0);
        coin.put("jpy_10",0);
        coin.put("jpy_5",0);
        coin.put("jpy_1",0);
    }

    public void AddCoins(int jpy,int num){
        if(jpy==500){
            tmp_num=coin.get("jpy_500");
            coin.put("jpy_500",num+tmp_num);
            System.out.println("500円は"+coin.get("jpy_500")+"枚");
        }else if (jpy==100){
            tmp_num=coin.get("jpy_100");
            coin.put("jpy_100",num+tmp_num);
            System.out.println("100円は"+coin.get("jpy_100")+"枚");
        }else if(jpy==50){
            tmp_num=coin.get("jpy_50");
            coin.put("jpy_50",num+tmp_num);
            System.out.println("50円は"+coin.get("jpy_50")+"枚");
        }else if(jpy==10){
            tmp_num=coin.get("jpy_10");
            coin.put("jpy_10",num+tmp_num);
            System.out.println("10円は"+coin.get("jpy_10")+"枚");
        }else if(jpy==5){
            tmp_num=coin.get("jpy_5");
            coin.put("jpy_5",num+tmp_num);
            System.out.println("5円は"+coin.get("jpy_5")+"枚");
        }else if(jpy==1){
            tmp_num=coin.get("jpy_1");
            coin.put("jpy_1",num+tmp_num);
            System.out.println("1円は"+coin.get("jpy_1")+"枚");
        }else{
            System.out.println("ERROR in AddCoins");
        }

    }

    public void GetCount(){

    }

    public void GetAmount(){

    }
}
