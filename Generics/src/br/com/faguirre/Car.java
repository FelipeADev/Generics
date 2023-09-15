package br.com.faguirre;

public abstract class Car {

    private int horsePower;
    private String tank;
    private int velocidadeMax;

    public Car(int horsePower, String tank, int velocidadeMax){
        this.horsePower = horsePower;
        this.tank = tank;
        this.velocidadeMax = velocidadeMax;
    }

    @Override
    public String toString() {
        return "Car: " +
                "horsePower= " + horsePower +
                ", tank= " + tank  +
                ", velocidadeMax= " + velocidadeMax;
    }
}
