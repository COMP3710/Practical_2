package bap0031.comp3710.csse.eng.auburn.edu;

import org.junit.Test;

import bap0031.comp3710.csse.eng.auburn.edu.model.GameGrid;

/**
 * Created by bradley on 4/7/17
 */

public class GameGridTest {
    @Test
    public void grid_initializes_correctly() throws Exception {
        GameGrid gameGrid = new GameGrid();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 3)
                    System.out.print(gameGrid.getGrid()[i][j]);
                else
                    System.out.print(gameGrid.getGrid()[i][j] + ", ");
            }
            System.out.println();
        }
    }

    @Test
    public void leftShift() throws Exception {
        GameGrid gameGrid = new GameGrid();
        System.out.println("left shift\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 3)
                    System.out.print(gameGrid.getGrid()[i][j]);
                else
                    System.out.print(gameGrid.getGrid()[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();
        gameGrid.leftShift();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 3)
                    System.out.print(gameGrid.getGrid()[i][j]);
                else
                    System.out.print(gameGrid.getGrid()[i][j] + ", ");
            }
            System.out.println();
        }
    }

    @Test
    public void combineTilesLeft() throws Exception {
        GameGrid gameGrid = new GameGrid();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 3)
                    System.out.print(gameGrid.getGrid()[i][j]);
                else
                    System.out.print(gameGrid.getGrid()[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();
        gameGrid.leftShift();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 3)
                    System.out.print(gameGrid.getGrid()[i][j]);
                else
                    System.out.print(gameGrid.getGrid()[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();

        gameGrid.combineTilesLeft();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 3)
                    System.out.print(gameGrid.getGrid()[i][j]);
                else
                    System.out.print(gameGrid.getGrid()[i][j] + ", ");
            }
            System.out.println();
        }
    }

    @Test
    public void upShift() throws Exception {
        System.out.println("up shift\n");
        GameGrid gameGrid = new GameGrid();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 3)
                    System.out.print(gameGrid.getGrid()[i][j]);
                else
                    System.out.print(gameGrid.getGrid()[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();
        gameGrid.upShift();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 3)
                    System.out.print(gameGrid.getGrid()[i][j]);
                else
                    System.out.print(gameGrid.getGrid()[i][j] + ", ");
            }
            System.out.println();
        }
    }

    @Test
    public void rightShift() throws Exception {
        GameGrid gameGrid = new GameGrid();
        System.out.println("right shift\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 3)
                    System.out.print(gameGrid.getGrid()[i][j]);
                else
                    System.out.print(gameGrid.getGrid()[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();

        gameGrid.rightShift();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 3)
                    System.out.print(gameGrid.getGrid()[i][j]);
                else
                    System.out.print(gameGrid.getGrid()[i][j] + ", ");
            }
            System.out.println();
        }
    }

    @Test
    public void combineTilesRight() throws Exception {
        GameGrid gameGrid = new GameGrid();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 3)
                    System.out.print(gameGrid.getGrid()[i][j]);
                else
                    System.out.print(gameGrid.getGrid()[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();
        gameGrid.rightShift();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 3)
                    System.out.print(gameGrid.getGrid()[i][j]);
                else
                    System.out.print(gameGrid.getGrid()[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();

        gameGrid.combineTilesRight();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 3)
                    System.out.print(gameGrid.getGrid()[i][j]);
                else
                    System.out.print(gameGrid.getGrid()[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();

        gameGrid.addNewNumber();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 3)
                    System.out.print(gameGrid.getGrid()[i][j]);
                else
                    System.out.print(gameGrid.getGrid()[i][j] + ", ");
            }
            System.out.println();
        }
    }

    @Test
    public void downShift() throws Exception {
        GameGrid gameGrid = new GameGrid();
        System.out.println("down shift\n");


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 3)
                    System.out.print(gameGrid.getGrid()[i][j]);
                else
                    System.out.print(gameGrid.getGrid()[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();

        gameGrid.downShift();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 3)
                    System.out.print(gameGrid.getGrid()[i][j]);
                else
                    System.out.print(gameGrid.getGrid()[i][j] + ", ");
            }
            System.out.println();
        }

    }

    @Test
    public void getGrid() throws Exception {

    }
}
