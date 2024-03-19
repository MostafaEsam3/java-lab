package second;
import java.util.function.Function;

public class Quadritic implements Function<Quadritic.Numberentry,Quadritic.Result>{
    public static class Numberentry{
        public double a;
        public double b;
        public double c;
    }
    public static class Result{
        double r1;
        double r2;
    }
    public Result apply(Numberentry n)
    {
          Result r = new Result();
         double d= n.b * n.b - 4.0 * n.a * n.c;  
        if (d> 0)   
{  
 r.r1 = (-n.b + Math.pow(d, 0.5)) / (2 * n.a);  
 r.r2 = (-n.b - Math.pow(d, 0.5)) / (2 * n.a);  
System.out.println("The roots are " + r.r1 + " and " + r.r2);  
}   
else if (d == 0)   
{  
 r.r1 = -n.b / (2 * n.a);  
}   
else   
{  
System.out.println("Roots are not real.");  
}  
    return r;

    }
}