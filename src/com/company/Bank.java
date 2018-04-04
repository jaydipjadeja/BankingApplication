package com.company;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branches> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<Branches>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branches(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double intialAmount){
        Branches branches = findBranch(branchName);
        if(branches != null){
            return branches.newCustomer(customerName,intialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branches branches = findBranch(branchName);
        if(branches != null){
            return branches.addTransaction(customerName,amount);
        }
        return false;
    }
    private Branches findBranch(String customerName) {
        for(int i=0; i<this.branches.size(); i++) {
            Branches checkedBranch = this.branches.get(i);

            if(checkedBranch.getBranchName().equals(customerName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransaction) {

        Branches branches = findBranch(branchName);
        if (branches != null) {
            System.out.println("Customer details for branch " + branches.getBranchName());

            ArrayList<Customer> branchCustomers = branches.getMyCustomer();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");
                if (showTransaction) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }

    }
}
