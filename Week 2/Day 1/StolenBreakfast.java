public class StolenBreakfast {
    public static int findUniqueDeliveryId(int[] deliveryIds) {
        int result=0;
        if(deliveryIds.length>2){
            result=deliveryIds[0]^deliveryIds[1];;
            for(int i=2;i<deliveryIds.length;i++){
                result=result^deliveryIds[i];
            }
        }
        else{
            result=deliveryIds[0];
        }
        return result;
    }
}