package net.instituto.desa;

public class Jugador {
	int y, x;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	public int derecha() {
		return x + 1;
	}
	public int izquierda() {
		return x - 1;
	}
	public int abajo() {
		return y +1;
	}

	public int arriba() {
		return y - 1;
	}

}
