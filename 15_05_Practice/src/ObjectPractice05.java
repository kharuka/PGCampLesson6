import java.util.ArrayList;

public class ObjectPractice05 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        ArrayList<String> comeFroms=new ArrayList<>();

        names.add("森田");
        names.add("木村");
        names.add("高山");
        names.add("茂木");

        comeFroms.add("奈良");
        comeFroms.add("埼玉");
        comeFroms.add("東京");
        comeFroms.add("沖縄");

        for(int i=0;i<names.size();i++){
            Person person=new Person(names.get(i),comeFroms.get(i));
            person.getSelfIntroduction();
        }
    }
}
