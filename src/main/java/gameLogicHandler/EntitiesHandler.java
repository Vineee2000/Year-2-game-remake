package gameLogicHandler;

import java.util.ArrayList;
import java.util.LinkedList;

public class EntitiesHandler {
    public static int FIELD_WIDTH = 1980;
    public static int FIELD_HEIGHT = 1080;

    private LinkedList <PlaneWing> planes = new LinkedList<>();
    private ArrayList<AACannon> cannons = new ArrayList<>();
    private LinkedList <Shell> shells = new LinkedList<>();

    EntitiesHandler() {
        startGame();
    }

    void startGame() {
        planes.add(new PlaneWing(1000, 0));

        for (int i = 1; i <= 4; i++) {
            cannons.add(new AACannon(310+264*i, 900));
        }
    }

    void runGame() {
        for (PlaneWing plane : planes) {
            plane.move();
        }
    }

    void addCannon(int xPos, int yPos) {
        cannons.add(new AACannon(xPos, yPos));
    }

    void addPlaneWing(int xPos, int yPos) {
        planes.add(new PlaneWing(xPos, yPos));
    }

    void addShell(Shell shell) {
        shells.add(shell);
    }

    public ArrayList<Entity> getEntities() {
        ArrayList<Entity> list = new ArrayList<>();
        list.addAll(planes);
        list.addAll(cannons);
        list.addAll(shells);
        return list;
    }
}
