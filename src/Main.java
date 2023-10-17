import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("input can extended 29bit id:");
        Scanner scanner = new Scanner(System.in);
        String bin = Integer.toBinaryString(Integer.parseInt(scanner.nextLine(), 16));
        char[] binToHeaderId = bin.toCharArray();
        String priority = Integer.toHexString(Integer.parseInt(String.copyValueOf(binToHeaderId,0,3), 2));
        String arbitration = Integer.toHexString(Integer.parseInt(String.copyValueOf(binToHeaderId,3,13), 2));
        String ecuId = Integer.toHexString(Integer.parseInt(String.copyValueOf(binToHeaderId,16,13), 2));
        System.out.println("Prioritity: 0x"+ priority + ", Arbitration ID: 0x" + arbitration + ", ECU Id: 0х" + ecuId);
    }
}