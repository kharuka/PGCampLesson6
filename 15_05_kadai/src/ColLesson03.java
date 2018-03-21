import java.util.Scanner;

public class ColLesson03 {
    public static void main(String[] args) {
        int NUMBER = 5;

        // Wordクラスのインスタンス配列
        Word[] words = new Word[NUMBER];

        // コマンドラインから入力
        System.out.println("わからない単語とその意味をスペースで区切って入力して下さい。");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // ここから記述してください
        // 例えば、「Dukeくん Javaのマスコットキャラクター」と入力されたときはtmp[0]に"Dukeくん"、tmp[1]に"Javaのマスコットキャラクター"が入る
        String[] tmp = input.split(" ", 0);
        words[0] = new Word(tmp[0], tmp[1]);

        int COUNT = 1;
        do {
            int i = COUNT;
            System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
            input = sc.nextLine();
            if ("e".equals(input)) {
                break;
            }
            tmp = input.split(" ", 0);
            words[i] = new Word(tmp[0], tmp[1]);
            COUNT = ++i;
        } while (COUNT <= NUMBER - 1);
        sc.close();

        if(COUNT == NUMBER){
            System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
        }

        for (int i = 0; i < COUNT; i++) {
            System.out.println(words[i].toString());
        }
        System.out.println(COUNT + "件、登録しました。");
    }
}
