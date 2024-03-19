package Mostafa;

public class DoubleComplex implements Interface<Double> {
    private double real;
    private double imaginary;
    
    public DoubleComplex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Double getReal() {
        return real;
    }

    public Double getImaginary() {
        return imaginary;
    }

    @Override
    public Interface<Double> add(Interface<Double> z) {
        double Real = this.real + z.getReal();
        double Imagine = this.imaginary + z.getImaginary();
        return new DoubleComplex(Real, Imagine);
    }
    @Override
    public Interface<Double> subtract(Interface<Double> z) {
        double Real = this.real - z.getReal();
        double Imagine = this.imaginary - z.getImaginary();
        return new DoubleComplex(Real, Imagine);
    }
    @Override
    public Interface<Double> prod(Interface<Double> z) {
        double Real = this.real * z.getReal();
        double Imagine = this.imaginary * z.getImaginary();
        return new DoubleComplex(Real, Imagine);
    }
    @Override
    public Interface<Double> div(Interface<Double> z) {
        double resReal = this.real / z.getReal();
        double resImagine = this.imaginary / z.getImaginary();
        return new DoubleComplex(resReal, resImagine);
}
}