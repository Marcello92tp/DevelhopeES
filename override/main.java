package override;

public class main {
    public static void main(String[] args) {


        Shape sh1 = new Shape("Triangolo", 3);
        Shape sh2 = new Shape("Quadrato", 4);
        Shape sh3 = new Shape("Pentagono", 5);
        Shape sh4 = new Shape("Esagono", 6);
        Shape sh5 = new Shape("Ottagono", 8);




        sh1.getShapeDetails();

        System.out.println();

        sh2.getShapeDetails();

        System.out.println();

        sh3.getShapeDetails();

        System.out.println();

        sh4.getShapeDetails();

        System.out.println();

        sh5.getShapeDetails();


    }
}
