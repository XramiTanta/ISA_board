package LeavingTheBuilding;

import java.util.List;

public class Floor {
    public int width,height;
    public Cell [][] grid;
    public List<Block> pieces;


    public Floor(int width, int height, Cell [][] grid, List<Block> pieces) {
        this.width = width;
        this.height = height;
        this.grid = grid;
        this.pieces = pieces;
    }
}
