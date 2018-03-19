import java.util.Scanner;

public class ColLesson01 {
	public static void main(String[] args) {
		// Wordクラスのインスタンス配列
		Word[] words = new Word[10];

		// コマンドラインから入力
		System.out.println("わからない単語とその意味をスペースで区切って入力して下さい。");
		Scanner sc  = new Scanner(System.in);
		String input = sc.nextLine();

		// ここから記述してください
		// 例えば、「Dukeくん Javaのマスコットキャラクター」と入力されたときはtmp[0]に"Dukeくん"、tmp[1]に"Javaのマスコットキャラクター"が入る
		tmp = input.split(" ");

	}
}
