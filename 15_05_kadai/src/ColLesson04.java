import java.util.ArrayList;
import java.util.Scanner;

public class ColLesson04 {
    public static void main(String[] args) {
        int NUMBER = 5;

        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // コマンドラインから入力
        System.out.println("わからない単語とその意味をスペースで区切って入力して下さい。");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // ここから記述してください
        // 例えば、「Dukeくん Javaのマスコットキャラクター」と入力されたときはtmp[0]に"Dukeくん"、tmp[1]に"Javaのマスコットキャラクター"が入る
        String[] tmp = input.split(" ", 0);
        for (int i = 0; i < 2; i++) {
            arrayList.add(tmp[i]);
        }

        int COUNT = 1;
        do {
            int i = COUNT;
            System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
            input = sc.nextLine();
            if ("e".equals(input)) {
                break;
            }
            tmp = input.split(" ", 0);
            for (int j = 0; j < 2; j++) {
                arrayList.add(tmp[j]);
            }
            COUNT = ++i;
        } while (COUNT <= NUMBER - 1);
        sc.close();

        if (COUNT == NUMBER) {
            System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
        }

        for (int i = 0; i < arrayList.size(); i += 2) {
            System.out.println("単語；" + arrayList.get(i) + " 意味；" + arrayList.get(i + 1));
        }
        System.out.println(COUNT + "件、登録しました。");
    }
}
