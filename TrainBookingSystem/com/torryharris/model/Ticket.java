package com.torryharris.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class Ticket {
    private static int counter=100;
    private String pnr;
    private Date travelDate;
    private Train train;
    private TreeMap<Passenger,Double>passengers=new TreeMap<>();
    private String generatePnr(){
        char source=train.getSource().charAt(0);
        char destination=train.getDestination().charAt(0);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        String strDate=sdf.format(travelDate);
        String pnr= ""+source+""+destination+"_"+strDate+"_"+counter++ +"";
        return pnr;
    }
    private double calculatePassengerFare(Passenger passenger){
        double ticketPrize=train.getTicket_prize();
        int age=passenger.getAge();
        char gender=passenger.getGender();
        if(age<=12){
            ticketPrize=(ticketPrize)/2;
        }
        else if(age>=60){
            ticketPrize=(ticketPrize*3)/5;
        }
        else if(gender=='F'){
            ticketPrize=(ticketPrize*3)/4;
            System.out.println(ticketPrize);
        }
        return ticketPrize;
    }
    private double calculateTotalTicketPrize(){
        double totalTicketPrize=0;
        for(Map.Entry<Passenger,Double> itr:passengers.entrySet()){
            totalTicketPrize+=itr.getValue();
        }
        return totalTicketPrize;
    }
    private StringBuilder generateTicket(){
        StringBuilder stringBuilder=new StringBuilder();
        this.pnr=generatePnr();
        double totalTicketPrize=calculateTotalTicketPrize();
        stringBuilder.append("PNR :"+pnr+"\n")
                .append("Train no :"+train.getTrain_no()+"\n")
                .append("Train Name :"+train.getTrain_name()+"\n")
                .append("From :"+train.getSource()+"\n")
                .append("To :"+train.getDestination()+"\n")
                .append("Travel Date"+travelDate+"\n")
                .append("Passengers :"+"\n")
                .append("Name                    Age          Gender        Fare"+"\n");
        for(Map.Entry<Passenger,Double> itr:passengers.entrySet()){
            stringBuilder.append(itr.getKey().getName()+"                       "+itr.getKey().getAge()+"             "+itr.getKey().getGender()+"        "+itr.getValue()+"\n");
        }
        stringBuilder.append("Total Prize :"+totalTicketPrize);
        return stringBuilder;
    }
    public void addPassenger(String name,int age,char gender){
        Passenger passenger=new Passenger(name,age,gender);
        double ticketprize=calculatePassengerFare(passenger);
        passengers.put(passenger,ticketprize);
    }
    public void writeTicket(){
        System.out.println(this.generateTicket());
    }

    public Ticket() {
    }

    public Ticket(Date travelDate, Train train) {
        this.travelDate = travelDate;
        this.train = train;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public Date getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(Date travelDate) {
        this.travelDate = travelDate;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public TreeMap<Passenger, Double> getPassengers() {
        return passengers;
    }

    public void setPassengers(TreeMap<Passenger, Double> passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "counter=" + counter +
                ", pnr='" + pnr + '\'' +
                ", travelDate=" + travelDate +
                ", train=" + train +
                ", passengers=" + passengers +
                '}';
    }
}
