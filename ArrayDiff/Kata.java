// // Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

// It should remove all values from list a, which are present in list b keeping their order.

// Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
// If a value is present in b, all of its occurrences must be removed from the other:

// Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}

public class Kata{
    public static int[] arrayDiff(int[] a, int[] b) {
        int[] result = new int[a.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
        boolean isPresent = false;
        for (int j = 0; j < b.length; j++) {
            if (a[i] == b[j]) {
            isPresent = true;
            break;
            }
        }
        if (!isPresent) {
            result[count] = a[i];
            count++;
        }
        }
        int[] finalResult = new int[count];
        for (int i = 0; i < count; i++) {
        finalResult[i] = result[i];
        }
        return finalResult;
    }
}


//Tests



