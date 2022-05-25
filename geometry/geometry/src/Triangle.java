public class Triangle implements Polygon{  
    Double[] sides = new Double[3];
    Double b = 0.0;
    Double h = 0.0;
    Double s = 0.0;

    private Triangle() {}

    public Triangle(Double l1, Double l2, Double l3){
        this.sides[0] = l1;
        this.sides[1] = l2;
        this.sides[2] = l3;
        this.s = (l1+l2+l3)/2;
    }
    
    public Double area() {
        return Math.sqrt((s*(s-sides[0])*(s-sides[1])*(s-sides[2])));
    }

    public Double perimeter() {
        Double perimeter = 0.0;
        for (Double side : sides) {
            perimeter += side;
        }
        return perimeter;
    }
}
