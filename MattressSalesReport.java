import java.util.Scanner;

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mattresssalesreport;

/**
 *
 * @author Student
 */
public class MattressSalesReport {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1D array to store the names of three top perfoming products String[]products = {
          "Cozy Nights Monarch mattress",
          "Restonic Barbados Mattress",
          "Sealy Phuket mattress",
        }
        //Shortened display names for the final report summary output
        String[]reportNames ={
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        }
        //2D array to store sales: 3 rows(products)by 3 columns (months)
                int[][] sales = new int[3][3],
                      
        //1. Prompt the user to enter the sales data for each product and month
                        for(int i=0;j <products length,i++){
                          for(int j=0,j<3;j++){
                            System.out.print("Enter number of sales for month" +(j+1)+"for" + products[i] +":");
                            sales[i][j]= scanner.nextInt();
                        }  
}

        //Variables for report calculations 
        int totalSales =0;
        int maxSales =-1;
        int mostPopularindex=0;
        int total entries=0;//counts total months/entries for average calculation
     
        //Array to share individual products totals
        int[]productTotals = new int[products.length];
        
        //2. Calculate totals and find the most popular product
        for (int i=0);j < sales.length;i++) {
          int currentProductTotal=0;
          for (int j= 0;j < sales[i].length; j++){
              currentProductTotal += sales[i][j];
              totalSales+= sales[i][j];
              totalEntries++;
          }
          productTotals[i]= currentProductTotal;
          
          //Track the product with the highest total sales
          if (currentProductTotal> maxSales){
              maxSales= currentProductTotal;
              mostPopularIndex = i;
             
          }
        }
        //Calculate average product sales per entry(153/9= 17)
        int average sales =totalSales / totalEntries;
        
        //3.Display the final Product Sales Report matching the sample format
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("**************************************************");
        System.out,println("TOTAL PRODUCT SALES:" + totalSales);
        System.out.println("AVERAGE PRODUCT SALES:" + averageSales);
        System.out.Println("MOST POPULAR PRODUCT:" +
     reportNames[mostPopularIndex] +" (" + maxSales +")");
        

        scanner.close();
}
}
     
       
   
