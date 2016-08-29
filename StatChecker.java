import java.util.Scanner;
import java.util.ArrayList;
public class StatChecker
{
    public static void main()
    {
        int[] multipliers = new int[6];
        String[] statNames = {"LIF", "POW", "INT", "SKI", "SPD", "DEF"};
        ArrayList<Stat> stats = new ArrayList<Stat>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter LIF:");
        Stat LIF = new Stat(scan.nextDouble(), "LIF");
        System.out.println("Enter POW:");
        Stat POW = new Stat(scan.nextDouble(), "POW");
        System.out.println("Enter INT:");
        Stat INT = new Stat(scan.nextDouble(), "INT");
        System.out.println("Enter SKI:");
        Stat SKI = new Stat(scan.nextDouble(), "SKI");
        System.out.println("Enter SPD:");
        Stat SPD = new Stat(scan.nextDouble(), "SPD");       
        System.out.println("Enter DEF:");
        Stat DEF = new Stat(scan.nextDouble(), "DEF");
        System.out.print('\u000C');
        for (int i = 0; i < multipliers.length; i++)
        {
            System.out.println("Enter the multiplier value of " + statNames[i] + ":");
            multipliers[i] = scan.nextInt();
        }
        double[] convertedMultipliers = convert(multipliers);
        SpecificMonster monst = new SpecificMonster(LIF.getValue(),POW.getValue(),INT.getValue(),SKI.getValue(),SPD.getValue(),DEF.getValue(), convertedMultipliers);
        System.out.print('\u000C');
        System.out.println(monst);
        monst.correctStats();
        stats.add(monst.getLif());
        stats.add(monst.getPow());
        stats.add(monst.getInt());
        stats.add(monst.getSki());
        stats.add(monst.getSpd());
        stats.add(monst.getDef());
        System.out.println();
        monst.printCorrectStats();
        System.out.println();
        System.out.println(orderFinder(stats));
    }

    private static String orderFinder(ArrayList<Stat> stats)
    {
        String statsInOrder = "Order of Stats:\n";
        while (stats.size() > 0)
        {
            Stat largestStat = stats.get(0);
            for (int i = 0; i < stats.size(); i++)
            {
                if (stats.get(i).getValue() > largestStat.getValue())
                {
                    largestStat = stats.get(i);
                }
            }
            statsInOrder += largestStat.getName() + "  ";
            stats.remove(largestStat);
        }
        return statsInOrder;
    }

    private static double[] convert(int[] mults)
    {
        double[] convertedMults = new double[mults.length];
        for (int i = 0; i < mults.length; i++)
        {
            if (mults[i] == 1)
            {
                convertedMults[i] = 0;
            }
            else if (mults[i] == 2)
            {
                convertedMults[i] = 0.5;
            }
            else if (mults[i] == 3)
            {
                convertedMults[i] = 1;
            }
            else if (mults[i] == 4)
            {
                convertedMults[i] = 1.5;
            }
            else
            {
                convertedMults[i] = 2;
            }
        }
        return convertedMults;
    }
}
