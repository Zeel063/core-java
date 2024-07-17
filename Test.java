/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;

 public class Test {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        if(num>90)
        {
            System.out.println("A");
        }
        else if(num<90 && num>80)
        {
            System.out.println("B");
        }
        else
        {
            System.out.println("fail");
        }
        
        
    }
    
}
