package com.nyeroos.firstlesson.JV20.pr27.Snake;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SnakeView extends JFrame{
    private final int WIDTH = 500;
    private final int HEIGHT = 500;
    public JButton[] ButtonBody = new JButton[200];
    private Snake snake;
    private SnakeController snakeController;
    public JPanel panel1;
    public JButton bonusfood;
    public Fruit fruit;
    public Random random = new Random();

    SnakeView(SnakeController snakeController) {
        super("Snake");
        this.snakeController = snakeController;
        snake = snakeController.getSnake();
        fruit = new Fruit();
        setBounds(200, 200, 500, 380);
        panel1 = new JPanel();
        bonusfood = new JButton();
        bonusfood.setEnabled(false);
        createFirstSnake();
        panel1.setLayout(null);
        panel1.setBounds(0, 0, WIDTH, HEIGHT);
        panel1.setBackground(Color.WHITE);
        getContentPane().setLayout(null);
        getContentPane().add(panel1);
        show();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void createFirstSnake() {
        for (int i = 0; i < 3; i++) {
            ButtonBody[i] = new JButton("" + i);
            ButtonBody[i].setEnabled(false);
            panel1.add(ButtonBody[i]);
            ButtonBody[i].setBounds(snake.x[i], snake.y[i], 10, 10);
            snake.x[i + 1] = snake.x[i] - 10;
            snake.y[i + 1] = snake.y[i];
        }
    }

    void growup() {
        ButtonBody[snake.getLength()] = new JButton(" " + snake.getLength());
        ButtonBody[snake.getLength()].setEnabled(false);
        panel1.add(ButtonBody[snake.getLength()]);
        ButtonBody[snake.getLength()].setBounds(snake.getPointBody()[snake.getLength() - 1].x, snake.getPointBody()[snake.getLength() - 1].y, 10, 10);
        snake.setLength(snake.getLength() + 1);
    }

    void moveForward() {
        for (int i = 0; i < snake.getLength(); i++) {
            snake.getPointBody()[i] = ButtonBody[i].getLocation();
        }
        snake.x[0] += snake.getDirectionX();
        snake.y[0] += snake.getDirectionY();
        ButtonBody[0].setBounds(snake.x[0], snake.y[0], 10, 10);

        for (int i = 1; i < snake.getLength(); i++) {
            ButtonBody[i].setLocation(snake.getPointBody()[i - 1]);
        }
        if (snake.x[0] == WIDTH) {
            snakeController.stopGame();
        } else if (snake.x[0] == 0) {
            snakeController.stopGame();
        } else if (snake.y[0] == HEIGHT) {
            snakeController.stopGame();
        } else if (snake.y[0] == 0) {
            snakeController.stopGame();
        }
        createFruit();
        collisionFruit();
        panel1.repaint();
    }

    private void collisionFruit() {
        if (fruit.isFood()) {
            if (fruit.getPoint().x == snake.x[0] && fruit.getPoint().y == snake.y[0]) {
                panel1.remove(bonusfood);
                growup();
                fruit.setFood(false);
            }
        }
    }

    private void createFruit() {
        if (!fruit.isFood()) {
            panel1.add(bonusfood);
            bonusfood.setBounds((10 * random.nextInt(49)), (10 * random.nextInt(24)), 10, 10);
            fruit.setPoint(bonusfood.getLocation());
            fruit.setFood(true);
        }
    }
}
