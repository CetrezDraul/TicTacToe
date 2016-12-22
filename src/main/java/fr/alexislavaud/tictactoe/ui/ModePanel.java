package fr.alexislavaud.tictactoe.ui;

import org.lwjgl.opengl.GL11;

/**
 * Created by Alexis Lavaud on 22/12/2016.
 */
public final class ModePanel extends UiComponent {
    private float scale;
    private boolean hovered;

    @Override
    public void update(float tpf) {
        if (hovered) {
            this.scale = Math.min(scale + tpf * 0.1f, 0.05f);
        }
        else {
            this.scale = Math.max(scale - tpf * 0.1f, 0.0f);
        }
    }

    @Override
    public void render() {
        super.render();

        GL11.glPushMatrix();
        GL11.glTranslatef(size.getX() / 2.0f, size.getY() / 2.0f, 0.0f);
        GL11.glScalef(1.0f + scale, 1.0f + scale, 0.0f);

        final float halfSizeX = size.getX() / 2.0f;
        final float halfSizeY = size.getY() / 2.0f;

        GL11.glRectf(-halfSizeX, -halfSizeY, halfSizeX, halfSizeY);

        GL11.glPopMatrix();
    }

    @Override
    public void onMouseIn() {
        this.hovered = true;
    }

    @Override
    public void onMouseOut() {
        this.hovered = false;
    }
}
