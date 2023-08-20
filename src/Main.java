import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Вы хотите самостоятельно выбрать сладости для подарка из ассортимента или " +
                "система автоматически подберет сладости для вашего подарка? Введите соответствующее: самостоятельно " +
                "или автоматически");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equals("самостоятельно")){
            userСonfectionChoise();
        }
        else if (answer.equals("автоматически")){
            systemСonfectionChoise();
        }

    }

    //Метод для ручного выбора продукции для пользователя
    public static void userСonfectionChoise(){

        System.out.println("Вы выбрали опцию самостоятельного выбора продуктов для вашего подарка из нашего ассортимента." +
                " \n Важно! Вы можете выбрать по 2 варианта для каждого из вида сладости");

        String[] sweetsAssortment = new String[] {"Конфеты \"Воронежские\"", "Конфеты \"Коровка\"",
                "Конфеты \"Барбарис\"", "Конфеты \"Огни Москвы\"", "Конфеты \"Птичье молоко\""};
        int[] sweetsAssortmentWeight = new int[] {11, 15, 5, 14, 13};

        System.out.println("Выберите, пожалуйста, конфеты, которые вы хотите добавить в подарок");
        System.out.println("Наш ассортимент: ");

        for (String sweetsAssortmentElement: sweetsAssortment) {
            System.out.println(sweetsAssortmentElement);
        }

        System.out.println("Введите номера двух выбранных вами видов конфет (от 1 до " + sweetsAssortment.length +
                ") \n" +
                "Нельзя ввести 2 одинаковых товара из ассортимента");

        Scanner scanner = new Scanner(System.in);
        String positionInSweetsAssortment1Scanned = scanner.nextLine();
        String positionInSweetsAssortment2Scanned = scanner.nextLine();

        while (positionInSweetsAssortment1Scanned.equals(positionInSweetsAssortment2Scanned)){
            System.out.println("Вы выбрали 2 одинаковых вида конфет. Пожалуйста выполните ввод снова.");

            positionInSweetsAssortment1Scanned = scanner.nextLine();
            positionInSweetsAssortment2Scanned = scanner.nextLine();
        }

        int positionInSweetsAssortment1 = Integer.parseInt(positionInSweetsAssortment1Scanned) - 1;
        int positionInSweetsAssortment2 = Integer.parseInt(positionInSweetsAssortment2Scanned) - 1;

        // Формируем объекты - конфеты в зависимости от того, что выбрал пользователь
        Sweets sweetType1 = new Sweets(sweetsAssortment[positionInSweetsAssortment1],
                    sweetsAssortmentWeight[positionInSweetsAssortment1]);
        Sweets sweetType2 = new Sweets(sweetsAssortment[positionInSweetsAssortment2],
                    sweetsAssortmentWeight[positionInSweetsAssortment2]);

        // Ассортимент мармелада
        String[] marmaladeAssortment = new String[] {"Мармедад \"Кислые червячки\"", "Мармелад \"Веселые мишки\"",
                "Мармелад \"Клубника 3D\"", "Мармелад \"Бабл Гам\"", "Мармелад \"Яркие паучки\""};
        int[] marmaladeAssortmentWeight = new int[] {3, 1, 2, 3, 1}; //вес одной мармеладки в граммах

        System.out.println("Выберите, пожалуйста, мармелад, который вы хотите добавить в подарок");
        System.out.println("Наш ассортимент: ");

        for (String marmaladeAssortmentElement: marmaladeAssortment) {
            System.out.println(marmaladeAssortmentElement);
        }

        System.out.println("Введите номера двух выбранных вами видов мармелада (от 1 до " + sweetsAssortment.length +
                ") \n" +
                "Нельзя ввести 2 одинаковых товара из ассортимента");

        String positionInMarmaladeAssortment1Scanned = scanner.nextLine();
        String positionInMarmaladeAssortment2Scanned = scanner.nextLine();

        while (positionInMarmaladeAssortment1Scanned.equals(positionInMarmaladeAssortment2Scanned)){
            System.out.println("Вы выбрали 2 одинаковых вида мармелада. Пожалуйста выполните ввод снова.");

            positionInMarmaladeAssortment1Scanned = scanner.nextLine();
            positionInMarmaladeAssortment2Scanned = scanner.nextLine();
        }

        int positionInMarmaladeAssortment1 = Integer.parseInt(positionInMarmaladeAssortment1Scanned) - 1;
        int positionInMarmaladeAssortment2 = Integer.parseInt(positionInMarmaladeAssortment2Scanned) - 1;

        // Формируем объекты - мармеладки в зависимости от того, что выбрал пользователь
        Marmalade marmaladeType1 = new Marmalade(marmaladeAssortment[positionInMarmaladeAssortment1],
                marmaladeAssortmentWeight[positionInMarmaladeAssortment1]);
        Marmalade marmaladeType2 = new Marmalade(marmaladeAssortment[positionInMarmaladeAssortment2],
                marmaladeAssortmentWeight[positionInMarmaladeAssortment2]);

        // Ассортимент шоколада
        String[] chocolateAssortment = new String[] {"Шоколад \"Молочный\"", "Шоколад \"Воздушный белый\"",
                "Молочный шоколад с карамельной начинкой \"Milka\"", "Молочный шоколад с лесными орехами \"Alpen Gold\"",
                "Молочный шоколад с печеньем \"Alpen Gold\""};
        int[] chocolateAssortmentWeight = new int[] {100, 85, 110, 120, 100}; //вес одной шоколадки в граммах

        System.out.println("Выберите, пожалуйста, шоколад, который вы хотите добавить в подарок");
        System.out.println("Наш ассортимент: ");

        for (String chocolateAssortmentElement: chocolateAssortment) {
            System.out.println(chocolateAssortmentElement);
        }

        System.out.println("Введите номера двух выбранных вами видов шоколада (от 1 до " + sweetsAssortment.length +
                ") \n" +
                "Нельзя ввести 2 одинаковых товара из ассортимента");

        String positionInChocolateAssortment1Scanned = scanner.nextLine();
        String positionInChocolateAssortment2Scanned = scanner.nextLine();

        while (positionInChocolateAssortment1Scanned.equals(positionInChocolateAssortment2Scanned)){
            System.out.println("Вы выбрали 2 одинаковых вида шоколада. Пожалуйста выполните ввод снова.");

            positionInChocolateAssortment1Scanned = scanner.nextLine();
            positionInChocolateAssortment2Scanned = scanner.nextLine();
        }

        int positionInChocolateAssortment1 = Integer.parseInt(positionInChocolateAssortment1Scanned) - 1;
        int positionInChocolateAssortment2 = Integer.parseInt(positionInChocolateAssortment2Scanned) - 1;

        // Формируем объекты - шоколадки в зависимости от того, что выбрал пользователь
        Chocolate chocolateType1 = new Chocolate(chocolateAssortment[positionInChocolateAssortment1],
                chocolateAssortmentWeight[positionInChocolateAssortment1]);
        Chocolate chocolateType2 = new Chocolate(chocolateAssortment[positionInChocolateAssortment2],
                chocolateAssortmentWeight[positionInChocolateAssortment2]);

        // Ассортимент печенья
        String[] cookieAssortment = new String[] {"Печенье \"Аленка\" с клюквой и шоколадом",
                "Печенье \"Аленка\" шоколадное с ореховой начинкой",
                "Понч с вишневой начинкой \"Bite&Go\"", "Печенье \"Milka Sticks\" с шоколадной начинкой",
                "Печенье \"Milka Sensations\" с шоколадной крошкой"};
        int[] cookieAssortmentWeight = new int[] {140, 200, 150, 112, 312};

        System.out.println("Выберите, пожалуйста, печенье, который вы хотите добавить в подарок");
        System.out.println("Наш ассортимент: ");

        for (String cookieAssortmentElement: cookieAssortment) {
            System.out.println(cookieAssortmentElement);
        }

        System.out.println("Введите номера двух выбранных вами видов печенья (от 1 до " + sweetsAssortment.length +
                ") \n" +
                "Нельзя ввести 2 одинаковых товара из ассортимента");

        String positionInCookieAssortment1Scanned = scanner.nextLine();
        String positionInCookieAssortment2Scanned = scanner.nextLine();

        while (positionInCookieAssortment1Scanned.equals(positionInCookieAssortment2Scanned)){
            System.out.println("Вы выбрали 2 одинаковых вида печенья. Пожалуйста выполните ввод снова.");

            positionInCookieAssortment1Scanned = scanner.nextLine();
            positionInCookieAssortment2Scanned = scanner.nextLine();
        }

        int positionInСookieAssortment1 = Integer.parseInt(positionInChocolateAssortment1Scanned) - 1;
        int positionInСookieAssortment2 = Integer.parseInt(positionInChocolateAssortment2Scanned) - 1;

        // Формируем объекты - печенья
        Cookie cookieType1 = new Cookie(cookieAssortment[positionInСookieAssortment1],
                cookieAssortmentWeight[positionInСookieAssortment1]);
        Cookie cookieType2 = new Cookie(cookieAssortment[positionInСookieAssortment2],
                cookieAssortmentWeight[positionInСookieAssortment2]);

        System.out.println("Для вашего подарка вы выбрали: ");
        System.out.println(sweetType1.sweetName);
        System.out.println(sweetType2.sweetName);
        System.out.println(marmaladeType1.marmaladeName);
        System.out.println(marmaladeType2.marmaladeName);
        System.out.println(chocolateType1.chocolateName);
        System.out.println(chocolateType2.chocolateName);
        System.out.println(cookieType1.cookieName);
        System.out.println(cookieType2.cookieName);
        System.out.println("Вы довольны подбором продукции? Если, да, то введите \"Да\" и мы приступим к " +
                "формированию подарка. Если нет, то введите \"Нет\" и измените свой выбор");

        String answer = scanner.nextLine();

        if (answer.equals("Да")){
            System.out.println("Скоро будет :)");
        }
        else if (answer.equals("Нет")){
            userСonfectionChoise();
        }
    }

    //Метод для автоматического выбора продукции для пользователя
    public static void systemСonfectionChoise(){

        // Массивы хранят ассортимент и граммовки для динамичесвого формирования объектов. Соответствие 1 к 1.
        String[] sweetsAssortment = new String[] {"Конфеты \"Воронежские\"", "Конфеты \"Коровка\"",
                "Конфеты \"Барбарис\"", "Конфеты \"Огни Москвы\"", "Конфеты \"Птичье молоко\""};
        int[] sweetsAssortmentWeight = new int[] {11, 15, 5, 14, 13}; //вес одной конфеты в граммах

        int positionInSweetsAssortment1 = (int) (Math.random()*4);
        int positionInSweetsAssortment2 = (int) (Math.random()*4);

        while (positionInSweetsAssortment1 == positionInSweetsAssortment2){
            positionInSweetsAssortment2 = (int) (Math.random()*4);
        }

        // Формируем объекты - конфеты
        Sweets sweetType1 = new Sweets(sweetsAssortment[positionInSweetsAssortment1],
                sweetsAssortmentWeight[positionInSweetsAssortment1]);
        Sweets sweetType2 = new Sweets(sweetsAssortment[positionInSweetsAssortment2],
                sweetsAssortmentWeight[positionInSweetsAssortment2]);

        // Ассортимент мармелада
        String[] marmaladeAssortment = new String[] {"Мармедад \"Кислые червячки\"", "Мармелад \"Веселые мишки\"",
                "Мармелад \"Клубника 3D\"", "Мармелад \"Бабл Гам\"", "Мармелад \"Яркие паучки\""};
        int[] marmaladeAssortmentWeight = new int[] {3, 1, 2, 3, 1}; //вес одной мармеладки в граммах

        int positionInMarmaladeAssortment1 = (int) (Math.random()*4);
        int positionInMarmaladeAssortment2 = (int) (Math.random()*4);

        while (positionInMarmaladeAssortment1 == positionInMarmaladeAssortment2){
            positionInMarmaladeAssortment2 = (int) (Math.random()*4);
        }

        // Формируем объекты - мармеладки
        Marmalade marmaladeType1 = new Marmalade(marmaladeAssortment[positionInMarmaladeAssortment1],
                marmaladeAssortmentWeight[positionInMarmaladeAssortment1]);
        Marmalade marmaladeType2 = new Marmalade(marmaladeAssortment[positionInMarmaladeAssortment2],
                marmaladeAssortmentWeight[positionInMarmaladeAssortment2]);
        /*
        System.out.println(marmaladeType1.marmaladeName + " " + marmaladeType1.marmaladeWeight);
        System.out.println(marmaladeType2.marmaladeName + " " + marmaladeType2.marmaladeWeight);*/

        // Ассортимент шоколада
        String[] chocolateAssortment = new String[] {"Шоколад \"Молочный\"", "Шоколад \"Воздушный белый\"",
                "Молочный шоколад с карамельной начинкой \"Milka\"", "Молочный шоколад с лесными орехами \"Alpen Gold\"",
                "Молочный шоколад с печеньем \"Alpen Gold\""};
        int[] chocolateAssortmentWeight = new int[] {100, 85, 110, 120, 100}; //вес одной шоколадки в граммах

        int positionInChocolateAssortment1 = (int) (Math.random()*4);
        int positionInChocolateAssortment2 = (int) (Math.random()*4);

        while (positionInChocolateAssortment1 == positionInChocolateAssortment2){
            positionInChocolateAssortment2 = (int) (Math.random()*4);
        }

        // Формируем объекты - шоколадки
        Chocolate chocolateType1 = new Chocolate(chocolateAssortment[positionInChocolateAssortment1],
                chocolateAssortmentWeight[positionInChocolateAssortment1]);
        Chocolate chocolateType2 = new Chocolate(chocolateAssortment[positionInChocolateAssortment2],
                chocolateAssortmentWeight[positionInChocolateAssortment2]);

        // Ассортимент печенья
        String[] cookieAssortment = new String[] {"Печенье \"Аленка\" с клюквой и шоколадом",
                "Печенье \"Аленка\" шоколадное с ореховой начинкой",
                "Понч с вишневой начинкой \"Bite&Go\"", "Печенье \"Milka Sticks\" с шоколадной начинкой",
                "Печенье \"Milka Sensations\" с шоколадной крошкой"};
        int[] cookieAssortmentWeight = new int[] {140, 200, 150, 112, 312};

        int positionInСookieAssortment1 = (int) (Math.random()*4);
        int positionInСookieAssortment2 = (int) (Math.random()*4);

        while (positionInСookieAssortment1 == positionInСookieAssortment2){
            positionInСookieAssortment2= (int) (Math.random()*4);
        }

        // Формируем объекты - печенья
        Cookie cookieType1 = new Cookie(cookieAssortment[positionInСookieAssortment1],
                cookieAssortmentWeight[positionInСookieAssortment1]);
        Cookie cookieType2 = new Cookie(cookieAssortment[positionInСookieAssortment2],
                cookieAssortmentWeight[positionInСookieAssortment2]);

        System.out.println("Для вашего подарка были выбраны: ");
        System.out.println(sweetType1.sweetName);
        System.out.println(sweetType2.sweetName);
        System.out.println(marmaladeType1.marmaladeName);
        System.out.println(marmaladeType2.marmaladeName);
        System.out.println(chocolateType1.chocolateName);
        System.out.println(chocolateType2.chocolateName);
        System.out.println(cookieType1.cookieName);
        System.out.println(cookieType2.cookieName);
        System.out.println("Вы довольны подбором продукции? Если, да, то введите \"Да\" и мы приступим к " +
                "формированию подарка. Если нет, то введите \"Нет\" и система изменит выбор");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equals("Да")){
            System.out.println("Скоро будет :)");
        }
        else if (answer.equals("Нет")){
            systemСonfectionChoise();
        }
    }
}