import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        task1();

        System.out.println();

        task2();

        System.out.println();

        task3();

        System.out.println();

        task4();

        System.out.println();

        task5();

        System.out.println();

        task6();

        System.out.println();

        task7();

        System.out.println();

        task8();

    }
    public static void task1(){
        System.out.println("Задача 1:");

        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;
        float f = 5;
        double g = 6;

        System.out.println("Значение переменной a с типом byte равно: " + a);
        System.out.println("Значение переменной b с типом short равно: " + b);
        System.out.println("Значение переменной c с типом int равно: " + c);
        System.out.println("Значение переменной d с типом long равно: " + d);
        System.out.println("Значение переменной f с типом float равно: " + f);
        System.out.println("Значение переменной g с типом double равно: " + g);
    }

    public static void task2(){
        System.out.println("Задача 2:");

        float f = 27.12f;
        long l = 987_678_965_549L;
        double d = 2.786;
        short s = 569;
        short s2 = -159;
        int i = 27897;
        byte b = 67;

        System.out.println(f + "\n" + l + "\n" + d + "\n" + s + "\n" + s2 + "\n" + i + "\n" + b);

    }
    public static void task3(){
        System.out.println("Задача 3:");

        byte ludmilaPavlovna;
        byte annaSergeevna;
        byte ekaterinaAndreevna;
        short paper;

        ludmilaPavlovna = 23;
        annaSergeevna = 27;
        ekaterinaAndreevna = 30;
        paper = 430;

        short count = (short) (paper / (ludmilaPavlovna+annaSergeevna+ekaterinaAndreevna));

        System.out.println("На каждого ученика рассчитано " + count + " листов бумаги");
    }
    public static void task4(){
        System.out.println("Задача 4:");

        int minuteBottle = 8;

        int timeTwentyMinutes = 20;
        int timeOneDay = 24 * 60;
        int timeThreeDays = ( 3 * 24 ) * 60;
        int timeMonth = (30 * 24 ) * 60;

        int factoryTwentyMinutes = timeTwentyMinutes * minuteBottle;
        int factoryOneDay = timeOneDay * minuteBottle;
        int factoryThreeDays = timeThreeDays * minuteBottle;
        int factoryMonth = timeMonth * minuteBottle;

        System.out.println("За " + timeTwentyMinutes + " минут машина произвела " + factoryTwentyMinutes + " штук бутылок");
        System.out.println("За " + timeOneDay + " минут машина произвела " + factoryOneDay + " штук бутылок");
        System.out.println("За " + timeThreeDays + " минут машина произвела " + factoryThreeDays + " штук бутылок");
        System.out.println("За " + timeMonth + " минут машина произвела " + factoryMonth + " штук бутылок");
    }
    public static void task5(){
        System.out.println("Задача 5:");

        short tinPaint = 120;
        short whitePaint = 2;
        short brownPaint = 4;

        short classes = 120 / (4 + 2);

        int countOfWhite = classes * whitePaint;
        int countOfBrown = classes * brownPaint;

        System.out.println("В школе, где "+ classes +" классов, нужно "+ countOfWhite + " банок белой краски и "
                + countOfBrown +" банок коричневой краски");
    }
    public static void task6(){
        System.out.println("Задача 6:");

        short bananas = 5;
        short milk = 2;
        short iceCream = 2;
        short egg = 4;

        short weightBananas = 80;
        short weightmilk = 105;
        short weightIceCream = 100;
        short weightEgg = 70;

        int weightGrams = (bananas*weightBananas) + (milk * weightmilk) + ( iceCream * weightIceCream ) + (egg * weightEgg);
        double weightKillograms = (double) weightGrams / 1000;

        System.out.println("Масса в граммах: " + weightGrams);
        System.out.println("Масса в килограммах: " + weightKillograms);
    }
    public static void task7(){
        System.out.println("Задача 7:");

        short minWeight = 250;
        short maxWeight = 500;
        int avgWeight = (minWeight + maxWeight) / 2;
        int necessaryWeight = 7 * 1000;

        int ifMinWeight = necessaryWeight / minWeight;
        int ifMaxWeight = necessaryWeight / maxWeight;
        int ifAvgWeight = necessaryWeight / avgWeight;

        System.out.println("Если спортсмен будет худеть минимально, ему потребуется "+ ifMinWeight + " дней");
        System.out.println("Если спортсмен будет худеть максимально, ему потребуется "+ ifMaxWeight + " дней");
        System.out.println("Если спортсмен будет худеть средне, ему потребуется "+ ifAvgWeight + " дней");
    }
    public static void task8(){
        System.out.println("Задача 8:");

        int beforMasha = 67760;
        int beforDenis = 83690;
        int beforKristina = 76230;

        int afterMasha = (int)(beforMasha*0.1) + beforMasha;
        int afterDenis = (int)(beforDenis*0.1) + beforDenis;
        int afterKristina = (int)(beforKristina*0.1) + beforKristina;

        int betweenMasha = (afterMasha * 12) - (beforMasha * 12);
        int betweenDenis = (afterDenis * 12) - (beforDenis * 12);
        int betweenKristina = (afterKristina * 12) - (beforKristina * 12);

        System.out.println("Маша теперь получает " + afterMasha + " рублей. Годовой доход вырос на "+ betweenMasha +" рублей");
        System.out.println("Денис теперь получает " + afterDenis + " рублей. Годовой доход вырос на "+ betweenDenis +" рублей");
        System.out.println("Кристина теперь получает " + afterKristina + " рублей. Годовой доход вырос на "+ betweenKristina +" рублей");
    }
}