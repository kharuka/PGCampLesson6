public class PersonalComputer extends Computer{
    public PersonalComputer(String owner,String maker){
        this.owner=owner;
        this.maker=maker;
    }

    @Override
    public void printData(){
        System.out.print(""+this.owner+""+this.maker);
    }
}
