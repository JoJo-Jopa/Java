public class MovableCircle {
    private final int radius;
    private final MovablePoint point;

    public MovableCircle(int x, int y, int xVel, int yVel, int radius) {
        this.radius = radius;
        this.point = new MovablePoint(x, y, xVel, yVel);
    }

    public void moveUp() {
        this.point.moveUp();
    }

    public void moveDown() {
        this.point.moveDown();
    }

    public void moveLeft() {
        this.point.moveLeft();
    }

    public void moveRight() {
        this.point.moveRight();
    }

    public String toString() {
        return "MovableCircle: radius = " + this.radius + " point = " + this.point;
    }
}
