public abstract class Division {
    protected String divisionTitle;
    protected int accountNum;

    public Division(String title, int account){
        divisionTitle = title;
        accountNum = account;
    }
    public abstract void display();

}
