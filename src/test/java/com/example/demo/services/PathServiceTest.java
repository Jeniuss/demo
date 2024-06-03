package com.example.demo.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PathServiceTest {

    @Test
    public void findPath() {
        PathService pathService = new PathService();
        char[][] gridTest = {
                {'1','0','0','0','0'},
                {'1','0','0','0','0'},
                {'1','0','0','0','0'},
                {'1','1','1','0','0'},
                {'0','0','1','1','1'}
        };
        int val = pathService.minDistance(gridTest);
        Assertions.assertEquals(8, val);
    }

    @Test
    public void findPathMultiple() {
        PathService pathService = new PathService();
        char[][] gridTest = {
                {'1','0','1','1','1'},
                {'1','0','1','0','1'},
                {'1','0','1','0','1'},
                {'1','1','1','0','1'},
                {'0','0','1','1','1'}
        };
        int val = pathService.minDistance(gridTest);
        Assertions.assertEquals(8, val);
    }

    @Test
    public void findPathNoPossible() {
        PathService pathService = new PathService();
        char[][] gridTest = {
                {'1','0','1','1','1'},
                {'1','0','1','0','1'},
                {'1','0','1','0','1'},
                {'1','1','0','0','1'},
                {'0','0','1','1','1'}
        };

        int val = pathService.minDistance(gridTest);
        Assertions.assertEquals(-1, val);
    }

    @Test
    public void findPathLargeGrid() {
        PathService pathService = new PathService();
        char[][] gridTest = new char[1000][1000];
        for (int i = 0; i < gridTest[0].length; i++) {
            for (int j = 0; j < gridTest.length; j++) {
                if (j == 0) {
                    gridTest[i][j] = 1;
                }
                if (i == gridTest[0].length - 1) {
                    gridTest[i][j] = 1;
                }
            }
        }
        int val = pathService.minDistance(gridTest);
        // 1000 - 1 = 999
        // 1000 - 1 = 999
        Assertions.assertEquals(1998, val);
    }
}
