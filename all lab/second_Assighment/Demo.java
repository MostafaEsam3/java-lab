public class Demo {
public static void main(String args[]){
IpCutter passIp = new IpCutter("163.121.12.30");
  int [] splitedArr = passIp.split();
    for(int i=0 ; i<splitedArr.length;i++){
     System.out.println(splitedArr[i]);
    }

}}






