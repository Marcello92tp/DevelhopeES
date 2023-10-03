package override;

public class Shape {

    private String shapeName;

    private Integer numberOfEdges;

    public Shape(String shapeName, Integer numberOfEdges) {
        this.shapeName = shapeName;
        this.numberOfEdges = numberOfEdges;
    }
 public Shape(Integer EDGE1, Integer EDGE2, Integer EDGE3){
        this.shapeName = "Triangle";
        this.numberOfEdges = 3;
 }
    public void getShapeDetails(){
        System.out.println("Shape Name: " + shapeName + "\nNumber Of Edges: " + numberOfEdges);
    }

}
