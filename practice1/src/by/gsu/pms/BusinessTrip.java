package by.gsu.pms;

public class BusinessTrip {
    public static final int RATE = 25000;
    public String account;
    public int transport;
    public int days;

    public Byn toByn;

    public BusinessTrip(){
        this.account = null;
        this.transport = 0;
        this.days = 0;
    }

    public BusinessTrip(String name, int transport, int days){
        this.account = name;
        this.transport = transport;
        this.days = days;
    }

    public String getAccount(){
        return account;
    }

    public void setAccount(String account){
        this.account = account;
    }

    public int getTransport(){
        return transport;
    }

    public void setTransport(int transport){
        this.transport = transport;
    }

    public int getDays(){
        return days;
    }

    public void setDays(int days){
        this.days = days;
    }

    public int getTotal(){
        return transport+RATE*days;
    }

    public void show(){ // method show
        System.out.println("rate = "+Byn.toBYN(RATE)
                +"\naccount = "+account
                +"\ntransport = "+Byn.toBYN(transport)
                +"\ndays = "+days
                +"\ntotal = "+Byn.toBYN(getTotal()));
    }

    @Override
    public String toString(){
        return Byn.toBYN(RATE)+"; "+account+"; "+Byn.toBYN(transport)+"; "+days+"; "+Byn.toBYN(getTotal());
    }
}
