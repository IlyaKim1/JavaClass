package com.java.class23;

public class HW3LastClassRevision {
    public static void main(String[] args) {

//        int[] data = {23, 44, 21, 23, 23, 35, 35, 44, 35};
//
//        for(int i = 0; i < data.length - 1; i++){
//            for(int j = i + 1; j < data.length; j++){
//                if(data[i] == data[j]){
//                    System.out.println(data[i]);
//                }
//            }
//        }

        //Print duplicates in the array
//        for(int i = 0; i < data.length - 1; i++){
//            for(int j = i + 1; j < data.length; j++){
//                if(data[i] == data[j]){
//                    System.out.println(data[i]);
//                }
//            }
//        }

        //Printing all the elements of array using index based for loop
        //This is called -> Iterating / Traversing

//        for(int i = 0; i < data.length; i++){
//            System.out.println(data[i]);
//        }

        //Printing all the elements of array using "for each loop" / "enhanced for loop"
//        for(int num : data){
//            System.out.println(num);
//        }

        //Sum of all elements of array using for each loop
//        int sum = 0;
//        for(int num : data){
//            sum += num;
//        }
//        System.out.println(sum);

        //Declaration of two 2D array
        int[][] data;
        //Declaration and Initialization of 2D array
        int[][] nums = new int[3][3];
        //Declare and assign in one line
        int info[][] = {{23, 44, 21}, {45, 42, 31}, {73, 14, 0}};
        //Find number of rows in the array
        System.out.println(nums.length);
        //Find number of column in a row
        System.out.println(nums[0].length);
        //Print data at particular
        System.out.println(nums[1][1]);
        //Print all data from 2D array using index based for loop
        for(int i = 0; i < info.length; i++){
            for(int j = 0; j < info[i].length; j++){
                System.out.print(info[i][j] + " ");
            }
            System.out.println();
        }



    }
}
