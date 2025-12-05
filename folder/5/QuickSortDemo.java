class QuickSort {

    static void sort(char items[]) {
        quickSort(items, 0, items.length - 1);
    }

    private static void quickSort(char items[], int left, int right) {
        int top = left;
        int bottom = right;
        char comparer = items[(left + right) / 2];
        char value;

        do {
            while ((items[top] < comparer) && (top < right)) top++;
            while ((comparer < items[bottom]) && (bottom > left)) bottom--;
            if (top <= bottom) {
                value = items[top];
                items[top] = items[bottom];
                items[bottom] = value;
                top++;
                bottom--;
            }
        } while (top <= bottom);

        if (left < bottom) quickSort(items, left, bottom);
        if (top < right) quickSort(items, top, right);
    }
}

public class QuickSortDemo {

    public static void main(String[] args) {

        char seq[] = {'r', 'h', 'a', 'x', 'd', 'p', 'i', 'c', 'e', 'r', 'i', 'f'};

        System.out.print("Исходный порядок символов: ");
        for (char c : seq) System.out.print(c);
        System.out.println();

        QuickSort.sort(seq);

        System.out.print("Отсортированный порядок: ");
        for (char c : seq) System.out.print(c);
        System.out.println();
    }
}
