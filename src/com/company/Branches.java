package com.company;

import java.util.ArrayList;

public class Branches {

    private String branchName;
    private ArrayList<Customer> myCustomer;

    public Branches(String branchName) {
        this.branchName = branchName;
        this.myCustomer = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getMyCustomer() {
        return myCustomer;
    }

    public boolean newCustomer(String customerName, double intialAmount){
        if(findCustomer(customerName) == null){
            this.myCustomer.add(new Customer(customerName,intialAmount));
            return true;
        }
        return false;
   }

   public boolean addTransaction(String customerName, double amount){
        Customer exisitingCustomer = findCustomer(customerName);
        if(exisitingCustomer != null){
            exisitingCustomer.addTransaction(amount);
            return true;
        }
        return false;
   }


    private Customer findCustomer(String customerName) {
        for(int i=0; i<this.myCustomer.size(); i++) {
            Customer checkedCustomer = this.myCustomer.get(i);

            if(checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }


}
