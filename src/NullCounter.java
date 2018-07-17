public class NullCounter {

    public int counterNullElements(int[] arr) {
        int counter = 0;
//       iter
        for (int i : arr) {if (i == 0) counter++;}
        return counter;
    }


    public int[] fillerArr(int size) {

        int[] resultArr = new int[size];

        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = (int) (Math.random() * 5);
            System.out.print(resultArr[i] + " ");
        }

        return resultArr;
    }
}
