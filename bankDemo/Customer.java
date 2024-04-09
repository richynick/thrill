package bankDemo;

public class Customer implements Cloneable{
    private int acctId;
    private String name;
    private int creditScore;

    public Customer(int acctId, String name, int creditScore) {
        this.acctId = acctId;
        this.name = name;
        this.creditScore = creditScore;
    }

    public int getAcctId() {
        return acctId;
    }

    public void setAcctId(int acctId) {
        this.acctId = acctId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }
    public Customer clone() throws CloneNotSupportedException {
        return (Customer) super.clone();
    }
}
