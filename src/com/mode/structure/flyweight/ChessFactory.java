package com.mode.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author admin
 * @Date 2022/3/10 12:00
 * @description 享元模式
 * 优点
 *
 * 可以极大减少内存中对象的数量，使得相同或相似对象在内存中只保存一份，从而可以节约系统资源，提高系统性能。
 *
 * 享元模式的外部状态相对独立，而且不会影响其内部状态，从而使得享元对象可以在不同的环境中被共享。
 *
 * 缺点
 *
 * 享元模式使得系统变得复杂，需要分离出内部状态和外部状态，这使得程序的逻辑复杂化。
 *
 * 为了使对象可以共享，享元模式需要将享元对象的部分状态外部化，而读取外部状态将使得运行时间变长。
 */
public class ChessFactory {
    private Map<String, Chess> chessMap = new HashMap<>(4);

    private static ChessFactory instance = new ChessFactory();

    public static ChessFactory getInstance() {
        return instance;
    }

    private ChessFactory() {
        WhiteChess whiteChess = new WhiteChess();
        BlackChess blackChess = new BlackChess();
        chessMap.put("b", blackChess);
        chessMap.put("w", whiteChess);
    }

    public Chess getChess(String key) {
        return chessMap.get(key);
    }

    public static void main(String[] args) {
        ChessFactory instance = ChessFactory.getInstance();
        Chess b1 = instance.getChess("b");
        Chess b2 = instance.getChess("b");
        Chess b3 = instance.getChess("b");

        Chess w1 = instance.getChess("w");
        Chess w2 = instance.getChess("w");
        Chess w3 = instance.getChess("w");

        b1.display(new Coordinates(1, 2));
        w1.display(new Coordinates(3, 2));
        b2.display(new Coordinates(5, 6));
        w2.display(new Coordinates(7, 2));
        b3.display(new Coordinates(1, 4));
        w3.display(new Coordinates(3, 5));
        System.out.println("---------------------");
        System.out.println("两个黑棋子是否相同："+ (b1 == b3));
    }

}
