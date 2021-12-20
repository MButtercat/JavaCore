package org.buttercat.java.lesson006;

public class NonAbstractClient extends AbstractHuman implements Comparable<NonAbstractClient> {

    String bankName;
    public long accountMoney;

    {
        bankName = new String();
        accountMoney = 0;
    }

    @Override
    public void getInfo() {
        System.out.print(toString());
    }

    public NonAbstractClient(String n, String l, String b, long m) {
        super(n, l);
        bankName = b;
        accountMoney = m;
    }

    @Override
    public int compareTo(NonAbstractClient anotherClient){
        return (new Long(accountMoney).compareTo(anotherClient.accountMoney));
    }

    public String toString() {
        return new String(super.firstName + " " + super.lastName + " is a client of " + bankName + " and has " + accountMoney + "$ in the bank account");
    }

    public String getName() {
        return new String(firstName + " " + lastName);
    }
}