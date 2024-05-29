public class DroneContext {
    private boolean motorEncendido = false;
    private int alturaActual = 0;

    public boolean getMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public int getAlturaActual() {
        return alturaActual;
    }

    public void setAlturaActual(int alturaActual) {
        this.alturaActual = alturaActual;
    }
}

