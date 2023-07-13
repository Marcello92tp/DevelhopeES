package encapsulationese;

// use a tester class to:
//        set the values by asking the user to input them
//        for the residentsNames, the user will have to input a list of names separated by a comma (e.g. John,Lucy,Peter)
//        prints the house details using the getters and String.format()
public class testerhouse {
    public static void main(String[] args) {
        String[] residents = {"Marcello, Cristian, Pietro"};
        House house = new House();
        house.setAddress("Via poggio 6");
        house.setFloorsNumber(2);
        house.setResidentName(residents);

        String formatted = String.format("the house is %s has %d floors and is occuped by %s", house.getAddress(),house.getFloorsNumber(),String.join(",", house.getResidentName()));
        System.out.println(formatted);
    }
}
