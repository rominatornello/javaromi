package examples;

import examples.Thread.Position;

/**
 * Created by romina.tornello on 3/2/2015.
 */
public class Wagon {
    Dupla dupla;

    public Position getPositionMap() {
        return positionMap;
    }

    public void setPositionMap(Position positionMap) {
        this.positionMap = positionMap;
    }

    Position positionMap;
}
