
// package day3;
//import java.util.function.Function;
import classes.TemperatureConvert;

public class Main {

    public static void main(String[] args) {

      float x=30;

      float out = new Function <Float,Float> () {
      @Override
      public Float apply (Float t){ 
      return  ((9.0f/5.0f) * x ) + 32;   


       } 
}.apply(x);

System.out.println("temp is ="+x+" c or "+out+"f");
    

    //     float x = 25.0f;
    //    TemperatureConvert converter = new TemperatureConvert();
    //    System.out.println("Temp is " + x + "c or " +new TemperatureConvert().apply(x) + " f");
    }   
}