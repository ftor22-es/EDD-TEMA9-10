package ejemplo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RectanguloTest {

    @Test
    void testValoresPositivos() {
        Rectangle r = new Rectangle(3, 4);
        assertAll(
            () -> assertEquals(12, r.calcularSurface()),
            () -> assertEquals(14, r.calcularPerimeter())
        );
    }

    @Test
    void testValoresNegativos() {
		Rectangle r1 = new Rectangle(-3, 4);
        Rectangle r2 = new Rectangle(-3, -4);

        assertAll(
            () -> assertEquals(-1, r1.calcularSurface()),
            () -> assertEquals(-1, r1.calcularPerimeter()),
            () -> assertEquals(-1, r2.calcularSurface()),
            () -> assertEquals(-1, r2.calcularPerimeter())
        );
    }

    @Test
    void testValoresCero() {
        Rectangle r1 = new Rectangle(0, 5);
        Rectangle r2 = new Rectangle(0, 0);

        assertAll(
            () -> assertEquals(0, r1.calcularSurface()),
            () -> assertEquals(0, r1.calcularPerimeter()),
            () -> assertEquals(0, r2.calcularSurface()),
            () -> assertEquals(0, r2.calcularPerimeter())
        );
    }

    @Test
    void testAsercionesErroneas() {
        Rectangle r = new Rectangle(3, 4);

        assertAll(
            () -> assertEquals(99, r.calcularSurface()),
            () -> assertEquals(99, r.calcularPerimeter()),
            () -> assertEquals(5, new Rectangle(-1, 2).calcularSurface()),
            () -> assertEquals(5, new Rectangle(0, 3).calcularPerimeter())
        );
    }
}