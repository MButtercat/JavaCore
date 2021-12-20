package org.buttercat.java.lesson006;

public class NonAbstractBankEmployee extends AbstractHuman implements Comparable<NonAbstractBankEmployee> {

    String bankName;
    public long accountMoney;
    public long makeMoney;

    {
        bankName = new String();
        accountMoney = 0;
        makeMoney = 0;
    }

    @Override
    public void getInfo() {
        toString();
    }

    public NonAbstractBankEmployee(String n, String l, String b, long m, long mm) {
        super(n, l);
        bankName = b;
        accountMoney = m;
        makeMoney = mm;
    }

    @Override
    public int compareTo(NonAbstractBankEmployee anotherEmployee){
        return (new Long(makeMoney).compareTo(anotherEmployee.makeMoney));
    }

    public String toString() {
        return new String(super.firstName + " " + super.lastName + " is a " + bankName + " bank employee" + ", has " + accountMoney + "$ in the bank account and makes " + makeMoney + "$ for bank");
    }

    public String getName() {
        return new String(firstName + " " + lastName);
    }
}