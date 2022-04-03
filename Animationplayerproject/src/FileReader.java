
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Doyin
 */
public class FileReader {

    public void loadAnimationFromFile(String a) {

    }

    
    
    public static void main(String[] args) {

        try {
            File myObj = new File("shapes.txt");
            Scanner sc = new Scanner(myObj);

            //number of frames
            String numframes = sc.nextLine();
            //System.out.println(numframes);
            String[] frames = numframes.split(" ");
            int f = Integer.parseInt(frames[1]);
            System.out.println("Total frames: " + f);

            //while (sc.hasNextLine()) {
            //String data = myReader.nextLine();
            //frames per second
            String fps = sc.nextLine();
            //System.out.println(fps);
            String[] framespersecond = fps.split(" "); //splits string 
            int FPS = Integer.parseInt(framespersecond[1]); //converts String to number
            System.out.println("frames per second: " + FPS); //prints the number of fps

            String elements = sc.nextLine();
            int ELEMENTS = Integer.parseInt(elements);
            System.out.println("The number of elements: " + ELEMENTS);

            String circle = sc.nextLine();
            if (circle.contains("")) {
                //in circle class
                String object = sc.nextLine();
                if (object.contains("Circle")) {        //circle
                    //radius
                    String radius = sc.nextLine();
                    String[] RADIUS = radius.split("\\s");
                    int r = Integer.parseInt(RADIUS[1]);  //radius
                    System.out.println("r: " + r);
                    //x-axis
                    String x_axis = sc.nextLine();
                    String[] X_AXIS = x_axis.split("\\s");
                    int x = Integer.parseInt(X_AXIS[1]); //x-axis
                    System.out.println("x: " + x);
                    //y-axis
                    String y_axis = sc.nextLine();
                    String[] Y_AXIS = y_axis.split("\\s");
                    int y = Integer.parseInt(Y_AXIS[1]); //y-axis
                    System.out.println("y: " + y);
                    //reads colors
                    String c = sc.nextLine();           //colors red, green, blue
                    String COLOR1 = c.replaceAll("[^0-9]", " ");
                    String[] COLOR2 = COLOR1.split("\\s+");
                    int red = Integer.parseInt(COLOR2[1]);
                    int green = Integer.parseInt(COLOR2[2]);
                    int blue = Integer.parseInt(COLOR2[3]);
                    System.out.println("Color: " + red + " " + green + " " + blue);
                    /*
                  *add effects part
                  *
                  *
                     */
                    //read show and hide
                    String show = sc.nextLine();  //reads show

                    if (show.contains("Show")) {
                        String s = sc.nextLine();
                        String[] START = s.split(" ");
                        int startshow = Integer.parseInt(START[1]); //start of circle show
                        System.out.println("Start show: " + startshow);
                        /*
                      *add effects part
                      *
                      *
                         */
                    }
                    String hide = sc.nextLine();
                    if (hide.contains("Hide")) {
                        String s2 = sc.nextLine();
                        String[] START2 = s2.split(" ");
                        int starthide = Integer.parseInt(START2[1]); //start of circle hide
                        System.out.println("Start hide: " + starthide);
                    }
                }
            } else {
                System.out.println("Error in circle information");
            }
            String rect = sc.nextLine();
            if (rect.contains("")) {
                String object2 = sc.nextLine();
                if (object2.contains("Rect")) {
                    //length
                    String l = sc.nextLine();
                    String[] LENGTH = l.split("\\s");
                    int length = Integer.parseInt(LENGTH[1]); //length of rect
                    System.out.println("Length: " + length);
                    //width
                    String w = sc.nextLine();
                    String[] WIDTH = w.split("\\s");
                    int width = Integer.parseInt(WIDTH[1]);  //width of rect
                    System.out.println("Width: " + width);
                    //x-axis
                    String x_axis = sc.nextLine();
                    String[] X_AXIS = x_axis.split("\\s");
                    int x = Integer.parseInt(X_AXIS[1]);     //x-axis of rect
                    System.out.println("x: " + x);
                    //y-axis
                    String y_axis = sc.nextLine();
                    String[] Y_AXIS = y_axis.split("\\s");
                    int y = Integer.parseInt(Y_AXIS[1]);     //y-axis of rect
                    System.out.println("y: " + y);
                    //border
                    String b = sc.nextLine();
                    String[] BORDER = b.split("\\s");
                    int border = Integer.parseInt(BORDER[1]);//border of rect
                    System.out.println("border: " + border);

                    /*
                    *add effects part
                    *
                    *
                     */
                    String show = sc.nextLine();
                    if (show.contains("Show")) {
                        String s = sc.nextLine();
                        String[] START = s.split(" ");
                        int startshow = Integer.parseInt(START[1]); //show of rect
                        System.out.println("Start show: " + startshow);

                        /*
                         *add effects part
                         *
                         *
                         */
                    }
                    String jump = sc.nextLine();
                    if (jump.contains("Jump")) {
                        String s2 = sc.nextLine();
                        String[] START2 = s2.split(" ");
                        int startjump = Integer.parseInt(START2[1]);
                        System.out.println("Start jump: " + startjump);//start of jump of rect
                        //x-axis
                        String x_ = sc.nextLine();
                        String[] X_ = x_.split("\\s");
                        int xjump = Integer.parseInt(X_[1]);     //x-axis for jump rect
                        System.out.println("x: " + xjump);
                        //y-axis
                        String y_ = sc.nextLine();
                        String[] Y_ = y_.split("\\s");
                        int yjump = Integer.parseInt(Y_[1]);     //y-axis for jump rect
                        System.out.println("y: " + yjump);
                    }
                }
            }

            sc.close();
        } catch (FileNotFoundException e) {
            //System.out.println("An error occurred.");
            //e.printStackTrace();
        }

    }

    public void run() {
    }


}
