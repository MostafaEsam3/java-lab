import Mostafa.DoubleComplex;
import Mostafa.Interface;

public class Main {
    public static void main(String[] args) {
        DoubleComplex doubleComplex = new DoubleComplex(4,5);
        Interface<Double> interfaceref = doubleComplex.add(doubleComplex);
        System.out.println(interfaceref.getReal());
        System.out.println(interfaceref.getImaginary());

}
}
