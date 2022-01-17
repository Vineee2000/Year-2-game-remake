package gameLogicHandler;

class Shell extends Entity implements EntityMoving, EntityCollidable {
    int xSpeed;
    int ySpeed;

    Shell(int xPosition, int yPosition) {
        super(xPosition, yPosition);
    }

    @Override
    public void move() {
        this.xPosition = xPosition + xSpeed;
        this.yPosition = yPosition + ySpeed;
    }
}
