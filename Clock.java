import java.util.*;
/*
 * @author Aly Troy
 * @author David O'keefe
 */
public class Clock implements Runnable 
{
    private static SteamPlant steamPlant;
    Random rand = new Random();
    public Clock()
    {
        steamPlant = steamPlant.getSteamPlant();

    }

    public void run()
    {
        for (int i = 0; i > 0; i++)
        {
            double randomValue = -1 + (1 - -1) * rand.nextDouble();
            try
            {
                Thread.sleep(5000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            steamPlant.timeTick();
            steamPlant.changeCurrentPressure(randomValue);
        }
    }
}

