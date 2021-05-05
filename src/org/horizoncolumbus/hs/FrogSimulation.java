package org.horizoncolumbus.hs;

public class FrogSimulation {

    private int goalDistance;

    private int maxHops;


    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance()
    {
        /* implementation not shown */
        return 5;
    }


    public boolean simulate()
    {
        /* to be implemented in part a */

        boolean goalReached = false;

        while (maxHops > 0){

            int hopDistance = hopDistance();

            int sumOfHopDistance = 0;
            sumOfHopDistance += hopDistance;



            if(sumOfHopDistance < 0){
                break;
            }


            if(sumOfHopDistance >= goalDistance){
                goalReached = true;
                break;
            }



            maxHops--;
        }



        return goalReached;
    }

    public double runSimulations(int num)
    {
        /* to be implemented in part b */
        int count = 0;
        double percentageOfTrue = 0.0;

        while (num > 0){
            if(simulate())
                count++;

            num--;
        }

        percentageOfTrue = count / num;

        return percentageOfTrue;
    }

}
