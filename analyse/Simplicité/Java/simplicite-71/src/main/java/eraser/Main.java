package main.java.eraser;

public class Main {

    public static void main(String[] args) {
    	long debut = System.nanoTime();
		for(int i = 0; i<100000; i++) {
			Eraser.erase("Cou cou  J M  B");
			}
		long fin = System.nanoTime();
		System.out.println((fin-debut)/1000000);
    }
}
