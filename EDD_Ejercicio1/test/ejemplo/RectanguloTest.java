package ejemplo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RectanguloTest {

    @Test
    void testValoresPositivos() {
        Rectangulo r = new Rectangulo(3, 4);
        assertAll(
            () -> assertEquals(12, r.area()),
            () -> assertEquals(14, r.perimetro())
        );
    }

    @Test
    void testValoresNegativos() {
        Rectangulo r1 = new Rectangulo(-3, 4);
        Rectangulo r2 = new Rectangulo(-3, -4);

        assertAll(
            () -> assertEquals(-1, r1.area()),
            () -> assertEquals(-1, r1.perimetro()),
            () -> assertEquals(-1, r2.area()),
            () -> assertEquals(-1, r2.perimetro())
        );
    }

    @Test
    void testValoresCero() {
        Rectangulo r1 = new Rectangulo(0, 5);
        Rectangulo r2 = new Rectangulo(0, 0);

        assertAll(
            () -> assertEquals(0, r1.area()),
            () -> assertEquals(0, r1.perimetro()),
            () -> assertEquals(0, r2.area()),
            () -> assertEquals(0, r2.perimetro())
        );
    }

    @Test
    void testAsercionesErroneas() {
        Rectangulo r = new Rectangulo(3, 4);

        assertAll(
            () -> assertEquals(99, r.area()),
            () -> assertEquals(99, r.perimetro()),
            () -> assertEquals(5, new Rectangulo(-1, 2).area()),
            () -> assertEquals(5, new Rectangulo(0, 3).perimetro())
        );
    }
}