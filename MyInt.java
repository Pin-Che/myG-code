package com.pinche;
import java.lang.Integer;
public class MyInt   {
    public static Integer parse(String s) throws NumberFormatException{
        String[] romdig = {"I","II","III","IV","V","VI","VII","VIII", "IX", "X" };
        Integer [] digs ={ 1,2,3,4,5,6,7,8,9,19};
        for ( int i=0; i<romdig.length; i++)
            if(romdig[i].equalsIgnoreCase(s))
                return digs[i];
        return Integer.parseInt(s);
    }
}
