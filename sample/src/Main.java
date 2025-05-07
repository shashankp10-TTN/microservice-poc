class Bank {
    protected String name;
    protected String headofficeAddress;
    protected String chairmanName;
    protected int branchCount;
    protected double fdInterestRate;
    protected double personalLoanInterestRate;
    protected double homeLoanInterestRate;

    public Bank(String name, String headofficeAddress, String chairmanName, int branchCount, double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate){
        this.name = name;
        this.headofficeAddress = headofficeAddress;
        this.chairmanName = chairmanName;
        this.branchCount = branchCount;
        this.fdInterestRate = fdInterestRate;
        this.personalLoanInterestRate = personalLoanInterestRate;
        this.homeLoanInterestRate = homeLoanInterestRate;
    }
    // Getter Methods
    public String getName(){
        return name;
    }
    public String getHeadofficeAddress() {
        return headofficeAddress;
    }
    public String getChairmanName() {
        return chairmanName;
    }
    public int getBranchCount() {
        return branchCount;
    }
    public double getFdInterestRate() {
        return fdInterestRate;
    }

    public double getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    // Setter methods
    public void setName(String name){
        this.name = name;
    }
    public void setHeadofficeAddress(String headofficeAddress){
        this.headofficeAddress = headofficeAddress;
    }
    public void setChairmanName(String chairmanName){
        this.chairmanName = chairmanName;
    }
    public void setBranchCount(int branchCount){
        this.branchCount = branchCount;
    }
    public void setFdInterestRate(double fdInterestRate){
        this.fdInterestRate = fdInterestRate;
    }
    public void setPersonalLoanInterestRate(double personalLoanInterestRate){
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public void setHomeLoanInterestRate(double homeLoanInterestRate){
        this.homeLoanInterestRate = homeLoanInterestRate;
    }
    @Override
    public String toString() {
        return "Bank Name: " + name +
                "\nHead Office: " + headofficeAddress +
                "\nChairman: " + chairmanName +
                "\nBranch Count: " + branchCount +
                "\nFD Interest Rate: " + fdInterestRate + "%" +
                "\nPersonal Loan Interest Rate: " + personalLoanInterestRate + "%" +
                "\nHome Loan Interest Rate: " + homeLoanInterestRate + "%\n";
    }
}


class SBI extends Bank {
    public SBI(){
        super("SBI", "New Delhi", )
    }

}

class BOI extends Bank {

}

class ICICI extends Bank {

}

public class Main {

}



