public class DomesticDivision extends Division {
    protected String state;
    public DomesticDivision(String title, int account, String st){
        super(title, account);
        state = st;
    }
    public void display(){
        System.out.println("Domestic division: " + divisionTitle + " Account" + accountNum + " located in" + state);
    }

}
