/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tpbig
 */
public class LandTract {
    private final int length;
    private final int width;
    
    public LandTract(int len, int wid){
        length = len;
        width = wid;
    }
    
    public int getArea(){
        return length*width;
    }
    
    public boolean equalArea(LandTract otherLand){
        return (length*width) == otherLand.getArea();
    }
    
   @Override
    public String toString(){
        return "Length: " + String.valueOf(length) + " - Width: " + String.valueOf(width) + "\n";
   }
}
