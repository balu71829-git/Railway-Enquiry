package com.railway.enquiry.model;

public class Enquiry {

    private String passengerName;
    private String trainNumber;
    private String source;
    private String destination;
    private String dateOfJourney;

    public String getPassengerName() { return passengerName; }
    public void setPassengerName(String passengerName) { this.passengerName = passengerName; }

    public String getTrainNumber() { return trainNumber; }
    public void setTrainNumber(String trainNumber) { this.trainNumber = trainNumber; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public String getDateOfJourney() { return dateOfJourney; }
    public void setDateOfJourney(String dateOfJourney) { this.dateOfJourney = dateOfJourney; }
}
