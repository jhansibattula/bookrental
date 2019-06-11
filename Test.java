package com.trimindtech.training1.Day8Day9;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Test {

    public static void  main (String args[]){


            String dname = null;
            int sid = 0;
            String adress = null;
            Connection con = null;
            Statement st = null;
            String query = null;
             int count = 0;
             Scanner sc=null;
            //read inputs
            try {
                sc = new Scanner(System.in);
                if (sc != null) {
                    System.out.println("Enter name::");
                    dname= sc.next();
                    //dname = "'" + dname + "'";
                    System.out.println("Enter sid::");
                    sid = sc.nextInt();
                    System.out.println("Enter Address::");
                    adress = sc.next();
                   // adress = "'" + adress + "'";
                }
                Class.forName("org.gjt.mm.mysql.Driver");
                 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jhansi1","root","root");
                if (con != null)
                    st = con.createStatement();
                 query = "insert into departments values(" + dname + "," + sid + "," + adress+ ")";
                System.out.println(query);
                if (st != null)
                    count = st.executeUpdate(query);

                if (count == 0)
                    System.out.println("Record not inserted");
                else
                    System.out.println("Record inserted");
            }//try
            catch (Exception e) {
                e.printStackTrace();

                System.out.println("Record not inserted");
            }
            finally {
                    try {
                    if (st != null)
                        st.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                try {
                    if (con != null)
                        con.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    if (sc!= null)
                        sc.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

