public interface Moveable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class Point implements Moveable {
    private float x;
    private float y;

    public Point(){
        x = 0f;
        y = 0f;
    }

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }
}


class Segment implements Moveable {
    private Point p1;
    private Point p2;
    
    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float y1, float x2, float y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);

    }
    
    public Point getP1() {
        return this.p1;
    }

    public void setP1(Point p) {
        this.p1 = p;
    }

    @Override
    public void moveUp() {
        p1.moveUp();
        p2.moveUp();
    }

    @Override
    public void moveDown() {
        p1.moveDown();
        p2.moveDown();
    }

    @Override
    public void moveLeft() {
        p1.moveLeft();
        p2.moveLeft();
    }

    @Override
    public void moveRight() {
        p1.moveRight();
        p2.moveRight();
    }
} 


class Circle implements Moveable {
    private Point center;
    private float radius;

    public Circle(Point center, float radius) {
        this.center = new Point(center);
        this.radius = radius;
    }

    public Circle(int x, int y, float radius) {
        this.center = new Point(x, y);
        this.radius = radius;
    }

    public Point getCenter() {
        return new Point(center);
    }

    public double getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = new Point(center);
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = (float) radius;
        } else {
            throw new IllegalArgumentException("Radius must be positive");
        }
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }


}
