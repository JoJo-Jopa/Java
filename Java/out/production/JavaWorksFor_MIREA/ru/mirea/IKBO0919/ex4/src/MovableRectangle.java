public class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xVel, int yVel) {
        this.topLeft = new MovablePoint(x1, y1, xVel, yVel);
        this.bottomRight = new MovablePoint(x2, y2, xVel, yVel);
    }

    public void moveUp() {
        this.topLeft.moveUp();
        this.bottomRight.moveUp();
    }

    public void moveDown() {
        this.topLeft.moveDown();
        this.bottomRight.moveDown();
    }

    public void moveLeft() {
        this.topLeft.moveLeft();
        this.bottomRight.moveLeft();
    }

    public void moveRight() {
        this.topLeft.moveRight();
        this.bottomRight.moveRight();
    }

    public String toString() {
        return "MovableRectangle: topLeft = " + this.topLeft + " bottomRight = " + this.bottomRight;
    }

}
