package co.com.sofka;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Calculadora {
    private Integer contador = 0 ;
    public void suma(List<Double> Lista1,List<Double> Lista2){
        AtomicInteger indice = new AtomicInteger();
        Lista1.stream()
                .map(i -> {
                   return i + Lista2.get(indice.getAndIncrement());
                })
                .forEach(i ->System.out.println(i));
    }

    public void resta(List<Double> Lista1,List<Double> Lista2){
        AtomicInteger indice = new AtomicInteger();
        Lista1.stream()
                .map(i -> {
                    return i - Lista2.get(indice.getAndIncrement());
                })
                .forEach(i ->System.out.println(i));
    }

    public void division(List<Double> Lista1,List<Double> Lista2){
        AtomicInteger indice = new AtomicInteger();
        Lista1.stream()
                .map(i -> {
                    if (Lista2.get(indice.get())==0){
                        indice.getAndIncrement();
                    } else {
                        return i / Lista2.get(indice.getAndIncrement());
                    }
                    return "No se puede dividir entre 0";
                })
                .forEach(i ->System.out.println(i));
    }

    public void multiplicacion(List<Double> lista1,List<Double> lista2){
        AtomicInteger indice = new AtomicInteger();
        lista1.stream()
                .map(i -> {
                    return i * lista2.get(indice.getAndIncrement());
                })
                .forEach(i ->System.out.println(i));
    }
}