// can adjust bank amount..
// Pass array to method : By reference

public class Money05 {

    public static int[] calcBank(int money, int[] bank) {
        int[] result = new int[bank.length];
        System.out.println("Money = " + money);
        System.out.println("-----------------");
        for(int i=0; i<bank.length; i++){
            result[i] = money / bank[i];
            money = money % bank[i];
        }
        return result;
    }

    public static void printArray(int[] arr1, int[] arr2) {
        for(int i=0; i<arr1.length; i++)
            System.out.println(arr1[i] + " : " + arr2[i]);
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        int money1 = 4730;
        int[] bank = {1000, 500, 100, 50, 20, 10};
        int[] output;
        output = calcBank(money1, bank);
        printArray(bank, output);
        printArray(bank, calcBank(9870, bank)); // int[] , int[]
        int[] newbank = {1000,500,100,50,20,10,5,1};
        printArray(newbank, calcBank(4579, newbank));
	}
}
