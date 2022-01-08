package practice;

public class proviteWithsetandGetM {
    private String name;

    public String  getName(){
    return name;

    }
    public  void setName( String newName){

     this.name=newName;
    }

    public static void main(String[] args) {
        proviteWithsetandGetM setGetM=new proviteWithsetandGetM();
        setGetM.setName("khadija54");
        System.out.println(setGetM.getName());
    }
}
