/*
 * @author Aly Troy
 * @author David O'Keefe
 */

public class SteamPlant
{
    private double MAX_PRESSURE = 10;
    private double MIN_PRESSURE = 0.5;
    private double INITIAL_PRESSURE = 5.0;
    private int INITIAL_HEAT_AVAILABLE = 1000;
    private double currentPressure;
    private int heatAvailable;
    private static SteamPlant steamPlant;
    
    private SteamPlant()
    {
        SteamPlant plant = new SteamPlant();
        heatAvailable = INITIAL_HEAT_AVAILABLE;
        //currentPressure = INITIAL_PRESSURE;
    }

    public static synchronized SteamPlant getSteamPlant()
    {
        if (steamPlant == null)
        {
            steamPlant = new SteamPlant();
        }
        return steamPlant;
    }

    public int consumeHeat(int h)
    {
        //heatAvailable = (heatAvailable - h) > 0;
        if (heatAvailable > h)
        {
            return h;
        }
        else
        {
            return h;
        }
    }

    public void setCurrentPressure(double p)
    {
        if (p <= MAX_PRESSURE)
        {
            currentPressure = p;
        }
        if (p >= MIN_PRESSURE)
        {
            currentPressure = p;
        }
    }

    public double changeCurrentPressure(double p)
    {
        double temp = currentPressure;
        currentPressure += p;
        if (currentPressure <= MAX_PRESSURE && currentPressure >=  MIN_PRESSURE)
        {
            return currentPressure;
        }
        else
        {
            return temp;
        }
    }

    public void timeTick()
    {
        int temp = heatAvailable + (int)(currentPressure - 2) * 280;
        if (temp > 0)
        {
            heatAvailable = temp;
        }
        //heatAvailable = heatAvailable + (currentPressure - 2) * 280;
    }
}
