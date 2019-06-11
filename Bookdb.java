package com.trimindtech.training1.Day8Day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

import static java.lang.Class.forName;

public class Bookdb {
    public static void main(String[] args) {
        int id = 0;
        int age = 0;
        String name = null;

        Connection con = null;
        Statement st = null;
        String query = null;
        int count = 0;
        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);
            if (scanner != null) {
                System.out.println("enter the id");
                id = scanner.nextInt();

                System.out.println("enter the name");
                name = scanner.next();
                name = "'" + name + "'";

                System.out.println("enter the age");
                age = scanner.nextInt();



            }
          Class.forName("org.git.mm.mysql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "root");

            if (con != null)
                count = st.executeUpdate(query);

            query = "INSERT INTO authors VALUES(+id," + name + ",age)";
            System.out.println(query);


            if (st != null)
                count = st.executeUpdate(query);




            else
                System.out.println("record inserted");

        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("record not inserted");
        }
        finally {
            try {
                if (st != null)
                    st.close();

            }catch (Exception e) {
                e.printStackTrace();
            }
            try{
                if(scanner ==null)

                    scanner.close();

            }catch (Exception e){
                e.printStackTrace();
            }





        }


    }

}

