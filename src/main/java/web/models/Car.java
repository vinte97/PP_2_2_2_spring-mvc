package web.models;


public class Car {
    private String modelName;
    private int number;
    private int year;

    public Car(String modelName, int number, int year) {
        this.modelName = modelName;
        this.number = number;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", number=" + number +
                ", year=" + year +
                '}';
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
