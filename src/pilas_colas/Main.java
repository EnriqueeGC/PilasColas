/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
//package pilas_colas;

/**
 *
 * @author kike
 */   
    public class Main {
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] nums = new int[1000000];
        System.out.println("Seleccione una estructura de datos para procesar los numeros:\n1. Pila\n2. Cola");
        int option = sc.nextInt();
        if (option == 1) { // Pila
            Stack<Integer> stack = new Stack<Integer>();
            for (int i = 0; i < nums.length; i++) {
                int num = rand.nextInt(20000001) - 10000000;
                stack.push(num);
            }
            long start = System.currentTimeMillis();
            for (int i = 0; i < nums.length; i++) {
                int num = stack.pop();
            }
            long end = System.currentTimeMillis();
            System.out.println("Tiempo transcurrido: " + (end - start) + " ms");
        } else if (option == 2) { // Cola
            Queue<Integer> queue = new LinkedList<Integer>();
            for (int i = 0; i < nums.length; i++) {
                int num = rand.nextInt(20000001) - 10000000;
                queue.add(num);
            }
            long start = System.currentTimeMillis();
            for (int i = 0; i < nums.length; i++) {
                int num = queue.remove();
            }
            long end = System.currentTimeMillis();
            System.out.println("Tiempo transcurrido: " + (end - start) + " ms");
        } else {
            System.out.println("Opción no válida.");
        }
    }
}

    
