class firstAndSecondLargestNumberInAnArray{
    public static void main(String[] args) {
        int arr[] = {25,2,3,45,6,213,23,12,213,23,12,12,345};
        
        int firstlargest = arr[0];//25
        int secondlargest = arr[0];//25

        for(int i = 0 ;i < arr.length ;i++ ){
            if (firstlargest < arr[i]) {
                firstlargest = arr[i];
            }
        }

        for(int i = 0 ;i < arr.length ;i++ ){
            if (secondlargest < arr[i] )
            {
                int tempsecondLargest;
                tempsecondLargest = arr[i];
                if (tempsecondLargest >= firstlargest) {
                    break;
                }
                secondlargest = arr[i];
            }
        }

        System.out.println(firstlargest);
        System.out.println(secondlargest);

    }
}