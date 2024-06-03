package com.example.demo.services;

import com.example.demo.model.QItem;

import java.util.*;

public class PathService {

    public int minDistance(char[][] grid)
    {
        // source
        QItem source = new QItem(0, 0, 0);

        // add source into queue
        Queue<QItem> queue = new LinkedList<>();
        queue.add(source);

        // create copy grid and declare all false
        boolean[][] visited
                = new boolean[grid.length][grid[0].length];

        // can't traverse
        visited[source.row][source.col] = true;

        Map<QItem, QItem> parentMap = new HashMap<>();
        parentMap.put(source, null);
        while (!queue.isEmpty()) {

            //remove before
            QItem p = queue.remove();

            // Destination found;
            if (p.row == grid[0].length-1 && p.col == grid.length-1) {
                QItem curr = p;
                while (curr != null) {
                    System.out.println("(" + curr.row + "," + curr.col + ") ");
                    curr = parentMap.get(curr);
                }
                return p.dist;
            }

            // moving up
            if (isValid(p.row - 1, p.col, grid, visited)) {
                QItem qItem = new QItem(p.row - 1, p.col, p.dist + 1);
                queue.add(qItem);
                visited[p.row - 1][p.col] = true;
                parentMap.put(qItem, p);
            }

            // moving down
            if (isValid(p.row + 1, p.col, grid, visited)) {
                QItem qItem = new QItem(p.row + 1, p.col, p.dist + 1);
                queue.add(qItem);
                visited[p.row + 1][p.col] = true;
                parentMap.put(qItem, p);
            }

            // moving left
            if (isValid(p.row, p.col - 1, grid, visited)) {
                QItem qItem = new QItem(p.row, p.col - 1, p.dist + 1);
                queue.add(qItem);
                visited[p.row][p.col - 1] = true;
                parentMap.put(qItem, p);
            }

            // moving right
            if (isValid(p.row, p.col + 1, grid, visited)) {
                QItem qItem = new QItem(p.row, p.col + 1, p.dist + 1);
                queue.add(qItem);
                visited[p.row][p.col + 1] = true;
                parentMap.put(qItem, p);
            }
        }

        return -1;
    }

    // checking where it's valid or not
    public boolean isValid(int x, int y, char[][] grid, boolean[][] visited) {
        if (x >= 0 && y >= 0 && x < grid.length
                && y < grid[0].length && grid[x][y] != '0'
                && !visited[x][y]) {
            return true;
        }
        return false;
    }

}
