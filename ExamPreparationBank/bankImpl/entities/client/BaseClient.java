package bank.entities.client;

import bank.common.StringUtils;


import static bank.common.ExceptionMessages.*;

public abstract class BaseClient implements Client{
    private String name;
    private String ID;
    private  int interest;
    private  double income;


    @Override
    public void setName(String name) {
        if (StringUtils.nullOrEmpty(name)){
            throw new IllegalArgumentException (CLIENT_NAME_CANNOT_BE_NULL_OR_EMPTY);
        }
        this.name = name;

    }

    private void setID(String ID) {
        if (StringUtils.nullOrEmpty(ID)){
            throw  new IllegalArgumentException(CLIENT_ID_CANNOT_BE_NULL_OR_EMPTY);
        }
        this.ID = ID;
    }

    private void setIncome(double income) {
        if (income <= 0){
            throw new IllegalArgumentException(CLIENT_INCOME_CANNOT_BE_BELOW_OR_EQUAL_TO_ZERO);
        }
        this.income = income;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    protected BaseClient(String name, String ID, int interest, double income) {
        setName(name);
        setID(ID);
        this.interest = interest;
        setIncome(income);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getInterest() {
        return interest;
    }

    @Override
    public double getIncome() {
        return income;
    }
}

