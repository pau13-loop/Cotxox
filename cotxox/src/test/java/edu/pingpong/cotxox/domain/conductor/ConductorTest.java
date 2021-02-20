package edu.pingpong.cotxox.domain.conductor;

import static org.junit.Assert.assertEquals;

import java.beans.BeanProperty;

import org.junit.Before;
import org.junit.Test;

public class ConductorTest {
    
    private Conductor conductor = null;
    private double delta = 0.01d;

    @Before
    public void setupConductor() {
        conductor = new Conductor("Michelin");
    }

    @Test
    public void settersAndGettersConductor() {

        conductor.setModelo("Tesla");
        conductor.setMatricula("666D");

        assertEquals("Michelin", conductor.getNombre());
        assertEquals("Tesla", conductor.getModelo());
        assertEquals("666D", conductor.getMatricula());
    }

    @Test
    public void valoracionesTest() {

        conductor.setValoracion((byte) 5);
        conductor.setValoracion((byte) 4);

        assertEquals(2, conductor.getNumeroValoraciones());
        assertEquals(4.5, conductor.getValoracion(), delta);
    }
}
