package com.torryharris.jdbc;

import com.torryharris.model.Insurance;

import java.sql.*;
import java.util.ArrayList;

public class InsuranceDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1:3306/company";
            String username="root";
            String password="Jeswanth@2000";
            Connection connection= DriverManager.getConnection(url,username,password);
            System.out.println("Connected to the DB successfully");
            System.out.println();
            Statement statement=connection.createStatement();
            /*System.out.println("Inserting values to the insurance table");
            System.out.println();
            ArrayList<Insurance>insurances=getInsurances();
            for(Insurance ins:insurances){
                String inserQuery="insert into insurance values('"+ins.getIns_name()+"',"+ins.getIns_id()+","+ins.getSum()+",'"+ins.getIns_type()+"')";
                System.out.println(inserQuery);
                statement.execute(inserQuery);
            }
            System.out.println();*/
            System.out.println("All insurance table");
            System.out.println();
            String query="select * from insurance";
            ResultSet resultSet=statement.executeQuery(query);
            while(resultSet.next()){
                String insname= resultSet.getString(1);
                int insid= resultSet.getInt(2);
                long inssum=resultSet.getLong(3);
                String instype= resultSet.getString(4);
                Insurance insurance=new Insurance(insname,insid,inssum,instype);
                System.out.println(insurance);
            }
            System.out.println();
            System.out.println("Where insurance where ins_type='Term'");
            System.out.println();
            String query1="select * from insurance where ins_type='Term'";
            ResultSet resultSet1=statement.executeQuery(query1);
            while (resultSet1.next()){
                String insname= resultSet1.getString(1);
                int insid= resultSet1.getInt(2);
                long inssum=resultSet1.getLong(3);
                String instype= resultSet1.getString(4);
                Insurance insurance=new Insurance(insname,insid,inssum,instype);
                System.out.println(insurance);
            }
            System.out.println();
            System.out.println("Insurance is ordering by sum in assending order");
            System.out.println();
            String query2="select * from insurance order by sum ASC";
            ResultSet resultSet2=statement.executeQuery(query2);
            while (resultSet2.next()){
                String insname= resultSet2.getString(1);
                int insid= resultSet2.getInt(2);
                long inssum=resultSet2.getLong(3);
                String instype= resultSet2.getString(4);
                Insurance insurance=new Insurance(insname,insid,inssum,instype);
                System.out.println(insurance);
            }
            System.out.println();
            System.out.println("Where Insurance sum is greater than 3000000");
            System.out.println();
            String query3="select * from insurance where sum>3000000";
            ResultSet resultSet3=statement.executeQuery(query3);
            while (resultSet3.next()){
                String insname= resultSet3.getString(1);
                int insid= resultSet3.getInt(2);
                long inssum=resultSet3.getLong(3);
                String instype= resultSet3.getString(4);
                Insurance insurance=new Insurance(insname,insid,inssum,instype);
                System.out.println(insurance);
            }
            System.out.println();
            System.out.println("Updating all the insurance sum by 20%");
            System.out.println();
            String query4="update insurance set sum=((sum/100)*20)+sum";
            int resultSet4=statement.executeUpdate(query4);
            String query5="select * from insurance";
            ResultSet resultSet5=statement.executeQuery(query5);
            while(resultSet5.next()){
                String insname= resultSet5.getString(1);
                int insid= resultSet5.getInt(2);
                long inssum=resultSet5.getLong(3);
                String instype= resultSet5.getString(4);
                Insurance insurance=new Insurance(insname,insid,inssum,instype);
                System.out.println(insurance);
            }
            System.out.println("Changes made to column: "+resultSet4);
            statement.close();
            connection.close();


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Insurance> getInsurances(){
        Insurance i1=new Insurance("HDFC",15001,3000000,"Health");
        Insurance i2=new Insurance("AXIS",15002,4000000,"Term");
        Insurance i3=new Insurance("SBI",15003,5000000,"Health");
        Insurance i4=new Insurance("INDIAN",15004,4000000,"Term");
        Insurance i5=new Insurance("LIC",15005,5000000,"Term");
        ArrayList<Insurance>insList=new ArrayList<>();
        insList.add(i1);
        insList.add(i2);
        insList.add(i3);
        insList.add(i4);
        insList.add(i5);
        return insList;
    }
}
