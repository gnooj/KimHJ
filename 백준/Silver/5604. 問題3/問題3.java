import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        List<Integer> partition = new ArrayList<>();
        generatePartitions(n, n, partition);
    }

    // n: 현재 남은 수, max: 현재 최대값 제한, partition: 현재 구성 중인 분할
    private static void generatePartitions(int n, int max, List<Integer> partition) {
        if (n == 0) {
            printPartition(partition);
            return;
        }

        for (int i = Math.min(max, n); i >= 1; i--) {
            partition.add(i);
            generatePartitions(n - i, i, partition);
            partition.remove(partition.size() - 1); // 백트래킹
        }
    }

    private static void printPartition(List<Integer> partition) {
        for (int i = 0; i < partition.size(); i++) {
            if (i > 0)
                System.out.print(" ");
            System.out.print(partition.get(i));
        }
        System.out.println();
    }
}
