package practice;

public class moreExmples {

    private int myNumber;
    public int getName(){
        return myNumber;
    }
    public void setName(int newNumber){
        this.myNumber=newNumber;
    }

    public static void main(String[] args) {
        moreExmples getSetM=new moreExmples();
        getSetM.setName(35);
        System.out.println(getSetM.getName());
    }
}
