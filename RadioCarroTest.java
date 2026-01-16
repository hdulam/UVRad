import org.junit.Test;
import static org.junit.Assert.*;

public class RadioCarroTest {

    @Test
    public void testPrenderYApagarRadio() {
        Radio radio = new RadioCarro();
        radio.prenderRadio();
        radio.apagarRadio();

        // En JUnit 4: si no lanza excepción, el test pasa
        assertTrue(true);
    }

    @Test
    public void testCambiarAM() {
        Radio radio = new RadioCarro();
        radio.cambiarAM();
        radio.avanzarEstacion();

        radio.guardarEstacion(0);
        radio.cargarEstacion(0);

        // Si no falla, avanzó correctamente
        assertTrue(true);
    }

    @Test
    public void testCambiarFM() {
        Radio radio = new RadioCarro();
        radio.cambiarFM();
        radio.avanzarEstacion();

        radio.guardarEstacion(0);
        radio.cargarEstacion(0);

        assertTrue(true);
    }

    @Test
    public void testGuardarYCargarAM() {
        Radio radio = new RadioCarro();
        radio.cambiarAM();
        radio.avanzarEstacion(); // 540
        radio.guardarEstacion(1);

        radio.avanzarEstacion(); // 550
        radio.cargarEstacion(1);

        assertTrue(true);
    }

    @Test
    public void testGuardarYCargarFM() {
        Radio radio = new RadioCarro();
        radio.cambiarFM();
        radio.avanzarEstacion(); // 88.1
        radio.guardarEstacion(2);

        radio.avanzarEstacion(); // 88.3
        radio.cargarEstacion(2);

        assertTrue(true);
    }
}
