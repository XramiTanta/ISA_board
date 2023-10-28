package LeavingTheBuilding;

import java.util.ArrayList;
import java.util.List;

public class Block {
    private static int counter=0;
    private int id = counter;
    public CellType type;
    public List<Cell> cells;

    public Block(CellType type,Cell cell) {
        counter++;
        this.type = type;
        this.cells = new ArrayList<Cell>();
        this.cells.add(cell);
    }


    public Block(CellType type, List<Cell> cells) {
        counter++;
        this.type = type;
        this.cells = new ArrayList<Cell>(cells);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CellType getType() {
        return type;
    }

    public void setType(CellType type) {
        this.type = type;
    }

    public List<Cell> getCells() {
        return cells;
    }

    public void setCells(List<Cell> cells) {
        this.cells = cells;
    }


    public void addToCells(Cell cell){
        this.cells.add(cell);
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        for(int i=0;i<this.getCells().size();i++) {
            s.append(this.getCells().get(i).toString()+'\n');
        }
        return "Block(" + this.getId() + "):type " + this.getType()
                +"\n" + "cells :\n"+s ;
    }

}
