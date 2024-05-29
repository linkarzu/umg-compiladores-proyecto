public class DroneListener extends comandosDronBaseListener {
    private DroneContext droneContext;

    public DroneListener(DroneContext droneContext) {
        this.droneContext = droneContext;
    }

    @Override
    public void exitAccion(comandosDronParser.AccionContext ctx) {
        if (ctx.ENCENDER_MOTOR() != null) {
            encenderMotor();
        } else if (ctx.APAGAR_MOTOR() != null) {
            apagarMotor();
        } else if (ctx.ELEVARSE() != null) {
            elevarse(ctx.cantidad().getText());
        } else if (ctx.BAJAR() != null) {
            bajar(ctx.cantidad().getText());
        } else if (ctx.GIRAR() != null) {
            girar(ctx.direccionGiro().getText(), ctx.cantidad().getText());
        } else if (ctx.ROTAR() != null) {
            rotar(ctx.direccionRotacion().getText(), ctx.cantidad().getText());
        } else if (ctx.REGRESAR_BASE() != null) {
            regresarBase();
        } else if (ctx.HELP() != null) {
            mostrarAyuda();
        } else if (ctx.STATUS() != null) {
            mostrarEstado();

    }

        // System.out.println("Comando procesado: " + ctx.getText());
    }

    private void encenderMotor() {
        if (droneContext.getMotorEncendido()) {
            System.out.println("ERROR SEMÁNTICO: El motor ya está encendido.");
        } else {
            droneContext.setMotorEncendido(true);
            System.out.println("Motor encendido");
        }
    }

    private void apagarMotor() {
        if (!droneContext.getMotorEncendido()) {
            System.out.println("ERROR SEMÁNTICO: El motor ya está apagado.");
        } else {
            if (droneContext.getAlturaActual() != 0) {
                int alturaActual = droneContext.getAlturaActual();
                System.out.println("ERROR SEMÁNTICO: No se puede apagar el motor si el dron no está en la base. Altura actual: " + alturaActual + " unidades.");
            } else {
                droneContext.setMotorEncendido(false);
                System.out.println("Motor apagado");
            }
        }
    }

    private void elevarse(String cantidadStr) {
        if (!droneContext.getMotorEncendido()) {
            System.out.println("ERROR SEMÁNTICO: No se puede elevar el dron con el motor apagado.");
        } else {
            int cantidad = Integer.parseInt(cantidadStr);
            int nuevaAltura = droneContext.getAlturaActual() + cantidad;
            if (nuevaAltura > 300) {
                System.out.println("ERROR SEMÁNTICO: No se puede elevar el dron por encima de 300 unidades.");
            } else {
                droneContext.setAlturaActual(nuevaAltura);
                System.out.println("El dron se elevó " + cantidad + " unidades.");
            }
        }
    }

    private void bajar(String cantidadStr) {
        if (!droneContext.getMotorEncendido()) {
            System.out.println("ERROR SEMÁNTICO: No se puede bajar el dron con el motor apagado.");
        } else {
            int cantidad = Integer.parseInt(cantidadStr);
            int nuevaAltura = droneContext.getAlturaActual() - cantidad;
            if (nuevaAltura < 0) {
                System.out.println("ERROR SEMÁNTICO: No se puede bajar el dron por debajo de la altura cero.");
            } else {
                droneContext.setAlturaActual(nuevaAltura);
                System.out.println("El dron bajó " + cantidad + " unidades.");
            }
        }
    }

    private void girar(String direccionGiro, String cantidadStr) {
        if (!droneContext.getMotorEncendido()) {
            System.out.println("ERROR SEMÁNTICO: No se puede girar el dron con el motor apagado.");
        } else {
            int cantidad = Integer.parseInt(cantidadStr);
            System.out.println("Giró " + cantidad + " grados hacia " + direccionGiro + ".");
        }
    }

    private void rotar(String direccionRotacion, String cantidadStr) {
        if (!droneContext.getMotorEncendido()) {
            System.out.println("ERROR SEMÁNTICO: No se puede rotar el dron con el motor apagado.");
        } else {
            int cantidad = Integer.parseInt(cantidadStr);
            System.out.println("Rotó " + cantidad + " metros hacia " + direccionRotacion + ".");
        }
    }

    private void regresarBase() {
        if (!droneContext.getMotorEncendido()) {
            System.out.println("ERROR SEMÁNTICO: No se puede regresar a la base con el motor apagado.");
        } else {
            System.out.println("El dron está regresando a la base.");
            droneContext.setAlturaActual(0);
        }
    }

    private void mostrarAyuda() {
      System.out.println("comandos disponibles:");
      System.out.println("- encender_motor");
      System.out.println("- apagar_motor");
      System.out.println("- elevarse <cantidad>");
      System.out.println("- bajar <cantidad>");
      System.out.println("- girar <direccionGiro> <cantidad>");
      System.out.println("  - girar derecha|izquierda grados");
      System.out.println("  - girar derecha 90");
      System.out.println("  - Gira el dron 90 grados hacia la derecha");
      System.out.println("- rotar <direccionRotacion> <cantidad>");
      System.out.println("  - rotar adelante|atras metros");
      System.out.println("  - rotar adelante 30");
      System.out.println("  - mueve el dron 30 metros hacia adelante");
      System.out.println("- regresar_base");
      System.out.println("- help");
    }

    private void mostrarEstado() {
        String estado = droneContext.getMotorEncendido() ? "Encendido" : "Apagado";
        int alturaActual = droneContext.getAlturaActual();

        System.out.println("Estado del dron:");
        System.out.println("- Motor: " + estado);
        System.out.println("- Altura actual: " + alturaActual + " unidades");
    }
}


