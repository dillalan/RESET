package com.reset;

public class BankSim {
    public static void main(String[] args) {
        BankAcc jubileu = new BankAcc(1,"Jubileu", 0);
        jubileu.getBankStatement();
        BankAcc creuza = new BankAcc(2,"Creuza", 1);
        creuza.getBankStatement();
        creuza.setDeposit(500);
        jubileu.setDeposit(300);
        creuza.setWithdraw(100);
    }
}
