public class CakeThief {
    public static class CakeType {

        final int weight;
        final int value;

        public CakeType(int weight, int value) {
            this.weight = weight;
            this.value  = value;
        }
    }

    public static void main(String[] args){

            final CakeType[] cakeTypes = {new CakeType(0, 5)};
            final int weightCapacity = 5;
        System.out.println(maxDuffelBagValue(cakeTypes, weightCapacity));
    }

    public static long maxDuffelBagValue(CakeType[] cakeTypes, int weightCapacity) {
        int[] result=new int[weightCapacity+1];
        for(int i=0;i<=weightCapacity;i++){
                if(cakeTypes[j].weight==0 && cakeTypes[j].value>0)throw new IllegalArgumentException();
                if(cakeTypes[j].weight<=i)
                result[i]=Math.max(result[i],cakeTypes[j].value+result[i-cakeTypes[j].weight]);
            }
        }

        return result[result.length-1];
    }
}