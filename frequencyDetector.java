import java.util.Arrays;
public class frequencyDetector {
    public static void main(String[] args) {
       int[] myArray ={10, 20, 20, 10, 10, 20, 5, 20};
       Arrays.sort(myArray);
        System.out.println("Dizi: " + Arrays.toString(myArray));
        System.out.println("Dizide tekrar eden elemanlara ilişkin veriler aşağıdaki gibidir:");
        Arrays.sort(myArray);

        int counter = 1;

        for (int i = 0; i < myArray.length; i++) {
            if (i == 0) {
                for (int j = 0; j < myArray.length; j++) {
                    if ((i != j) && (myArray[i] == myArray[j])) {
                        counter++;
                    }
                }
                System.out.println(myArray[i] + " sayısı " + counter + " kere tekrar edildi.");
            } else if (myArray[i] != myArray[i-1]) {
                for (int j = 0; j < myArray.length; j++) {
                    if ((i != j) && (myArray[i] == myArray[j])) {
                        counter++;
                    }
                }
                System.out.println(myArray[i] + " sayısı " + counter + " kere tekrar edildi.");
            }
            counter = 1;
        }

    }
}
