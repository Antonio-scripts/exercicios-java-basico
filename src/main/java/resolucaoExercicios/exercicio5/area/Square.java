package resolucaoExercicios.exercicio5.area;

public record Square(double side) implements GeometricForm{

    @Override
    public double getArea() {
        return side * side;
    }

}