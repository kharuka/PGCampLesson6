import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ObjectPractice06 {
    public static void main(String[] args) {
        try{
            System.out.println("硬貨の種類を入力して下さい。");
            BufferedReader br_jpy = new BufferedReader(new InputStreamReader(System.in));
            String jpy = br_jpy.readLine();

            System.out.println("硬貨の枚数を入力して下さい。");
            BufferedReader br_num = new BufferedReader(new InputStreamReader(System.in));
            String num = br_num.readLine();

            CoinCase cc = new CoinCase();
            cc.AddCoins(Integer.parseInt(jpy),Integer.parseInt(num));

            System.out.println(num);
        }catch(IOException e){
            System.out.println("Exception :" + e);
        }
    }
}
