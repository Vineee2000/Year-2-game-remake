package gameLogicHandler;

import lombok.Getter;

public abstract class Entity implements EntityInterface {
    @Getter int xPosition;
    @Getter int yPosition;
    @Getter int size;

    /**
     * * A fallback constructor for entities with a default size
     * @param xPosition
     * @param yPosition
     */
    Entity(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        size = 50;
    }

    @Override
    public int getXPosition() {
        return xPosition;
    }

    @Override
    public int getYPosition() {
        return yPosition;
    }

    @Override
    public void setXPosition(int newX) {
        xPosition = newX;
    }

    @Override
    public void setYPosition(int newY) {
        yPosition = newY;
    }

    @Override
    public int getSize() {
        return size;
    }


}
