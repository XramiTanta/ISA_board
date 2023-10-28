//package OldTry;
//
//
//
//public class PrintIntegerValues {
//
//    public static void printTheBoard(Floor floor){
//        int i=0,j=0;
//        for (i=0;i<floor.width*2;i++){
//            System.out.print("---");
//        }
//        System.out.print("\n");
//        for( i = 0; i<floor.height; i++){
//            System.out.print("|\t");
//            for( j = 0; j<floor.width; j++){
//
//                switch (floor.cells[i][j].getType()) {
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
//
//
//            }
//            System.out.print("|");
//            System.out.print("\n");
//        }
//
//        for (i=0;i<floor.width*2;i++){
//            System.out.print("---");
//        }
//
//    }
//
//    public static Floor TransformationIntgerArrayToCells(int cells[][],int width,int height){
//        int i=0,j=0;
//        Floor floor = new Floor(width, height);
//        for(i=0;i<height;i++){
//            for(j=0;j<width;j++){
//                floor.cells[i][j].setValue(cells[i][j]);
//            }
//        }
//        return floor;
//    }
//}
