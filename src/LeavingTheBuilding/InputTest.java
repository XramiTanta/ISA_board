package LeavingTheBuilding;

import java.util.ArrayList;
import java.util.List;

public class InputTest {
    int[][] cellsInput;
    int width,height;
    List<Block> pieces;


    public InputTest(int width,int height,int[][] cellsInput) {
        this.width =width ;
        this.height = height ;
        this.pieces = new ArrayList<Block>();
        this.cellsInput = cellsInput;
//        input the pieces
        scanBoardArrayInput(cellsInput);

    }

    public void scanBoardArrayInput(int [][] cells){
        int data =0; //for compare
        int i =0,j =0;
        for(j =0;j < this.width;j++){       //for pass on column by column
            i=0;
            while (i != this.height){       //for pass on row by row
                if(cells[i][j] == 0){       //this cell is type of empty and i don't care about it
                    data=0;
                    i++;
                }
                else
                {
                    if(cells[i][j] != data){        //for make new block and add this cell to this block
                        data=cells[i][j];
                        this.pieces.add(new Block(checkType(data),new Cell(checkType(data),i,j)));
                        i++;
                    }
                    else{                           //add new cells to last block i added it
                        this.pieces.get(this.pieces.size() -1).addToCells(new Cell(checkType(data),i,j));
                        i++;
                    }
                }
            }
        }

    }

    public void printBoard(){

        int i=0,j=0;
        for (i=0;i<this.width*2;i++){
            System.out.print("---");
        }
        System.out.print("\n");
        for( i = 0; i<this.height; i++){
            System.out.print("|\t");
            for( j = 0; j<this.width; j++){

//                switch () {
//                    case EMPTY:
//                        System.out.print("0");
//                        break;
//                    case STONE:
//                        System.out.print("1");
//                        break;
//                    case WOOD:
//                        System.out.print("2");
//                        break;
//                }
//                System.out.print("\t");


            }
            System.out.print("|");
            System.out.print("\n");
        }

        for (i=0;i<this.width*2;i++){
            System.out.print("---");
        }


    }

    private CellType checkType(int val){
        if(val == 1)
            return CellType.STONE;
        else if (val == 2)
            return CellType.WOOD;
        else
            return CellType.EMPTY;
    }

    public Cell [][] makeIntegerGridToCellGrid(){


    }



}


//    input1
//    public FixedInputTest() {
//        this.cellsInput = new int[][]{
//                {1, 0, 2},
//                {1, 0, 2},
//                {1, 1, 2},
//                {0, 0, 1},
//                {0, 1, 1},
//                {0, 0, 0},
//                {2, 0, 2},
//                {2, 0, 2},
//                {0, 0, 1},
//                {0, 0, 1},
//                {2, 0, 0},
//                {2, 1, 0},
//                {0, 0, 2},
//                {0, 0, 2},
//                {2, 0, 0},
//                {2, 0, 0},
//        };
//    }

