package practice_exercise_3_20_and_3_21;

import java.awt.*;

import static java.awt.Color.black;

public class House {

    // TODO: add the necessary instance variables, constructor, and method 
    //          to model and draw ONE house

private int xVal;
private int yVal;
private int width;
private int height;





    public House(int x, int y,int width, int height)
    {
    xVal = x;
    yVal = y;
    this.width = width;
    this.height = height;

    }
    public void Draw(Graphics2D g2)
    {
     Rectangle mainRect = new Rectangle(xVal,yVal,width,height);
     Rectangle window = new Rectangle(xVal+3,yVal+7, width/3,height/3);
     Rectangle door = new Rectangle(xVal+12,yVal+10,width/3,height/2);

     g2.setColor(black);
     g2.draw(mainRect);
     g2.draw(door);
     g2.draw(window);




    }


}
