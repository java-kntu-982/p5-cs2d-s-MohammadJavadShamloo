package ir.ac.kntu.cs2d.GameLogics.Map;

import javafx.scene.shape.Rectangle;

import java.util.List;

public class Map {
    private final int mapWidth = 900,mapHeight = 600;
    private final int bombSideWidth = 50,bombSideHeight = 50;
    private final int tSpawnWidth = 50,tSpawnHeight = 50;
    private final int ctSpawnWidth = 50,ctSpawnHeight = 50;
    private List<Rectangle> creamWalls;
    private List<Rectangle> orangeWalls;
    private List<Rectangle> grayBoxes;
    private List<Rectangle> brownBoxes;

    public Map(List<Rectangle> creamWalls, List<Rectangle> orangeWalls,
               List<Rectangle> grayBoxes, List<Rectangle> brownBoxes) {
        this.creamWalls = creamWalls;
        this.orangeWalls = orangeWalls;
        this.grayBoxes = grayBoxes;
        this.brownBoxes = brownBoxes;
    }

    public int getMapWidth() {
        return mapWidth;
    }

    public int getMapHeight() {
        return mapHeight;
    }

    public int getBombSideWidth() {
        return bombSideWidth;
    }

    public int getBombSideHeight() {
        return bombSideHeight;
    }

    public int gettSpawnWidth() {
        return tSpawnWidth;
    }

    public int gettSpawnHeight() {
        return tSpawnHeight;
    }

    public int getCtSpawnWidth() {
        return ctSpawnWidth;
    }

    public int getCtSpawnHeight() {
        return ctSpawnHeight;
    }

    public List<Rectangle> getCreamWalls() {
        return creamWalls;
    }

    public void setCreamWalls(List<Rectangle> creamWalls) {
        this.creamWalls = creamWalls;
    }

    public List<Rectangle> getOrangeWalls() {
        return orangeWalls;
    }

    public void setOrangeWalls(List<Rectangle> orangeWalls) {
        this.orangeWalls = orangeWalls;
    }

    public List<Rectangle> getGrayBoxes() {
        return grayBoxes;
    }

    public void setGrayBoxes(List<Rectangle> grayBoxes) {
        this.grayBoxes = grayBoxes;
    }

    public List<Rectangle> getBrownBoxes() {
        return brownBoxes;
    }

    public void setBrownBoxes(List<Rectangle> brownBoxes) {
        this.brownBoxes = brownBoxes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Map)) return false;

        Map map = (Map) o;

        if (getMapWidth() != map.getMapWidth()) return false;
        if (getMapHeight() != map.getMapHeight()) return false;
        if (getBombSideWidth() != map.getBombSideWidth()) return false;
        if (getBombSideHeight() != map.getBombSideHeight()) return false;
        if (gettSpawnWidth() != map.gettSpawnWidth()) return false;
        if (gettSpawnHeight() != map.gettSpawnHeight()) return false;
        if (getCtSpawnWidth() != map.getCtSpawnWidth()) return false;
        if (getCtSpawnHeight() != map.getCtSpawnHeight()) return false;
        if (getCreamWalls() != null ? !getCreamWalls().equals(map.getCreamWalls()) : map.getCreamWalls() != null)
            return false;
        if (getOrangeWalls() != null ? !getOrangeWalls().equals(map.getOrangeWalls()) : map.getOrangeWalls() != null)
            return false;
        if (getGrayBoxes() != null ? !getGrayBoxes().equals(map.getGrayBoxes()) : map.getGrayBoxes() != null)
            return false;
        return getBrownBoxes() != null ? getBrownBoxes().equals(map.getBrownBoxes()) : map.getBrownBoxes() == null;
    }

    @Override
    public int hashCode() {
        int result = getMapWidth();
        result = 31 * result + getMapHeight();
        result = 31 * result + getBombSideWidth();
        result = 31 * result + getBombSideHeight();
        result = 31 * result + gettSpawnWidth();
        result = 31 * result + gettSpawnHeight();
        result = 31 * result + getCtSpawnWidth();
        result = 31 * result + getCtSpawnHeight();
        result = 31 * result + (getCreamWalls() != null ? getCreamWalls().hashCode() : 0);
        result = 31 * result + (getOrangeWalls() != null ? getOrangeWalls().hashCode() : 0);
        result = 31 * result + (getGrayBoxes() != null ? getGrayBoxes().hashCode() : 0);
        result = 31 * result + (getBrownBoxes() != null ? getBrownBoxes().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Map{" +
                "mapWidth=" + mapWidth +
                ", mapHeight=" + mapHeight +
                ", bombSideWidth=" + bombSideWidth +
                ", bombSideHeight=" + bombSideHeight +
                ", tSpawnWidth=" + tSpawnWidth +
                ", tSpawnHeight=" + tSpawnHeight +
                ", ctSpawnWidth=" + ctSpawnWidth +
                ", ctSpawnHeight=" + ctSpawnHeight +
                ", creamWalls=" + creamWalls +
                ", orangeWalls=" + orangeWalls +
                ", grayBoxes=" + grayBoxes +
                ", brownBoxes=" + brownBoxes +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
