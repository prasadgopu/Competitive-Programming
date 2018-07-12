public class FindDuplicateBeast {
    public static int findDuplicate(int[] theArray) {

        int repeate = Integer.MIN_VALUE;

        for (int i =0; i<theArray.length; i++) {
            if (theArray[Math.abs(theArray[i])]>=0) {
                theArray[Math.abs(theArray[i])] = -theArray[Math.abs(theArray[i])];
            }
            else {
                repeate = i;
            }
        }
        for (int i=0; i<theArray.length; i++) {
            theArray[i] = Math.abs(theArray[i]);
        }

        return theArray[repeate];

    }
}
