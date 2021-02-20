package edu.pingpong.cotxox.domain.tarifa;

import edu.pingpong.cotxox.domain.carrera.Carrera;

public class Tarifa {
    
    static final double COSTE_MILLA = 1.35;
    static final double COSTE_MINUTO = 0.35;
    static final double COSTE_MINIMO = 5.0;
    static final Byte PORCENTAJE_COMISION = 20;

    public Tarifa() {}

    public static double getCosteDistancia(double distancia) {
        
        return COSTE_MILLA * distancia;        
    }

    public static double getCosteTiempo(int minutos) {
        return COSTE_MINUTO * minutos;
    }

    public static double getCosteTotalEsperado(Carrera carrera) {
        
        double costeEsperado = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());
        
        return (costeEsperado > COSTE_MINIMO) ? costeEsperado : COSTE_MINIMO;
    }
}
