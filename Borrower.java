package com.trimindtech.training1.Day8Day9;

import java.util.ArrayList;
import java.util.List;

public class Borrower extends BorrowerFile {
    public ArrayList<BorrowerFile>borrowerfiles = new ArrayList<>();

    public void addBorrower(BorrowerFile borrowerFile){
        borrowerfiles.add(borrowerFile);
        System.out.println("user details has been updated");
        System.out.println(borrowerFile.toString());

    }
public List<BorrowerFile>getAllBorrowerList(){
        return borrowerfiles;

}

}
