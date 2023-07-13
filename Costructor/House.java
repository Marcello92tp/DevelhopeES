package Costructor;

public class House {
    private String address;
    private Integer numberOfFloors;


    House(String address, Integer numberOfFloors) {
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        System.out.println("una casa è stata creata a " + address + " " + numberOfFloors);


    }
}

