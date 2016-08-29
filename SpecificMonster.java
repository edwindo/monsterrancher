public class SpecificMonster extends Monster
{
    private double lifMult, powMult, intMult, skiMult, spdMult, defMult;

    public SpecificMonster(double l, double p, double i, double sk, double sp, double d, double[] mults)
    {
        super(l,p,i,sk,sp,d);
        lifMult = mults[0];
        powMult = mults[1];
        intMult = mults[2];
        skiMult = mults[3];
        spdMult = mults[4];
        defMult = mults[5];
    }

    public void correctStats()
    {
        double[] stats = {getLif().getValue()*lifMult, getPow().getValue()*powMult, getInt().getValue()*intMult, getSki().getValue()*skiMult, getSpd().getValue()*spdMult, getDef().getValue()*defMult};
        for (int i = 0; i < stats.length; i++)
        {
            if (false)
            {
                stats[i] = 999;
            }
        }
        setStats(stats[0], stats[1], stats[2], stats[3], stats[4], stats[5]);
    }
    

    public void printCorrectStats()
    {
        String str = "Corrected Stats:";
        str += "\nLIF: " + getLif().getValue();
        str += "\nPOW: " + getPow().getValue();
        str += "\nINT: " + getInt().getValue();
        str += "\nSKI: " + getSki().getValue();
        str += "\nSPD: " + getSpd().getValue();
        str += "\nDEF: " + getDef().getValue();
        System.out.println(str);
    }
}
