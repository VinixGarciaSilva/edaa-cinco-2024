package LISTA5;

public class BuscaBinariaDois {

    public static void main(String[] args) {
        int[] arr = { 42, 43, 45, 72, 124, 143, 149, 150, 167, 168,
                178, 186, 188, 192, 212, 221, 228, 230, 233, 238,
                243, 248, 251, 265, 267, 269, 303, 306, 309, 311,
                317, 326, 335, 336, 348, 351, 354, 365, 385, 394,
                396, 404, 411, 413, 415, 420, 424, 428, 432, 441,
                443, 453, 464, 472, 482, 483, 488, 506, 512, 524,
                525, 539, 565, 584, 585, 589, 599, 606, 611, 624,
                626, 628, 634, 644, 662, 688, 691, 700, 703, 711,
                723, 738, 741, 750, 754, 759, 765, 775, 780, 783,
                824, 826, 832, 848, 854, 856, 858, 867, 873, 880
        };

        int[] targets = { 824, 599, 700, 858, 269, 351, 42, 317, 525, 550, 143, 421, 422 };

        for (int target : targets) {
            int index = binarySearch(arr, target);
            if (index != -1) {
                System.out.println("Índice de " + target + " : " + index);
            } else {
                System.out.println(target + " não encontrado.");
            }
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

}
