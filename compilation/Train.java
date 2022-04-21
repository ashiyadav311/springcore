package com.springcore.compilation;

import java.sql.Time;
import java.util.List;
import java.time.LocalTime;
public class Train {
    private String TrainName;
    private int PNRnumber;
    private String ArrivalTime;
    private String DepartureTime;
    private String BoardingStn;
    private String Destination;
    private List<Passenger> P;

    public String getTrainName() {
        return TrainName;
    }

    public void setTrainName(String trainName) {
        TrainName = trainName;
    }

    public int getPNRnumber() {
        return PNRnumber;
    }

    public void setPNRnumber(int PNRnumber) {
        this.PNRnumber = PNRnumber;
    }

    public String getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        ArrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(String departureTime) {
        DepartureTime = departureTime;
    }

    public String getBoardingStn() {
        return BoardingStn;
    }

    public void setBoardingStn(String boardingStn) {
        BoardingStn = boardingStn;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public List<Passenger> getP() {
        return P;
    }

    public void setP(List<Passenger> p) {
        P = p;
    }

    public Train(String trainName, int PNRnumber, String arrivalTime, String departureTime, String boardingStn, String destination, List<Passenger> p) {
        TrainName = trainName;
        this.PNRnumber = PNRnumber;
        ArrivalTime = arrivalTime;
        DepartureTime = departureTime;
        BoardingStn = boardingStn;
        Destination = destination;
        P = p;
    }

    public Train() {

        super();
    }

    @Override
    public String toString() {
        return "Train{" +
                "TrainName='" + TrainName + '\'' +
                ", PNRnumber=" + PNRnumber +
                ", ArrivalTime='" + ArrivalTime + '\'' +
                ", DepartureTime='" + DepartureTime + '\'' +
                ", BoardingStn='" + BoardingStn + '\'' +
                ", Destination='" + Destination + '\'' +
                ", P=" + P +
                '}';
    }
}
