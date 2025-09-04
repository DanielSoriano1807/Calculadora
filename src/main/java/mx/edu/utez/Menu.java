package mx.edu.utez;
import java.util.Scanner;

public class Menu {
    private int a, b, res;

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public Menu() {}

    public void sumar () {
        Scanner sc = new Scanner(System.in);
        int v;
        System.out.println("Ingresa el primer numero para sumar: ");
        setA(sc.nextInt());
        sc.nextLine();

        System.out.println("Ingresa el segundo numero para sumar: ");
        setB(sc.nextInt());
        sc.nextLine();

        v = a + b;
        setRes(v);
        System.out.println(getA() + " + " + getB() + " = " + getRes());
    }

     public void resta () {
        Scanner oe = new Scanner(System.in);
        int v;
        System.out.println("Ingresa el primer numero para restar: ");
        setA(oe.nextInt());
        oe.nextLine();

        System.out.println("Ingresa el segundo numero para restar: ");
        setB(oe.nextInt());
        oe.nextLine();
        v = a - b;
        setRes(v);
        System.out.println(getA() + " - " + getB() + " = " + getRes());
    }

    public void multiplicacion () {
        Scanner pe = new Scanner(System.in);
        int v;
        System.out.println("Ingresa el primer numero para multiplicar: ");
        setA(pe.nextInt());
        pe.nextLine();

        System.out.println("Ingresa el segundo numero para multiplicar: ");
        setB(pe.nextInt());
        pe.nextLine();
        v = a * b;
        setRes(v);
        System.out.println(getA() + " * " + getB() + " = " + getRes());
    }
