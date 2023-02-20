package com.example.binaerbaum;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;


public class BinaryTreeController {

        @FXML
        private Canvas canvas;

        private GraphicsContext gc;

        private static final int WIDTH = 800;
        private static final int HEIGHT = 600;
    private static final int RADIUS = 20;
        private static final int PADDING_X = 50;
        private static final int PADDING_Y = 50;

        private TreeNode root;

        public void initialize() {
            gc = canvas.getGraphicsContext2D();
            drawTree(root, WIDTH, PADDING_Y, HEIGHT );
        }

        private void drawTree(TreeNode node, double x, double y, double spacing) {
            if (node == null) {
                return;
            }
            gc.setFill(Color.WHITE);
            gc.setStroke(Color.BLACK);
            gc.setLineWidth(2.0);
            gc.fillOval(x - RADIUS, y - RADIUS, 2 * RADIUS, 2 * RADIUS);
            gc.strokeOval(x - RADIUS, y - RADIUS, 2 * RADIUS, 2 * RADIUS);
            gc.setFill(Color.BLACK);
            gc.fillText(node.value + "", x - 5, y + 5);
            if (node.left != null) {
                gc.strokeLine(x - spacing, y + RADIUS, x, y);
                drawTree(node.left, x - spacing, y + 2 * RADIUS, spacing / 2);
            }
            if (node.right != null) {
                gc.strokeLine(x + spacing, y + RADIUS, x, y);
                drawTree(node.right, x + spacing, y + 2 * RADIUS, spacing / 2);
            }
        }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

}
