public class NullCounter {

    public int[] fillerArr(int size) {

        int[] resultArr = new int[size];

        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = (int) (Math.random() * 5);
            System.out.print(resultArr[i] + " ");
        }

        return resultArr;
    }
}
