package binarySearchP;

public class BinarySearch {
    public static void main(String[] args){
        int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
        int target = 83;

        int leftEnd = 0;
        int rightEnd = numbers.length-1;
        int mid = (rightEnd + leftEnd)/2;
        boolean find = false;
        int tmp = numbers[mid];

        while(leftEnd <= rightEnd){
            if(target == tmp){
                find = true;
                break;
            }
            else if(target < tmp){
                rightEnd = mid-1;
            }
            else
                leftEnd = mid+1;
            mid = (leftEnd + rightEnd)/2;
            tmp = numbers[mid];
        }
        if(find ==true)
        {
            mid++;
            System.out.println(mid);
        }else
            System.out.println("not Found");
    }
}
