package co.com.sofka;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Calculadora {
    private Integer contador = 0 ;
    public void suma(List<Integer> Lista1,List<Integer> Lista2){
        AtomicInteger indice = new AtomicInteger();
        Lista1.stream()
                .map(i -> {
                   return i + Lista2.get(indice.getAndIncrement());
                })
                .forEach(i ->System.out.println(i));
    }

    public void resta(List<Integer> Lista1,List<Integer> Lista2){
        AtomicInteger indice = new AtomicInteger();
        Lista1.stream()
                .map(i -> {
                    return i - Lista2.get(indice.getAndIncrement());
                })
                .forEach(i ->System.out.println(i));
    }

    public void division(List<Integer> Lista1,List<Integer> Lista2){
        AtomicInteger indice = new AtomicInteger();
        Lista1.stream()
                .filter(i -> i>=0)
                .map(i -> {
                    return i / Lista2.get(indice.getAndIncrement());
                })
                .forEach(i ->System.out.println(i));
    }

    public void multiplicacion(List<Integer> lista1,List<Integer> lista2){
        AtomicInteger indice = new AtomicInteger();
        lista1.stream()
                .map(i -> {
                    return i * lista2.get(indice.getAndIncrement());
                })
                .forEach(i ->System.out.println(i));
    }
}