package demo.srammy.springbootwithquartz.utils;

import java.math.BigInteger;

public class StringUtils {

    public static boolean testIsInt(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
