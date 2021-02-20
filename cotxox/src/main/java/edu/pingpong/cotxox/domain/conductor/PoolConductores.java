package edu.pingpong.cotxox.domain.conductor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PoolConductores{

    private List<Conductor> poolConductores = new ArrayList<Conductor>();

    public PoolConductores(List<Conductor> poolConductores){
        this.poolConductores = poolConductores;
    }

    public List<Conductor> getPoolConductores() {
        return this.poolConductores;
    }

    public Conductor asignarConductor() {

        Conductor conductor = new Conductor();
        Random random = new Random();
        boolean ocupado = false;

        while(!ocupado) {
            int index = random.nextInt(getPoolConductores().size());
            conductor = getPoolConductores().get(index);
            if(!conductor.isOcupado()) {
                conductor.setOcupado(true);
                ocupado = true;
            }
        }
        return conductor;
    }
}
