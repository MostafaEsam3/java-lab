import java.util.ArrayList;
public class Main {
    public static void main(String []args)
    {
        ArrayList<Shape>myref=new ArrayList<Shape>();
        myref.add(new Square());
        myref.add(new Rect());
        myref.add(new Circle());
        
        for(int i=0;i<myref.size();i++)
        {
            myref.get(i).draw();
      }   
    }
}