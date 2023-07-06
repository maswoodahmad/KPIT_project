package baisc;

public class PlayerDataShower {

    public static void main(String[] args) {
        System.out.println("Showing the data");
        Cricket p1= new Cricket("Sachin", 42);
        p1.setRecord(101, 1,0, 0, 0);
        p1.showRecord();
        Cricket p2= new Cricket("Kohli", 32);
        p2.setRecord(53, 0, 1,1,0);
        p2.showRecord();
    }
}
