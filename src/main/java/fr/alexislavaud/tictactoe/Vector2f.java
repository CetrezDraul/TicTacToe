package fr.alexislavaud.tictactoe;

/**
 * Created by Alexis Lavaud on 22/12/2016.
 */
public final class Vector2f {
    public float x, y;

    public Vector2f() {
        x = y = 0.0f;
    }

    public Vector2f(float x, float y) {
        set(x, y);
    }

    public void set(float x, float y) {
        this.x = x;
        this.y = y;
    }
}
