class Triangle {

    private double side1;
    private double side2;
    private double side3;

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        double sumOfSide1Side2 = side1 + side2;
        double sumOfSide1Side3 = side1 + side3;
        double sumOfSide2Side3 = side2 + side3;
        /*if (side1 == 0 || side2 == 0 || side3 == 0) throw new TriangleException();
        if (sumOfSide1Side2 < side3 || sumOfSide1Side3 < side2 || sumOfSide2Side3 < side1) throw new TriangleException();*/
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    boolean isEquilateral() {

        if (side3 == side1 && side3 == side2) {
            return true;
        } else {
            return false;
        }
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    boolean isIsosceles() {
        if ((side3 == side2 || side3 == side1 || side1 == side2) && !isEquilateral()) {
            return true;
        } else {
            return false;
        }
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    boolean isScalene() {
        if (!isEquilateral() && !isIsosceles()){
            return true;
        }else {
            return false;
        }
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
