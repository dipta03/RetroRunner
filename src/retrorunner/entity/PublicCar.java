package retrorunner.entity;

import java.awt.Graphics;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import retrorunnner.gfx.Assets;

public class PublicCar
{

    int n;
    int posX;
    int posY;

    Random rand;
    int count, time;
    public boolean alive;

    public PublicCar()
    {
        init();
        count = 0;
        time = 0;
    }

    private void init()
    {
        rand = new Random();
        n = rand.nextInt(10);

        if (n < 5) {
            posX = 150;
            posY = -150;
        } else {
            posX = 250;
            posY = -150;
        }
        alive = true;
    }

    public void tick()
    {

        if (alive) {
            if (n < 5) {
                posY += 3;
            } else {
                posY += 13;
            }

            if (posY > 600) {
                init();
                count++;
            }
            time = 0;
        } else {
            posY += 2;
            time++;
        }

    }

    public void render(Graphics g)
    {
        if (alive == true) {
            g.drawImage(Assets.imgPublicCar[n], posX, posY, null);
        } else {
            if (time < 20) {
                g.drawImage(Assets.burstPic, posX, posY, null);
            }
            if (time > 30) {
                if (n < 5) {
                    count += 2;
                } else {
                    count += 5;
                }
                init();
            }
        }
    }

    public int getX()
    {
        return posX;
    }

    public int getY()
    {
        return posY;
    }

    public int getCount()
    {
        return count;
    }

}
