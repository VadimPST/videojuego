package net.instituto.desa;

public class Game {
	private static final String ABAJO = "Abajo";
	private static final String ARRIBA = "Arriba";
	private static final String IZQUIERDA = "Izquierda";
	private static final String DERECHA = "Derecha";
	Jugador j;

	public void movimiento(String m) {
		if (m.equalsIgnoreCase(DERECHA)) {
			j.moveForward();
		}
		if (m.equalsIgnoreCase(IZQUIERDA)) {
			j.moveBack();
		}
		if (m.equalsIgnoreCase(ARRIBA)) {
			j.moveUp();
		}
		if (m.equalsIgnoreCase(ABAJO)) {
			j.moveDown();
		}
	}
}
