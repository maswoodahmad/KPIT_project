public class Cricket {

    private String playerName;
    private int dobYear;
    private int run;
    private int wicket;

    private int centuries;

    private int fifties;
    private int doubleCentury;


    Cricket(String name, int year){
        playerName=name;
        dobYear=year;
    }

     void setRecord(int runScored, int century,int w, int fifty, int dcentury) {
        run+=runScored;
        wicket+=w;
        centuries+=century;
        fifties+=fifty;
        doubleCentury+=dcentury;

    }
    void showRecord()
    {
        System.out.println("--------------------------------");
        System.out.print("Player name:"+playerName+"\t");
        System.out.println("Age:"+dobYear+"\t");
        System.out.print("Run Scored:"+run+"\t");
        System.out.print("Fifties:"+fifties+"\t");
        System.out.print("Wicket Taken:"+wicket+"\t");
        System.out.print("Centuries:"+centuries+"\t");
        System.out.println("Double Centuries:"+ doubleCentury+"\t");
    }


}
