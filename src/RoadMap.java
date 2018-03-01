public class RoadMap {

    private int[][] map;
    private int rows;
    private int columns;
    private InputParser inputParser;


    public RoadMap(InputParser inputParser){
       this.inputParser = inputParser;
       rows = inputParser.getRows();
       columns = inputParser.getColumns();
       map = new int[rows][columns];
    }


    public void populate(){
        int i = 0;

            for(int r = 0; r < rows; r++) {
                for (int c = 0; c < columns; c++) {
                    map[r][c] = 0;
                    i++;
                }
            }

        map[0][0] = 1;

        }


    public void printMap(){
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                System.out.printf("%5d ", map[i][j]);
            }
            System.out.println();
        }
    }

}