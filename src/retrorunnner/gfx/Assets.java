package retrorunnner.gfx;

import java.awt.image.BufferedImage;

public class Assets
{

    public static BufferedImage imgPlayerCar, imgPublicCar[], Road , finish , menu,missile[],burstPic;

    public static void init()
    {
        SpriteSheet sheet1 = new SpriteSheet(ImageLoader.LoadImage("/textures/PublicCar.png"));
        SpriteSheet sheet2 = new SpriteSheet(ImageLoader.LoadImage("/textures/PublicCar2.png"));
        SpriteSheet sheet3 = new SpriteSheet(ImageLoader.LoadImage("/textures/missile.png"));

        imgPublicCar = new BufferedImage[10];
        missile = new BufferedImage[8];

        imgPublicCar[0] = sheet1.Crop(0, 0, 75, 125);
        imgPublicCar[1] = sheet1.Crop(80, 0, 75, 125);
        imgPublicCar[2] = sheet1.Crop(155, 0, 75, 125);
        imgPublicCar[3] = sheet1.Crop(230, 0, 75, 125);
        imgPublicCar[4] = sheet1.Crop(308, 0, 75, 125);

        imgPublicCar[5] = sheet2.Crop(0, 0, 75, 125);
        imgPublicCar[6] = sheet2.Crop(80, 0, 75, 125);
        imgPublicCar[7] = sheet2.Crop(155, 0, 75, 125);
        imgPublicCar[8] = sheet2.Crop(230, 0, 75, 125);
        imgPublicCar[9] = sheet2.Crop(308, 0, 75, 125);
        
        missile[0] = sheet3.Crop(0, 0, 15, 64);
        missile[1] = sheet3.Crop(15, 0, 15, 64);
        missile[2] = sheet3.Crop(15, 65, 15, 64);
        missile[3] = sheet3.Crop(15, 130, 15, 64);
        missile[4] = sheet3.Crop(15, 195, 15, 64);

        imgPlayerCar = ImageLoader.LoadImage("/textures/playerCar3.png");

        Road = ImageLoader.LoadImage("/textures/road1.png");
        finish = ImageLoader.LoadImage("/textures/finish.png");
        menu = ImageLoader.LoadImage("/textures/menu.png");
        burstPic = ImageLoader.LoadImage("/textures/burst.png");

    }
}
