package eserciziostatic;

import java.util.Random;

public class Testclass {
    public static void main(String[] args) {


        Employee em = new Employee("marcello", "gerardi", "via borgomanero ");
        Employee em2 = new Employee("elio", "barbone", "via gaidano 8");

        Badge b1 = new Badge(em);
        Badge b2 = new Badge(em2);

        b1.showBadgeDetails();
        b2.showBadgeDetails();

    }

}