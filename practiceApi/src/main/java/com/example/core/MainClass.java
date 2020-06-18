package com.example.core;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainClass {

    public static int testFunction() {
        return 8;
    }

    public static void main(String[] args) {
        //Runnable myRun = new MyRunnable();
        Runnable myRun = ()->{
            for(int i=0;i<10;i++) {
                System.out.println("child thread "+Thread.currentThread().getId());
            }
        };
        Thread childThread = new Thread(myRun,"childThread");
        childThread.start();
        for(int i=0;i<10;i++) {
            System.out.println("hello world "+Thread.currentThread().getId());
        }

        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(2,4,1);
        Collections.sort(list, (I1, I2) -> I1>I2?-1:I1<I2?1:0);
        System.out.println(list);

        Set<Integer> set = new TreeSet<>((I1, I2) -> I1>I2?-1:I1<I2?1:0);
        set.add(20);
        set.add(30);
        System.out.println(set);

        Predicate<String> predicate = s->s.length()>5;
        System.out.println(predicate.test("test123"));

        Function<String, Integer> calculateStringLength = s->s.length();
        int length = calculateStringLength.apply("test");
        System.out.println(length);


        Function<String, String> createConcatenatedString = (String s) -> {
            StringBuilder sb = new StringBuilder();
            Predicate<Character> p = str->{
                System.out.println("char is :"+str);
                if(null!=str && !str.equals(" "))
                    return true;
                else
                    return false;
            };
            for (char c:s.toCharArray()) {
                if(p.test(c)) {
                    sb = sb.append(c);
                }
            }
            return sb.toString();
        };

        Vehicle vehicle = MainClass::testFunction;
        System.out.println("mileage is "+vehicle.getMileage());
        System.out.println(createConcatenatedString.apply("my name is ankur"));

        //constructor reference
        Drivers drivers = Driver::new;
        Driver d = drivers.getDriver("1");
        System.out.println("driver details:"+d);

        //streams
        List<Car> listCars = new ArrayList<>();
        Car maruti800 = new Car(Brand.MARUTI, "800", "1990", 320000);
        Car santro = new Car(Brand.HYUNDAI, "santro", "1999", 330000);
        Car indica = new Car(Brand.TATA, "indica", "2000", 340000);
        listCars.addAll(Arrays.asList(maruti800,santro,indica));
        List<Car> filteredList = listCars.stream().filter(car->car.getBrand()==Brand.TATA).collect(Collectors.toList());
        System.out.println("filtered list "+filteredList);
        List<Car> sortedList = listCars.stream().sorted((o1, o2) -> o1.getBrand().name().compareTo(o2.getBrand().name())).collect(Collectors.toList());
        System.out.println("sorted as per brand"+sortedList);
    }
}
