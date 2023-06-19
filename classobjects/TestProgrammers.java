package classobjects;
//create a Java tester class called T estProgrammers where you
//        create 2 Programmer objects (class instance)
//        define the state of the objects by assigning values to the instance variables
//        call the drinkCoffee() and printDetails() methods for the first Programmer object
//        call the printDetails() and hasGlasses() methods for the second Programmer object
public class TestProgrammers {
        public static void main(String[] args) {
                programmer programmer1 = new programmer();
                programmer1.Name = "Marcello";
                programmer1.Age = 31;
                programmer1.wearGlasses = true;
                programmer1.drinkCoffe();
                programmer1.printDetails();

                programmer programmer2 = new programmer();
                programmer2.Name = "Mario";
                programmer2.wearGlasses = false;
                programmer2.Age = 29;
                programmer2.hasGlasses();
                programmer2.printDetails();

        }
}

