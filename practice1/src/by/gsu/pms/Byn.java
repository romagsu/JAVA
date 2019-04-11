package by.gsu.pms;

public class Byn {
    public static String toBYN(int cent){
        return cent/100 + "." + cent/10%10 + cent % 10+" BYN";
    }

}
