package gameLogicHandler;

class PlaneWing extends Entity implements EntityMoving, EntityCollidable {
    int hitPoints = 4;
    int ySpeed = 1;


    PlaneWing(int xPosition, int yPosition) {
        super(xPosition, yPosition);
    }

    @Override
    public void move() {
        this.yPosition = yPosition + ySpeed;
    }
}
