package retrorunner.entity;

import java.awt.Graphics;
import retrorunner.Game;
import retrorunnner.gfx.Assets;

public class Player extends Entity
{

    private Game game;

    float x, y;
    public int misX, misY;
    public boolean missile;
    int missileG;

    public Player(float x, float y, Game game)
    {
        super(x, y);
        this.x = x;
        this.y = y;
        this.game = game;

        misX = -100;
        misY = -100;
        missile = false;
        missileG = 0;
    }

    public void tick()
    {
        missileTick();
        if (game.getKeyManager().left == true && x >= 123) {
            x -= 3;
        }
        if (game.getKeyManager().right == true && x <= 297) {
            x += 3;
        }
    }

    public void render(Graphics g)
    {
        missileRender(g);
        g.drawImage(Assets.imgPlayerCar, (int) x, (int) y, null);
        //System.out.println(x);
    }

    private void missileTick()
    {
        if (game.getKeyManager().space == true && missile == false) {
            misX = (int) x + 25;
            misY = (int) y;

            missile = true;
        }

        if (missile == true) {
            misY -= 6;
        }

        if (misY < -70) {
            missile = false;
        }
    }

    private void missileRender(Graphics g)
    {
        if (missile == false) {
            misX = -100;
            misY = -100;
            return;
        }

        if (missileG >= 0 && missileG <= 4) {
            g.drawImage(Assets.missile[0], misX, misY, null);
        } 
        else {
            g.drawImage(Assets.missile[1], misX, misY, null);
            if(missileG == 10 )missileG = 0;
        }
        missileG++;
    }

    public int getX()
    {
        return (int) x;
    }

    public int getY()
    {
        return (int) y;
    }

}
