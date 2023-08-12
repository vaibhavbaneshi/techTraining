package array;

public class gasStation {
    
    public static int checkJourney(int[] gas,int[] cost) {

        int startingPoint=0,loss=0,remainingGas=0;

        for(int i=0;i<gas.length;i++) {
            remainingGas += gas[i] - cost[i];

            if(remainingGas < 0) {
                startingPoint = i+1;
                loss += remainingGas;
                remainingGas = 0; 
            }
        }

        return loss + remainingGas >= 0 ? startingPoint : -1;
    }

    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(checkJourney(gas, cost));
    }
}
