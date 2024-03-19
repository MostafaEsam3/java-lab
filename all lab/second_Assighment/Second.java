import java.util.StringTokenizer;  


public class Second {
public static void main(String args[]){
    String pragraph = new String ("mostafa esam mostafa ahmed mostafa");

    String exactWord= new String("mostafa");

     StringTokenizer st= new StringTokenizer(pragraph," "); 
    
      int counter=0;
     while(st.hasMoreTokens()) {  
      if(exactWord.equals(st.nextToken())); 
       {
         counter++;
       }
     }
     System.out.println(counter)  ;


// anotherWay 
    // String [] countStr= pragraph.split(" ");

    // int counter=0;

    // for(int i=0 ; i<countStr.length;i++){
    //     int result;
    //     if(countStr[i].equals ("mostafa")){
    //         counter++;
    //     }

    // }
    //   System.out.println(counter);

}}
