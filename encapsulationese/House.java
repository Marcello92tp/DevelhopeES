package encapsulationese;

//Encapsulation
//        Achieve encapsulation using getters/setters for a class House that has the following instance variables:
//        an int floorsNumber
//        a string address
//        an array of strings residentsNames
//
public class House {

    private int floorsNumber;
    private String address;
    private String[] residentName;

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public int getFloorsNumber() {
        return floorsNumber;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setResidentName(String[]residentName){
        this.residentName = residentName;
    }
    public String[] getResidentName(){
        return residentName;
    }
}