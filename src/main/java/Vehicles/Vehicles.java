package Vehicles;

public class Vehicles {
    private String name;

    private String planes;

    private int regOfPlate;

    private int numberOfWheels;

    public Vehicles(String name, String planes, int regOfPlate, int numberOfWheels ){
        this.name = name;
        this.planes = planes;
        this.regOfPlate = regOfPlate;
        this.numberOfWheels = numberOfWheels;
    }

    //G&S


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlanes() {
        return planes;
    }

    public void setPlanes(String planes) {
        this.planes = planes;
    }

    public int getRegOfPlate() {
        return regOfPlate;
    }

    public void setRegOfPlate(int regOfPlate) {
        this.regOfPlate = regOfPlate;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;


    }
