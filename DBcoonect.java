package com.trimindtech.training1.Day8Day9;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBcoonect {
    public  static Connection con;
    static {
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookrental","root","root");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    static Connection getCon(){
        return con;
    }

}
