package com.reset;

public class BankAcc {
    // Uma classe de objeto que representa uma conta bancária

    int id;
    private String name;
    private float balance;
    private String accType;

    public BankAcc(int id, String name, int acc){
        String[] type = new String[]{"Savings Account", "Checking Account"};
        this.id = id;
        this.name = name;
        this.balance = 0;
        this.accType = type[acc];
    }

    public void getBankStatement(){
        System.out.println("------------------------------");
        System.out.println("--B A N K  S T A T E M E N T--");
        System.out.println("\nAcc ID: "+this.id);
        System.out.println("Account holder: "+this.name);
        System.out.println("Account type: "+this.accType);
        System.out.println("Account Balance: R$"+this.balance);
        System.out.println("\n------------------------------");
    }

    public void setDeposit(float cash){
        this.balance += cash;
        getBankStatement();
    }

    public void setWithdraw(float cash){
        this.balance -= cash;
        getBankStatement();
    }


}
