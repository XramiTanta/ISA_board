package LeavingTheBuilding;



public class Main {

    public static void main(String[] args) {
        int[][] cells = new int[][]{
                {1, 0, 2},
                {1, 1, 2},
                {0, 0, 1},
                {0, 1, 1},
                {0, 0, 0},
                {2, 0, 2},
                {2, 0, 2},
                {0, 0, 1},
                {0, 0, 1},
                {2, 0, 0},
                {2, 1, 0},
                {0, 0, 2},
                {0, 0, 2},
                {2, 0, 0},
                {2, 0, 0},
        };

        InputTest input = new InputTest(3,15,cells);
        for(int i =0; i<input.pieces.size();i++){
            System.out.println(input.pieces.get(i).toString());
        }


//        Block b = new Block(CellType.STONE,new Cell(CellType.STONE,1,2));
//        b.addToCells(new Cell(CellType.WOOD,3,3));
//        System.out.println(b);





    }


}
