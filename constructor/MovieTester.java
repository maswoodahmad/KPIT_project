package constructor;

public class MovieTester {
    public static void main(String[] args) {
        Movie m = new Movie();
        m.setMovie("Lagan");
        m.setYear(2002);
        m.setRating(4.2f);
        Movie m2 = new Movie("Avatar", 2010, 4.6f);
        m.getInfo();
        m2.getInfo();


    }


}
