package eserciziostatic;

import java.util.Random;

public class Badge {
    private static int totalNumberOfEmployees = 0;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber() {
        totalNumberOfEmployees++;
    }


    private String StringaRandom(int length) {
        String XYZ = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder randomString = new StringBuilder();
        Random r = new Random();

        for (int i = 0; i <length; i++) {

            randomString.append(XYZ.charAt(r.nextInt(XYZ.length())));
        }

        return randomString.toString();
    }


    private String generateBadgeIdCode() {
        String XYZ1 = StringaRandom(3);
        String XYZ2 = StringaRandom(3);
        return XYZ1 + employee.name + employee.surname + XYZ2;
    }

    public void showBadgeDetails() {
        System.out.println("il numero degli impiegati è: " + totalNumberOfEmployees);
        System.out.println("i dettagli sono:" + employee.getEmployeeDetails());
        System.out.println("codice id del badge è: " + badgeIdCode);
    }

    public Badge(Employee employeeThatNeedsBadge) {
        keepTrackOfEmployeesNumber();
        employee = employeeThatNeedsBadge;
        badgeIdCode = generateBadgeIdCode();
    }
}
