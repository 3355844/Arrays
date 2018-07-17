public class NullCounter {

    public int maxElementOfArray(int[] arr) {

        int maxElement;

        maxElement = arr[0];
        for (int i : arr) {
            if (maxElement < i) maxElement = i;
        }

        return maxElement;
    }


    public int counterNullElements(int[] arr) {
        int counter = 0;
//       iter
        for (int i : arr) {
            if (i == 0) counter++;
        }
        return counter;
    }


    public int[] fillerArr(int size, int maxArrayNumber) {

        int[] resultArr = new int[size];

        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = (int) (Math.random() * (maxArrayNumber + 1));
            System.out.print(resultArr[i] + " ");
        }

        return resultArr;
    }
}
