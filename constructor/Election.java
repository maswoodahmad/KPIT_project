package constructor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Election {
    String name;
    int age;
    public Election(int age,String name) {

        if( age<18)
        {
            throw new RuntimeException("You're not eligible to vote, voter must be 18+");
        }else{
            this.age = age;
        }

        Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z ]*");
        Matcher m = p.matcher(name);
        boolean b = m.matches();
        boolean c = name.length()>3?true:false;
        if(b&&c)
        {
            this.name = name;

        }else{
            throw  new RuntimeException("name must  start with letters only");
        }
        System.out.println("voter created");
    }

    void printVoter(){
        System.out.print("Voter name\t:\t"+name+"\t|\t");
        System.out.println("voter's age\t:"+age+"\t");
        System.out.println("------------------------------");
    }
}
