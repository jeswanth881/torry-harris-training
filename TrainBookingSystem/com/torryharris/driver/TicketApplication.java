package com.torryharris.driver;

import com.torryharris.jdbc.TrainDAO;
import com.torryharris.model.Ticket;
import com.torryharris.model.Train;

import java.sql.*;
import java.util.Date;
import java.util.Scanner;

public class TicketApplication {
    public static void main(String[] args) throws SQLException {
        Connection connection=TrainDAO.trainDAO();
        Statement statement=connection.createStatement();
        Train train=new Train();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Train Number");
        int train_no=s.nextInt();
        String query="select * from train where train_no="+ train_no;
        ResultSet resultSet= statement.executeQuery(query);
        while(resultSet.next()){
            train.setTrain_no(resultSet.getInt(1));
            train.setTrain_name(resultSet.getString(2));
            train.setSource(resultSet.getString(3));
            train.setDestination(resultSet.getString(4));
            train.setTicket_prize(resultSet.getDouble(5));
        }
        s.nextLine();
        System.out.println("Enter Travel Date ");
        String date=s.nextLine();
        Date date1=new Date(date);
        Ticket ticket=new Ticket(date1,train);
        ticket.setTravelDate(date1);
        System.out.println("Enter Number of Passengers ");
        int numberOfPassengers=s.nextInt();
        s.nextLine();
        for(int i=0;i<numberOfPassengers;i++){
            System.out.println("Enter your name");
            String name=s.nextLine();
            System.out.println("Enter your age");
            int age=s.nextInt();
            System.out.println("Enter your gender as M/F");
            char gender=s.next().charAt(0);
            s.nextLine();
            ticket.addPassenger(name,age,gender);
        }
        ticket.writeTicket();
    }
}
