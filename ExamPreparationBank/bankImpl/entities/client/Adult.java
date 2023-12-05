package bank.entities.client;

public class Adult extends BaseClient{
    @Override
    public void increase() {

    }

    public Adult(String name, String ID, double income) {
        super(name, ID, 4, income);
    }

    @Override
    public void setInterest(int interest) {
        int newInterest = getInterest() + 2;
       setInterest(newInterest);
    }
}

