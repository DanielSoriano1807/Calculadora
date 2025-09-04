package mx.edu.utez;
import java.util.Scanner;

public class Menu {
    private float a, b, res;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getRes() {
        return res;
    }

    public void setRes(float res) {
        this.res = res;
    }

    public Menu() {
    }

    public void sumar() {
        Scanner sc = new Scanner(System.in);
        float v;
        System.out.println("Ingresa el primer numero para sumar: ");
        setA(sc.nextFloat());
        sc.nextLine();

        System.out.println("Ingresa el segundo numero para sumar: ");
        setB(sc.nextFloat());
        sc.nextLine();

        v = a + b;
        setRes(v);
        System.out.println(getA() + " + " + getB() + " = " + getRes());
    }

    public void resta() {
        Scanner oe = new Scanner(System.in);
        float v;
        System.out.println("Ingresa el primer numero para restar: ");
        setA(oe.nextFloat());
        oe.nextLine();

        System.out.println("Ingresa el segundo numero para restar: ");
        setB(oe.nextFloat());
        oe.nextLine();
        v = a - b;
        setRes(v);
        System.out.println(getA() + " - " + getB() + " = " + getRes());
    }

    public void multiplicacion() {
        Scanner pe = new Scanner(System.in);
        float v;
        System.out.println("Ingresa el primer numero para multiplicar: ");
        setA(pe.nextFloat());
        pe.nextLine();

        System.out.println("Ingresa el segundo numero para multiplicar: ");
        setB(pe.nextInt());
        pe.nextLine();
        v = a * b;
        setRes(v);
        System.out.println(getA() + " * " + getB() + " = " + getRes());
    }

    public void division() {
        Scanner po = new Scanner(System.in);
        float v;
        System.out.println("Ingresa el primer numero para dividir: ");
        setA(po.nextInt());
        po.nextLine();

        System.out.println("Ingresa el segundo numero para dividir: ");
        setB(po.nextInt());
        po.nextLine();
        v = a / b;
        setRes(v);

        System.out.println(getA() + " / " + getB() + " = " + getRes());
    }

}
