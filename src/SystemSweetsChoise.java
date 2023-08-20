import java.util.Scanner;

public class SystemSweetsChoise {

    // Метод для автоматического подпора сладостей для подарка
    public static void systemChoise(){

        // Массивы хранят ассортимент и граммовки для динамичесвого формирования объектов. Соответствие 1 к 1.
        String[] candiesAssortment = new String[] {"Конфеты \"Воронежские\"", "Конфеты \"Коровка\"",
                "Конфеты \"Барбарис\"", "Конфеты \"Огни Москвы\"", "Конфеты \"Птичье молоко\""};
        int[] candiesAssortmentWeight = new int[] {11, 15, 5, 14, 13};

        int positionInCandiesAssortment1 = (int) (Math.random()*4);
        int positionInCandiesAssortment2 = (int) (Math.random()*4);

        while (positionInCandiesAssortment1 == positionInCandiesAssortment2){
            positionInCandiesAssortment2 = (int) (Math.random()*4);
        }

        // Формируем объекты - конфеты
        Candy candyType1 = new Candy(candiesAssortment[positionInCandiesAssortment1],
                candiesAssortmentWeight[positionInCandiesAssortment1]);
        Candy candyType2 = new Candy(candiesAssortment[positionInCandiesAssortment2],
                candiesAssortmentWeight[positionInCandiesAssortment2]);

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
        System.out.println(candyType1.candyName);
        System.out.println(candyType2.candyName);
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
            systemChoise();
        }
    }
}
