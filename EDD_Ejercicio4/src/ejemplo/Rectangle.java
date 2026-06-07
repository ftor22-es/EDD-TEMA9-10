package ejemplo;

public class Rectangle {

    private static final int LADOS = 2;
	private int ancho;
    private int alto;

    public Rectangle(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

	public int calcularSurface() {
        if (ancho < 0 || alto < 0) return -1;
        if (ancho == 0 || alto == 0) return 0;
        return ancho * alto;
    }

	public int calcularPerimeter() {
        if (ancho < 0 || alto < 0) return -1;
        if (ancho == 0 || alto == 0) return 0;
        
        int resultado = getPerimetro();
		return resultado;
    }

	private int getPerimetro() {
		int resultado = LADOS * ancho + LADOS * alto;
		return resultado;
	}
}