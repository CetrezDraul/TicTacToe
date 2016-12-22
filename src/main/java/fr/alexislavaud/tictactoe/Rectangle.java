package fr.alexislavaud.tictactoe;

import org.w3c.dom.css.Rect;

/**
 * Created by Alexis Lavaud on 22/12/2016.
 */
public final class Rectangle {
    public float x, y, width, height;

    public Rectangle() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Rectangle(float x, float y, float width, float height) {
       set(x, y, width, height);
    }

    public void set(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public boolean isInside(Vector2f v) {
        if (v.x > x && v.x <= x + width && v.y > y && v.y <= y + height) {
            return true;
        }

        return false;
    }
}
