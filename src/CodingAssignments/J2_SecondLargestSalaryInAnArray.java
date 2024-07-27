package CodingAssignments;


public class J2_SecondLargestSalaryInAnArray {
    public static void main(String[] args) {
        int [] a = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        int len = a.length;
        int temp ;
        System.out.print("input is ");
        for (int k = 0; k < len-1; k++) {
            System.out.print(a[k] + " ");
        }
        for (int i = 0; i < len -1 ; i++) {

            for (int j = 0; j < len-i-1;j++){
                if (a[j] > a[j+1]) {
//                    swap a[j] & a[j+1]
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }
            }

        }
        System.out.println('\n');
        System.out.print("sorted array is ");
        for (int k = 0; k < len; k++) {
            System.out.print(a[k] + " ");
        }
        System.out.println('\n');

        System.out.println("Second largest is "+ a[len-2]);

    }

}
