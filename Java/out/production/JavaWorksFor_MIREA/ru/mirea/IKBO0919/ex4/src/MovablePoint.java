public class MovablePoint {
    private int x;
    private int y;
    private final int xVel;
    private final int yVel;

    public MovablePoint(int x, int y, int xVel, int yVel) {
        this.x = x;
        this.y = y;
        this.xVel = xVel;
        this.yVel = yVel;
    }

    public void moveUp() {
        this.y += this.yVel;
    }

    public void moveDown() {
        this.y -= this.yVel;
    }

    public void moveLeft() {
        this.x -= this.xVel;
    }

    public void moveRight() {
        this.x += this.xVel;
    }

    public String toString() {
        return "MovablePoint: x = " + this.x + ", y = " + this.y + ", xVel = " + this.xVel + ", yVel = " + this.yVel;
    }
}
