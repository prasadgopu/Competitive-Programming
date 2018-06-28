public class binarysearch {

    public static boolean contains(int[] a, int n) {
        return binary_search(a,0,a.length-1,n);
    }

    public static boolean binary_search(int[] a, int l, int r, int n){
        if(l>r){
            return false;
        } else{
            int mid=l+(r-l)/2;
            if(a[mid]==n) return true;
            else if(a[mid]<n) return binary_search(a,mid+1,r,n);
            else if(a[mid]>n) return binary_search(a,l,mid-1,n);
        }
        return false;
    }



