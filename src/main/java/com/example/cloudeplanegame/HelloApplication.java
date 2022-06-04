package com.example.cloudeplanegame;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;



public class HelloApplication extends Application {
    //Plane,clouds,coins and game over  variables declarations and transitions
    int score1=0;
    Rectangle image = new Rectangle(80,50);
    TranslateTransition translateTransition;
    TranslateTransition translateTransition2;
    TranslateTransition translateTransition3;
    TranslateTransition translateTransition4;
    TranslateTransition translateTransition5;
    TranslateTransition translateTransition6;
    TranslateTransition translateTransition7;
    Rectangle image4 = new Rectangle(150,70);
    Rectangle image2 = new Rectangle(150,70);
    Rectangle imageOne = new Rectangle(150,70);
    Rectangle image7 = new Rectangle(50,50);
    Rectangle image3 = new Rectangle(150,70);
    Rectangle image6 = new Rectangle(50,50);
    Rectangle image5 = new Rectangle(50,50);
    Label scoreChange = new Label("0");
    Pane root = new Pane();
    Scene scene = new Scene(root, 800, 600);
    @Override
    public void start(Stage stage) {



        Rectangle plane= createPlane();
        Rectangle cloud1=createClouds();
        Rectangle cloud2= createCloud2();
        Rectangle cloud3= createCloud3();
        Rectangle cloud4= createCloud4();
        Rectangle cloud5= createCloud5();
        Rectangle cloud6= createCloud6();
        Rectangle cloud7= createCloud7();
        Label score = new Label(" SCORE:");
        score.setFont(Font.font("",20));
        score.setTextFill(Color.DARKSLATEBLUE);
        score.setLayoutX(20);
        score.setLayoutY(20);

        scoreChange.setLayoutY(30);
        scoreChange.setLayoutX(250);
        scoreChange.setFont(Font.font("Rockwell Extra Bold",20));
        scoreChange.setTextFill(Color.DARKSLATEBLUE);

//Root for setting variables to the screen
        root.getChildren().addAll(plane,cloud1,cloud2,cloud3,cloud4,score,scoreChange,cloud5,cloud6,cloud7);
        imageOne.translateXProperty().addListener((observable, oldValue, newValue) -> {
            if (image.getBoundsInParent().intersects(imageOne.getBoundsInParent())){

            } else if (image.getBoundsInParent().intersects(image5.getBoundsInParent())) {

                score1+=120;
                scoreChange.setText(score1+"");
            }
            else if (image.getBoundsInParent().intersects(image6.getBoundsInParent())) {

                score1+=10;
                scoreChange.setText(score1+"");
            }
            else if (image.getBoundsInParent().intersects(image7.getBoundsInParent())) {
                score1+=160;
                scoreChange.setText(score1+"");
            }
            else if (image.getBoundsInParent().intersects(imageOne.getBoundsInParent())) {

                translateTransition.pause();
                translateTransition2.pause();
                translateTransition3.pause();
                translateTransition4.pause();
                translateTransition5.pause();
                translateTransition6.pause();
                translateTransition7.pause();
                GameOver();
            }

            else if (image.getBoundsInParent().intersects(cloud2.getBoundsInParent())) {

                translateTransition.pause();
                translateTransition2.pause();
                translateTransition3.pause();
                translateTransition4.pause();
                translateTransition5.pause();
                translateTransition6.pause();
                translateTransition7.pause();
                GameOver();
            }
            else if (image.getBoundsInParent().intersects(cloud6.getBoundsInParent())) {

                translateTransition.pause();
                translateTransition2.pause();
                translateTransition3.pause();
                translateTransition4.pause();
                translateTransition5.pause();
                translateTransition6.pause();
                translateTransition7.pause();
                GameOver();
            }
            else if (image.getBoundsInParent().intersects(cloud3.getBoundsInParent())) {

                translateTransition.pause();
                translateTransition2.pause();
                translateTransition3.pause();
                translateTransition4.pause();
                translateTransition5.pause();
                translateTransition6.pause();
                translateTransition7.pause();
                GameOver();
            }

            else if (image.getBoundsInParent().intersects(cloud7.getBoundsInParent())) {

                translateTransition.pause();
                translateTransition2.pause();
                translateTransition3.pause();
                translateTransition4.pause();
                translateTransition5.pause();
                translateTransition6.pause();
                translateTransition7.pause();
                GameOver();
            }
            else if (image.getBoundsInParent().intersects(cloud4.getBoundsInParent())) {

                translateTransition.pause();
                translateTransition2.pause();
                translateTransition3.pause();
                translateTransition4.pause();
                translateTransition5.pause();
                translateTransition6.pause();
                translateTransition7.pause();
                GameOver();
            }

            else if (image.getBoundsInParent().intersects(cloud5.getBoundsInParent())) {

                translateTransition.pause();
                translateTransition2.pause();
                translateTransition3.pause();
                translateTransition4.pause();
                translateTransition5.pause();
                translateTransition6.pause();
                translateTransition7.pause();
                GameOver();
            }

        });
        //Setting keys to move plane forward,back,up and down
        scene.addEventFilter(KeyEvent.KEY_PRESSED, event -> {
            double x = plane.getX();
            double y = plane.getY();
            switch (event.getCode()){
                case RIGHT -> plane.setX(x + 10);
                case LEFT -> plane.setX(x - 10);
                case UP -> plane.setY(y - 10);
                case DOWN -> plane.setY(y + 10);
            }
        });
        stage.setTitle("Assignment3");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    //setting cloud 1  up to cloud 7 and their positions
    private Rectangle createCloud7() {

        String icon= getClass().getResource("/coin.png").toExternalForm();
        Image money=new Image(icon);
        image7.setY(0);
        image7.setX(500);
        image7.setFill(new ImagePattern(money));
        translateTransition6 = new TranslateTransition(Duration.millis(5000), image7);
        translateTransition6.setByY(1200f);
        translateTransition6.setCycleCount(600);
        translateTransition6.setAutoReverse(false);
        translateTransition6.play();
        return image7;
    }

    private Rectangle createCloud6() {

        String icon= getClass().getResource("/coin.png").toExternalForm();
        Image money=new Image(icon);
        image6.setY(0);
        image6.setX(300);
        image6.setFill(new ImagePattern(money));

        translateTransition5 = new TranslateTransition(Duration.millis(5000), image6);
        translateTransition5.setByY(800f);
        translateTransition5.setCycleCount(600);
        translateTransition5.setAutoReverse(false);
        translateTransition5.play();

        return image6;
    }

    private Rectangle createCloud5() {

        String icon= getClass().getResource("/coin.png").toExternalForm();
        Image money=new Image(icon);
        image5.setY(0);
        image5.setX(100);
        image5.setFill(new ImagePattern(money));

        translateTransition4 = new TranslateTransition(Duration.millis(5000), image5);
        translateTransition4.setByY(1000f);
        translateTransition4.setCycleCount(600);
        translateTransition4.setAutoReverse(false);
        translateTransition4.play();
        return image5;
    }
    // collision of plane and cloud end the game

    public void GameOver(){
        ImageView lose =new ImageView(getClass().getResource("/gameover.jpg").toExternalForm());
        lose.setLayoutX(40);
        lose.setLayoutY(10);
        lose.setFitWidth(300);
        lose.setFitHeight(300);
        root.getChildren().addAll(lose);
        score1+=120;
        scoreChange.setText(score1+"");
    }
    //setting clouds and their positions
    private Rectangle createCloud4() {

        String icon= getClass().getResource("/cloud.jpg").toExternalForm();
        Image money=new Image(icon);
        image4.setY(130);
        image4.setX(1500);
        image4.setFill(new ImagePattern(money));

        translateTransition3 = new TranslateTransition(Duration.millis(5000), image4);
        translateTransition3.setByX(-1200f);
        translateTransition3.setCycleCount(6000);
        translateTransition3.setAutoReverse(false);
        translateTransition3.play();

        return image4;
    }

    private Rectangle createCloud3() {

        String icon= getClass().getResource("/cloud.jpg").toExternalForm();
        Image money=new Image(icon);
        image3.setY(130);
        image3.setX(1200);
        image3.setFill(new ImagePattern(money));

        translateTransition7 = new TranslateTransition(Duration.millis(5000), image3);
        translateTransition7.setByX(-1200f);
        translateTransition7.setCycleCount(6000);
        translateTransition7.setAutoReverse(false);

        translateTransition7.play();
        return image3;
    }

    private Rectangle createCloud2() {

        String icon= getClass().getResource("/cloud.jpg").toExternalForm();
        Image money=new Image(icon);
        image2.setY(320);
        image2.setX(1000);
        image2.setFill(new ImagePattern(money));

        translateTransition2 = new TranslateTransition(Duration.millis(8000), image2);
        translateTransition2.setByX(-1900f);
        translateTransition2.setCycleCount(7000);
        translateTransition2.setAutoReverse(false);

        translateTransition2.play();
        return image2;
    }

    private Rectangle createClouds() {

        String icon= getClass().getResource("/cloud.jpg").toExternalForm();
        Image money=new Image(icon);
        imageOne.setY(350);
        imageOne.setX(350);
        imageOne.setFill(new ImagePattern(money));

        translateTransition = new TranslateTransition(Duration.millis(8000), imageOne);
        translateTransition.setByX(-1900f);
        translateTransition.setCycleCount(7000);
        translateTransition.setAutoReverse(false);

        translateTransition.play();
        return imageOne;
    }
//plane function and its position when game starts
    private Rectangle createPlane() {


        String icon= getClass().getResource("/plane.png").toExternalForm();
        Image patter=new Image(icon);
        image.setY(180);
        image.setX(140);
        image.setFill(new ImagePattern(patter));
        return image;
    }
//Main function
    public static void main(String[] args) {
        launch();
    }
}
