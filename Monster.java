public class Monster
{
    private Stat lif, pow, intel, ski, spd, def;

    public Monster(double l, double p, double i, double sk, double sp, double d)
    {
        lif = new Stat(l,"LIF");
        pow = new Stat(p,"POW");
        intel = new Stat(i,"INT");
        ski = new Stat(sk, "SKI");
        spd = new Stat(sp, "SPD");
        def = new Stat(d, "DEF");
    }

    public Stat getLif()
    {
        return lif;
    }

    public Stat getPow()
    {
        return pow;
    }
    
    public Stat getInt()
    {
        return intel;
    }
    
    public Stat getSki()
    {
        return ski;
    }
    
    public Stat getSpd()
    {
        return spd;
    }
    
    public Stat getDef()
    {
        return def;
    }


    public void setStats(double l, double p, double i, double sk, double sp, double d)
    {
        lif.setValue(l);
        pow.setValue(p);
        intel.setValue(i);
        ski.setValue(sk);
        spd.setValue(sp);
        def.setValue(d);
    }

    public String toString()
    {
        String str = "Actual Stats:";
        str += "\nLIF: " + lif.getValue();
        str += "\nPOW: " + pow.getValue();
        str += "\nINT: " + intel.getValue();
        str += "\nSKI: " + ski.getValue();
        str += "\nSPD: " + spd.getValue();
        str += "\nDEF: " + def.getValue();
        return str;
    }
}
