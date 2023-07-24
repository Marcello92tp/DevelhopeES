package override;

public class Shape {

    private String shapeName;

    private Integer numberOfEdges;

    public Shape(String shapeName, Integer numberOfEdges) {
        this.shapeName = shapeName;
        this.numberOfEdges = numberOfEdges;
    }

    public void getShapeDetails(){
        System.out.println("Shape Name: " + shapeName + "\nNumber Of Edges: " + numberOfEdges);
    }

}
