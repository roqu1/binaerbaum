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
            gc.setStroke();

    }