package array;

public class rainWater {
    
    public static int storeWater(int[] pillar) {

        int[] pMax = new int[pillar.length];
        int[] sMax = new int[pillar.length];

        pMax[0] = pillar[0];
        sMax[pillar.length-1] = pillar[pillar.length-1];

        for(int i=1;i<pMax.length;i++) {
            pMax[i] = Math.max(pMax[i-1],pillar[i]);
        }

        for(int i=pillar.length-2;i>=0;i--) {
             sMax[i] = Math.max(sMax[i+1],pillar[i]);
        }

        int amount = 0;
        for(int i=0;i<pillar.length;i++) {
            int currentPillar = pillar[i];
            int leftPillar = pMax[i];
            int rightPillar = sMax[i];
            int min = Math.min(leftPillar,rightPillar);
            if(min > currentPillar) {
                amount += min - currentPillar;
            }
        }

        return amount;
    }

    public static void main(String[] args) {
        int[] pillar = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(storeWater(pillar));
    }
}
