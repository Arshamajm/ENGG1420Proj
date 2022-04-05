/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Odoyinda
 * @author Ggorgi
 * @author Mawad
 * @author Aajamiba
 */
public class Effects {

    private int HideStart;
    private int ShowStart;
    private int Jumpstart;
    private int Changecolor;

    /*
    *@return Hide start
    */
    public int getHideStart() {
        return HideStart;
    }

    public void setHideStart(int HideStart) {
        this.HideStart = HideStart;
    }

    /*
    *@return Show start
    */
    public int getShowStart() {
        return ShowStart;
    }

    public void setShowStart(int ShowStart) {
        this.ShowStart = ShowStart;
    }

    /*
    *@return Jump start
    */
    public int getJumpstart() {
        return Jumpstart;
    }

    public void setJumpstart(int Jumpstart) {
        this.Jumpstart = Jumpstart;
    }

    /*
    *@return change color
    */
    public int getChangecolor() {
        return Changecolor;
    }

    public void setChangecolor(int Changecolor) {
        this.Changecolor = Changecolor;
    }

    //Hide method
    public void hide() {

    }

    //Show method
    public void show() {

    }

    //Jump method
    public void Jump() {

    }

    ///change colour method
    public void ChangeColor(Shape a, int r, int g, int b) {
        a.setColour(r, g, b);
        
    }

    public void Effects() {
        //String found = frames.split(this.frames)[0];
        //if(found.contains(this.frames)){

    }
}
