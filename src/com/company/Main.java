package com.company;
import java.util.Scanner;
class Main {
    public static void main(String[] args){
        double base;
        double altura;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a base do triangulo: ");
        base = sc.nextDouble();
        System.out.println("Informe a altura do triangulo: ");
        altura = sc.nextDouble();
        area = (base*altura)/2;
        System.out.println("A area é: " + area);

    }
}

