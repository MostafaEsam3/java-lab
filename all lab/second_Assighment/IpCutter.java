import java.util.StringTokenizer;  

public class IpCutter{
    String ipNumber;
   public IpCutter(String number){
     ipNumber=number;
    }
    
  int [] split(){
    int [] storageIp;
    storageIp =new int [5];
    int i=0;

  
    StringTokenizer ip= new StringTokenizer(ipNumber,".");  
    while(ip.hasMoreTokens()) {  

   storageIp[i] =Integer.parseInt(ip.nextToken()); 
       i++;
     }  
     return storageIp;
}}
