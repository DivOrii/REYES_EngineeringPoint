package jvacal.main;

class EngineeringPoint {

    private double x;
    private double y;

    EngineeringPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void setX(double x) {
        this.x = x;
    }

    void setY(double y) {
        this.y = y;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    double calculateDistance(EngineeringPoint point) {
        double dx = point.getX() - this.x;
        double dy = point.getY() - this.y;

        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    double calculateSlope(EngineeringPoint point) {
        double dx = point.getX() - this.x;
        double dy = point.getY() - this.y;

        if (dx == 0) {
            return Double.NaN;
        }

        return dx / dy;
    }
}
