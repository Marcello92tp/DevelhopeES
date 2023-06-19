package costructor;

public class House {
    String address;
    int numberOfFloors;


    House(String address, int numberOfFloors) {
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        System.out.println("una casa è stata creata a " + address + " " + numberOfFloors);


    }
}

