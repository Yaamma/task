package rook;

import rook.util.Pair;

import java.util.LinkedList;

public class RookMoves {

   public static int [] findIntPositionsByChessPossition(String chessPosition){
        byte [] arr = chessPosition.getBytes().clone();
        byte letter = arr[0];// если А -> 1 в шахматах,
        // то после представления А в байтах вычитаем 64 для получения 1 => B->2,C->3 и тд по алфавиту
        int xPosition = letter - 64;
        int yPosition = Integer.parseInt(chessPosition.substring(1));
        return new int[] {xPosition,yPosition};
    }
      public static int findAnswer(int width,int height,String start,String end){
       int [] startPositions = findIntPositionsByChessPossition(start).clone();
       int [] endPositions = findIntPositionsByChessPossition(end).clone();
        return bfs(width,height,startPositions[0],startPositions[1],endPositions[0],endPositions[1]);
        }

   public static int bfs(int width,int height,int xStart,int yStart,int xEnd,int yEnd) {

        // начало
        Pair<Integer, Integer> start = new Pair<>(xStart, yStart);

        // конец
        Pair<Integer, Integer> end = new Pair<>(xEnd, yEnd);

        // матрица расстояний
        int a[][] = new int[width + 1][height + 1];

        // посещена или нет вершина
        boolean visited[][] = new boolean[width + 1][height + 1];

        // ходы коня
        int dx[] = {1, 1, -1, -1, 2, 2, -2, -2};
        int dy[] = {2, -2, 2, -2, 1, -1, 1, -1};

        // Очередь для вершин
        LinkedList<Pair<Integer, Integer>> queue = new LinkedList<>();

        // Назначаем текущую вершину посещенной
        visited[start.getValue()][start.getKey()] = true;
        queue.add(start);

        while (!visited[end.getKey()][end.getValue()]) {
            if (queue.isEmpty()) {
                break;
            }
            // Достаем вершину
            Pair<Integer, Integer> vertex = queue.poll();
            int x1 = vertex.getKey();
            int y1 = vertex.getValue();

            for (int i = 0; i < dx.length; i++) {
                int x2 = x1 + dx[i];
                int y2 = y1 + dy[i];
                if (x2 < 0 || y2 < 0 || x2 > width || y2 > height)
                    continue;
                if (!visited[x2][y2]) {
                    visited[x2][y2] = true;
                    a[x2][y2] = a[x1][y1] + 1;
                    queue.add(new Pair(x2, y2));

                }

            }

        }
        if (visited[end.getKey()][end.getValue()]) {
            return a[end.getKey()][end.getValue()];
        }
        return -1;
    }
}
