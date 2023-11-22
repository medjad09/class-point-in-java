public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getAbscisse() {
        return this.x;
    }

    public int getOrdonne() {
        return this.y;
    }

    public void setAbscisse(int abscisse) {
        this.x = abscisse;
    }

    public void setOrdonne(int ordonne) {
        this.y = ordonne;
    }

    public double distance(Point p) {
        int x1 = this.getAbscisse();
        int y1 = this.getOrdonne();
        int x2 = p.getAbscisse();
        int y2 = p.getOrdonne();
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public double norme() {
        return Math.sqrt(Math.pow(this.getAbscisse(), 2) + Math.pow(this.getOrdonne(), 2));
    }

    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(4, 6);

        System.out.println("Point 1 - Abscisse: " + point1.getAbscisse() + ", Ordonnée: " + point1.getOrdonne());
        System.out.println("Point 2 - Abscisse: " + point2.getAbscisse() + ", Ordonnée: " + point2.getOrdonne());

        double distance = point1.distance(point2);
        System.out.println("Distance entre les points 1 et 2: " + distance);

        double normePoint1 = point1.norme();
        System.out.println("Norme du point 1: " + normePoint1);

        double normePoint2 = point2.norme();
        System.out.println("Norme du point 2: " + normePoint2);
    }
}
