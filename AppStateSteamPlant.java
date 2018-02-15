/*
 * @author Aly Troy
 * @author David O'Keefe
 */

public class AppStateSteamPlant
{
    private double constant MAX_PRESSURE = 10;
    private double constant MIN_PRESSURE = 0.5;
    private double constant INITIAL_PRESSURE = 5.0;
    private int constant INITIAL_HEAT_AVAILABLE = 1000;
    private double currentPressure;
    private int heatAvailable;

    public SteamPlant()
    {
        SteamPlant plant = new SteamPlant();
        heatAvailabe = INITIAL_HEAT_AVAILABLE;
        currentPressure = INITIAL_PRESSURE;
    }

    public SteamPlant getSteamPlant()
    {

    }

    public int consumeHeat(int h)
    {
        heatAvailable = (heatAvailable - h) > 0;
        if (heatAvailable < h)
        {
            return consumeHeat;
        }
    }

    public void setCurrentPressure(double p)
    {
        if (p > MAX_PRESSURE)
        {
            currentPressure = MAX_PRESSURE;
        }
        if (p < MIN_PRESSURE)
        {
            currentPressure = MIN_PRESSURE;
        }
    }

    public double changeCurrentPressure(double p)
    {
        if (MAX_PRESSURE > p > MIN_PRESSURE)
        {
            return currentPressure;
        }
    }

    public void timeTick()
    {
        heatAvailable = heatAvailable + (currentPressure - 2) * 280;
    }
}
