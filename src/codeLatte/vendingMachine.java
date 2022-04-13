package codeLatte;

import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args){
        final int[] beverageName = {'a', 'b', 'c'}; //음료 이름
        final int[] beveragePrice = {1000, 500, 200}; // 음료 가격
        int[] beverageEA = {3,2,2}; //음료 개수
        int insertCost = 0 ; // 투입금액
        int selectedNum = 0 ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert coins");
        insertCost = sc.nextInt(); //투입 금액 Sacnner

        for(int index = 0 ; index < beverageName.length ; index++){
            if(insertCost >= beveragePrice[index]){
                System.out.println(beverageName[index] + "의 가격은 " + beveragePrice[index] + "원 이고, " + beverageEA[index] + "개 남음" );
            }else
                System.out.println("Insert Mores Coins");
        }
        System.out.println("Select Beverage");
        selectedNum = sc.nextInt();

        System.out.println(selectedNum + " is Selected");
        insertCost -= beveragePrice[selectedNum];
        beverageEA[selectedNum] = beverageEA[selectedNum] - 1;

        System.out.println(insertCost);
        System.out.println(beverageEA[selectedNum]);

    }
}
