
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
    public void start(Stage stage){

        initUI(stage);
    }

    private void initUI(Stage stage) {
        FileReader m = new FileReader(); // makes new filereader class//
        m.readfile(); // reads file //
        // System.out.println(m.rectangle.get(0).length); // this was just a test to see if it works//
        
        ///Creating Java Rectangle Array
        System.out.println("The size of the arraylist of rectangle is: " + m.rectangle.size()); //sizes of the arraylist of rectangle
        Rectangle[] rectt = new Rectangle[m.rectangle.size()]; //creates an array of java.rect whiich
        for (int i = 0; i<m.rectangle.size(); i++){ //creating the rectangles in the java rectangle
            rectt[i] = new Rectangle(m.rectangle.get(i).x, m.rectangle.get(i).y, m.rectangle.get(i).width , m.rectangle.get(i).length);
            System.out.println("Values of rectangle "+i+"in the java rectangle array: X"+m.rectangle.get(i).x +" Y"+ m.rectangle.get(i).y +" width"+ m.rectangle.get(i).width  +" length"+ m.rectangle.get(i).length);
        }
        
        ///Creating Java Circle Array
       
        
        
        Pane root = new Pane();


        Rectangle rect1 = new Rectangle(40, 200, 60, 60);
        rect1.setFill(Color.LIGHTSALMON);

        Timeline timer = new Timeline();

        timer.setCycleCount(4); //number of cycles
        //timer.setAutoReverse(true);

        KeyValue kv = new KeyValue(rect.translateXProperty(), 200);
        KeyValue kh = new KeyValue(rect.translateYProperty(), -40);
        KeyFrame kfx = new KeyFrame(Duration.millis(1000), kv);
        KeyFrame kfy = new KeyFrame(Duration.millis(1000), kh);
        timer.getKeyFrames().addAll(kfx, kfy);

        timer.play();

        root.getChildren().addAll(rect, rect1);

        Scene scene = new Scene(root, 500, 500);

        stage.setTitle("Timeline");
        stage.setScene(scene);
        stage.show();
    }

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

