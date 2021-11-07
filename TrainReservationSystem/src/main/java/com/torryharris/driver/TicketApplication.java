package com.torryharris.driver;

import com.torryharris.jdbc.TrainDAO;
import com.torryharris.model.Ticket;
import com.torryharris.model.Train;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TicketApplication {
    private static int train_no;
    private static Train train=new Train();
    private static int numberOfPassengers;
    public static void main(String[] args) throws SQLException, ParseException {
        TicketApplication application=new TicketApplication();
        application.getConnection();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Train Number");
        train_no=s.nextInt();
        application.getSupport();
        s.nextLine();
        System.out.println("Enter Travel Date ");
        String date=s.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calobj = Calendar.getInstance();
        Date enteringDate = sdf.parse(date);
        Date dateobj = new Date();
        Date currentDate=sdf.parse(sdf.format(dateobj));
        if(enteringDate.compareTo(currentDate)>=0) {
            Ticket ticket = new Ticket(currentDate, train);
            ticket.setTravelDate(currentDate);
            System.out.println("Enter Number of Passengers ");
            numberOfPassengers = s.nextInt();
            s.nextLine();
            for (int i = 0; i < numberOfPassengers; i++) {
                System.out.println("Enter your name");
                String name = s.nextLine();
                System.out.println("Enter your age");
                int age = s.nextInt();
                System.out.println("Enter your gender as M/F");
                char gender = s.next().charAt(0);
                s.nextLine();
                ticket.addPassenger(name, age, gender);
            }
            ticket.writeTicket();
        }
        else{
            System.out.println("Trravel date should be greater than the current date &\nshould be equal to current date\nThank you\nvisit again...............");
        }
    }
    private void getConnection() throws SQLException {
        Connection connection=TrainDAO.trainDAO();
        Statement statement=connection.createStatement();
    }
    private void getSupport() throws SQLException {
        Connection connection=TrainDAO.trainDAO();
        Statement statement=connection.createStatement();
        String query="select * from train where train_no="+ train_no;
        ResultSet resultSet= statement.executeQuery(query);
        while(resultSet.next()){
            train.setTrain_no(resultSet.getInt(1));
            train.setTrain_name(resultSet.getString(2));
            train.setSource(resultSet.getString(3));
            train.setDestination(resultSet.getString(4));
            train.setTicket_prize(resultSet.getDouble(5));
        }
    }
}
