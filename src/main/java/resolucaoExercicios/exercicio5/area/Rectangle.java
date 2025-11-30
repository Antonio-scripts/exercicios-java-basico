package resolucaoExercicios.exercicio5.area;

public record Rectangle(double length, double width)implements GeometricForm{

    @Override
    public double getArea() {
        return length * width;
    }

}
