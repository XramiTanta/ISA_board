package LeavingTheBuilding;

public class Cell {
    int xCoordinate;
    int yCoordinate;
    CellType type;

    public Cell() {
        this.xCoordinate = 0;
        this.yCoordinate = 0;
        this.type = CellType.EMPTY;
    }

    public Cell(Cell cell){
        this.xCoordinate = cell.getXCoordinate();
        this.yCoordinate = cell.getYCoordinate();
        this.type = cell.getType();
    }

    public Cell( CellType type ,int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.type = type;
    }


    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    private void setType(CellType type){
        this.type = type;
    }


    public void setCell(int xCoordinate,int yCoordinate,CellType type) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.type = type;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public CellType getType() {
        return type;
    }

    public String toString(){
        return "Cell("+ this.getXCoordinate() + "," +this.getYCoordinate()+")"
                +"type:" + this.getType();
    }

}

//  this function for replace the type of the cell
//  for save the type in String
//    private void TypeReplace(){
//        switch (this.value) {
//            case 0:
//                this.setType(CellType.EMPTY);
//                break;
//            case 1:
//                this.setType(CellType.STONE);
//                break;
//            case 2:
//                this.setType(CellType.WOOD);
//                break;
//        }
//    }

