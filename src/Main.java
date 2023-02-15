public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int table = 106520;
        System.out.println("Значение переменной table с типом int равно " + table);
        byte chair = 15;
        System.out.println("Значение переменной chair с типом byte равно " + chair);
        short pear = 10101;
        System.out.println("Значение переменной pear с типом short равно " + pear);
        long wheat = 300524023L;
        System.out.println("Значение переменной wheat с типом long равно " + wheat);
        float bread = 2.6f;
        System.out.println("Значение переменной bread с типом float равно " + bread);
        double lake = 438.3;
        System.out.println("Значение переменной lake с типом double равно " + lake);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        float chicken = 27.12f;
        System.out.println(chicken);
        long cheese = 987678965549L;
        System.out.println(cheese);
        double closet = 2.786;
        System.out.println(closet);
        short bucket = 569;
        System.out.println(bucket);
        short kettle = -159;
        System.out.println(kettle);
        int carpet = 27897;
        System.out.println(carpet);
        byte cat = 67;
        System.out.println(cat);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        int paper = 480;
        float paperForStudent = paper / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte glassIn2Min = 16;
        int glassInMinut = glassIn2Min / 2;
        int glassIn20Min = glassInMinut * 20;
        System.out.println("За 20 минут машина произвела " + glassIn20Min + " штук бутылок");
        short minutsInDay = 1440;
        int glassInDay = glassInMinut * minutsInDay;
        System.out.println("За 1 сутки машина произвела " + glassInDay + " штук бутылок");
        int glassIn3Days = glassInDay * 3;
        System.out.println("За 3 дня машина произвела " + glassIn3Days + " штук бутылок");
        int glassInMonth = glassInDay * 30;
        System.out.println("За 1 месяц машина произвела " + glassInMonth + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte totalPaint = 120;
        byte whiteForClass = 2;
        byte brownForClass = 4;
        int allClass = (totalPaint / (whiteForClass + brownForClass));
        int whiteForClasses = allClass * whiteForClass;
        int brownForClasses = allClass * brownForClass;
        System.out.println("В школе, где " + allClass + " классов, нужно " + whiteForClasses + " банок белой краски и " + brownForClasses + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte banana = 5;
        byte weightBanana = 80;
        short milk = 2;
        byte weightMilk = 105;
        byte ice = 2;
        byte weightIce = 100;
        byte egg = 4;
        byte weightEgg = 70;
        int allWeightBanana = banana * weightBanana;
        int allWeightMilk = milk * weightMilk;
        int allWeightIce = ice * weightIce;
        int allWeightEgg = egg * weightEgg;
        int weightGr = allWeightBanana + allWeightIce + allWeightEgg + allWeightMilk;
        System.out.println("Вес спортзавтрака " + weightGr + " гр");
        int grPerKg = 1000;
        float weightKg = weightGr / (float) grPerKg;
        System.out.println("Вес спортзавтрака " + weightKg + " кг");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        byte loseWeight = 7;
        float minOption = 0.25f;
        float maxOption = 0.5f;
        float minOptionDay = loseWeight / minOption;
        System.out.println(minOptionDay + " дней займет потеря веса при 250 гр");
        float maxOptionDay = loseWeight / maxOption;
        System.out.println(maxOptionDay + " дней займет потеря веса при 500 гр");
        float averageValueLoseWeight = (minOptionDay + maxOptionDay) / 2;
        System.out.println(averageValueLoseWeight + " дней в среднем займет потеря веса");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float mashaUp = (float) (masha * 1.1);
        float denisUp = (float) (denis * 1.1);
        float kristinaUp = (float) (kristina * 1.1);
        double mashaInYearNow = mashaUp * 12;
        double denisInYearNow = denisUp * 12;
        double kristinaInYearNow = kristinaUp * 12;
        int mashaBeforeIncrease = masha * 12;
        int denisBeforeIncrease = denis * 12;
        int kristinaBeforeIncrease = kristina * 12;
        double mashaSalaryDifference = mashaInYearNow - mashaBeforeIncrease;
        System.out.println("Маша теперь получает " + mashaUp + " рублей. Годовой доход вырос на " + mashaSalaryDifference + " рублей");
        double denisSalaryDifference = denisInYearNow - denisBeforeIncrease;
        System.out.println("Денис теперь получает " + denisUp + " рублей. Годовой доход вырос на " + denisSalaryDifference + " рублей");
        double kristinaSalaryDifference = kristinaInYearNow - kristinaBeforeIncrease;
        System.out.println("Кристина теперь получает " + kristinaUp + " рублей. Годовой доход вырос на " + kristinaSalaryDifference + " рублей");
    }

    }