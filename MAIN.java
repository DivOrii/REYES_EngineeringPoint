package jvacal.main;

public class MAIN {

    public static void main(String[] args) {
        System.out.println("=== ENGINEERING DISTANCE AND SLOPE ANALYZER");

        EngineeringPoint PointA = new EngineeringPoint(3, 4);
        EngineeringPoint PointB = new EngineeringPoint(9, 12);
        EngineeringPoint PointC = new EngineeringPoint(6, 7);

        System.out.printf("Point A: (%.2f, %.2f)\n", PointA.getX(), PointA.getY());
        System.out.printf("Point B: (%.2f, %.2f)\n", PointB.getX(), PointB.getY());
        System.out.printf("Point C: (%.2f, %.2f)\n", PointC.getX(), PointC.getY());

        double distanceAB = PointA.calculateDistance(PointB);
        double slopeAB = PointA.calculateSlope(PointB);

        System.out.printf("\nDistance (A-B): %.2f units\n", distanceAB);

        if (Double.isNaN(slopeAB)) {
            System.out.println("Slope (A-B): UNDEFIED");
        } else {
            System.out.printf("Slope (A-B): %.2f\n", slopeAB);
        }

        double distanceC = PointC.calculateDistance(PointC);
    }
}
