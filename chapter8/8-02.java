class InvalidWithdraw extends Exception {
    private static final long serialVersionUID = 1L;
    public InvalidWithdraw(String msg) {
        super(msg);
    }
}

class BankAccount {
    private int money;

    public BankAccount(int money) {
        this.money = money;
    }

    public void deposit(int money) {
        this.money += money;
    }

    public void witdraw(int money) throws InvalidWithdraw{
        if(money<0 || this.money<money) {
            throw new InvalidWithdraw("HI");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(-100000);
        
        try{
            ba.witdraw(5000000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}