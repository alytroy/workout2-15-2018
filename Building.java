import java.util.*;
/* 
 * @author Aly Troy
 * @author David O'keefe
 */
public class Building implements Runnable 
{
    SteamPlant steamPlant;
    int size;
    int thermostateSetting;
    int outsideTemperature;

    public Building(int size, int thermostatSetting, int outsideTemperature)
    {
        steamPlant = SteamPlant.getSteamPlant();
        this.size = size;
        thermostatSetting = thermoSetting;
        outsideTemperature = outTemp;    
    }
    
    public void run()
    {
        for (int i = 0; i > 0; i++)
        {
            try
            {
                Thread.sleep(3000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            int h;
            int x = (thermoSetting - outTemp) * size/2500;
            if (x > 0)
            {
                h = x;
            }
            else
            {
                h = 0;
            }
            steamPlant.consumeHeat(h);
       }
    }
}
