public class Stat
{
    private double value;
    private String name;
    
    public Stat(double val, String n)
    {
        value = val;
        name  = n;
    }
    
    public double getValue()
    {
        return value;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setValue(double val)
    {
        value = val;
    }
    
    public void setName(String n)
    {
        name = n;
    }
}
    