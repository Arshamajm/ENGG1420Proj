/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Doyin
 */
public class Main {
    
    public static void main(String[] args) {
        AnimationPlayer player = new AnimationPlayer();
        player.loadAnimationFromFile("animation.txt");
        player.run();
    }
}
