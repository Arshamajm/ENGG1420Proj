
import com.sun.javafx.tk.Toolkit;
import java.sql.Time;
import javax.swing.*;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.Lighting;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.AnimationTimer;

//public class FXapplication extends JPanel {
//    
//Time t = new Timer(5, this);
//    
//    
//
//
//}
public class FXapplication extends Application {

    @Override
    public void start(Stage stage) {

        initUI(stage);
    }

    private void initUI(Stage stage) {
        Pane root = new Pane();
        Timeline timer = new Timeline();
        FileReader m = new FileReader(); // makes new filereader class//
        m.readfile(); // reads file //
        // System.out.println(m.rectangle.get(0).length); // this was just a test to see if it works//

        ///Creating Java Rectangle Array
        System.out.println("The size of the arraylist of rectangle is: " + m.rectangle.size()); //sizes of the arraylist of rectangle
        Rectangle[] rectt = new Rectangle[m.rectangle.size()]; //creates an array of java.rect whiich
        for (int i = 0; i < m.rectangle.size(); i++) { //creating the rectangles in the java rectangle
            rectt[i] = new Rectangle(m.rectangle.get(i).x, m.rectangle.get(i).y, m.rectangle.get(i).width, m.rectangle.get(i).length);
            System.out.println("Values of rectangle " + i + "in the java rectangle array: X" + m.rectangle.get(i).x + " Y" + m.rectangle.get(i).y + " width" + m.rectangle.get(i).width + " length" + m.rectangle.get(i).length);
            KeyValue kv = new KeyValue(rectt[i].translateXProperty(), 200);
            KeyValue kh = new KeyValue(rectt[1].translateYProperty(), -40);
            KeyFrame kfx = new KeyFrame(Duration.millis(1000), kv);
            KeyFrame kfy = new KeyFrame(Duration.millis(1000), kh);
            timer.getKeyFrames().addAll(kfx, kfy);
        
            root.getChildren().addAll(rectt[i]);
            timer.play();
            }

        ///Creating Java Circle Array
        //System.out.println("The size of the arraylist of rectangle is: " + m.rectangle.size());
//        Circle[] circle = new Circle[m.circle.size()];
//        for (int i = 0; i < m.circle.size(); i++) { //creating the rectangles in the java rectangle
//            circle[i] = new Circle(m.circle.get(i).x, m.circle.get(i).y, m.circle.get(i).r);
//        }

        ///Creating Java Line Array
//        System.out.println("The size of the arraylist of rectangle is: " + m.line.size());
//        Line[] line = new Line[m.line.size()];
//        for (int i = 0; i < m.line.size(); i++) {
//            line[i] = new Line(m.line.get(i).startX, m.line.get(i).startY, m.line.get(i).endX, m.line.get(i).endY);
//        }

//        Rectangle rect1 = new Rectangle(40, 200, 60, 60);
//        rect1.setFill(Color.LIGHTSALMON);

        

        //timer.setCycleCount(4); //number of cycles
        //timer.setAutoReverse(true);

        //MyTimer t = new MyTimer();
        //t.start();

        

        Scene scene = new Scene(root, 500, 500);

        stage.setTitle("Timeline");
        stage.setScene(scene);
        stage.show();
    }

//    private class MyTimer extends AnimationTimer {
//
//        FileReader m = new FileReader();
//        int frame = 0; // Current frame
//        int frames = m.f; // Max frames
//        int FPS = m.FPS; // FPS
//
//        public void handle(long now) {
//            frame++;
//            if (frame > frames) {
//                stop();
//                System.exit(0);
//            }
//            try {
//                Thread.sleep(1000 / FPS);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//
//    }

    public static void main(String[] args) {
        launch(args);
    }

//    public void start() {
//
//    }
//
//    public void stop() {
//
//    }
//
//    public void handle(long time) {
//
//    }
//    AnimationTimer animationTimer = new AnimationTimer() {
//        long delta;
//        long lastFrameTime;
//
//        @Override
//        public void handle(long now) {
//            delta = now - lastFrameTime;
//            lastFrameTime = now;
//        }
//    };
//
//    public double getFrameRateHertz() {
//        double frameRate = 1d / deltaTimeNano;
//        return frameRate * 1e9;
//    }
}
