package constructor;

public class Movie {
    String movie;
    int year;

    float rating;

    public Movie(String movie, int year, float rating) {
        this.movie = movie;
        this.year = year;
        this.rating = rating;
    }

    Movie(){};

    void setMovie( String movie)
    {
        this.movie=movie;
    }
    void setYear(int year)
    {
        this.year=year;
    }
    void setRating(float r)
    {
        rating=r;
    }

    void getInfo()
    {
        System.out.print("Movie Name\t:"+movie+"\t\t");
        System.out.print("Released in\t:"+ year+"\t\t");
        System.out.println("Ratings\t:"+rating+"\n------------");

    }
}
