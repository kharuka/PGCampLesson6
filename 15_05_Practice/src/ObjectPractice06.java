import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ObjectPractice06 {
    public static void main(String[] args) {
        try{
            CoinCase cc = new CoinCase();

            for(int i=0; i<6 ;i++){
                System.out.println("硬貨の種類を入力して下さい。");
                BufferedReader br_jpy = new BufferedReader(new InputStreamReader(System.in));
                String jpy = br_jpy.readLine();

                System.out.println("硬貨の枚数を入力して下さい。");
                BufferedReader br_num = new BufferedReader(new InputStreamReader(System.in));
                String num = br_num.readLine();

                cc.AddCoins(Integer.parseInt(jpy),Integer.parseInt(num));
            }

            System.out.println("500円は"+cc.GetCount(500)+"枚　100円は"+cc.GetCount(100)+"枚　50円は"+cc.GetCount(50)+"枚　10円は"+cc.GetCount(10)+"枚　5円は"+cc.GetCount(5)+"枚　1円は"+cc.GetCount(1)+"枚");
            System.out.println("総額は"+cc.GetAmount()+"円です。");

        }catch(IOException e){
            System.out.println("Exception :" + e);
        }
    }
}
