package fr.alexislavaud.tictactoe.ui;

import fr.alexislavaud.tictactoe.Rectangle;
import org.lwjgl.opengl.GL11;

/**
 * Created by Alexis Lavaud on 22/12/2016.
 */
public final class SelectModeScreen extends Screen {
    private Label selectModeLabel;
    private Rectangle aiModeRect, playerModeRect;

    public SelectModeScreen() {
        this.aiModeRect = new Rectangle();
        this.playerModeRect = new Rectangle();
    }

    @Override
    public void update(float tpf) {
        super.update(tpf);

        selectModeLabel.centerX(rootContainer.getSize().x);
        selectModeLabel.getPosition().y = 10.0f;

        final float panelSize = rootContainer.getSize().x / 2.0f - (10.0f * 3.0f);
        final float margin = 20.0f;
        final float panelStartY = 100.0f;
        final float panelStopY = rootContainer.getSize().y - panelStartY - margin;

        aiModeRect.set(margin, panelStartY, panelSize, panelStopY);
        playerModeRect.set(
                rootContainer.getSize().x - panelSize - margin,
                panelStartY,
                panelSize,
                panelStopY);
    }

    // TODO: rename method renderPanels

    private void renderPanels() {
        final float panelSize = rootContainer.getSize().x / 2.0f - (10.0f * 3.0f);
        final float margin = 20.0f;

        //GL11.glRectf(margin, 100.0f, margin + panelSize, rootContainer.getSize().y - margin);

     //   GL11.glRectf(
      //          rootContainer.getSize().x - panelSize - margin,
       //         100.0f,
        //        rootContainer.getSize().x - margin,
         //       rootContainer.getSize().y - margin
//        );


        GL11.glRectf(aiModeRect.x, aiModeRect.y, aiModeRect.x + aiModeRect.width, aiModeRect.y + aiModeRect.height);
        GL11.glRectf(playerModeRect.x, playerModeRect.y, playerModeRect.x + playerModeRect.width, playerModeRect.y + playerModeRect.height);
    }

    @Override
    public void render() {
        super.render();

        renderPanels();
    }

    @Override
    public void init() {
        this.selectModeLabel = new Label("Select mode", 4.0f);

        rootContainer.addChilds(selectModeLabel);
    }

    @Override
    public void destroy() {

    }

    @Override
    public void onMouseMove(float x, float y) {

    }
}
