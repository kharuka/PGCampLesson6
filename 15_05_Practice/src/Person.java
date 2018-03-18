public class Person {
    public String name;
    public String comeFrom;

    public Person(String name,String comeFrom){
        this.name=name;
        this.comeFrom=comeFrom;
    }

    public void getSelfIntroduction(){
        System.out.println("私の名前は"+name+"です。"+comeFrom+"出身");
    }

//    public String getSt() {
//        return "私の名前は"+name+"です。"+comeFrom+"出身";
//    }
}
