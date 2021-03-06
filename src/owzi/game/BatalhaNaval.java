package owzi.game;

import owzi.engine.Game;
import owzi.engine.GameWindow;
import owzi.game.views.*;

public class BatalhaNaval extends Game {

    @Override
    protected void createGame() {
        getViewManager().addView(new MenuView("Menu", this));
        getViewManager().addView(new NameView("Name", this));
        getViewManager().addView(new GameView("Game", this));
        getViewManager().addView(new RankView("Rank", this));
        getViewManager().addView(new FinalMenuView("FinalMenu", this));

        setCurrentViewKey("Menu");
    }

    @Override
    public void update() {
        super.update();
    }

    public static void main(String[] args) {
        GameWindow gameWindow = new GameWindow(new BatalhaNaval(), true);
    }

}
