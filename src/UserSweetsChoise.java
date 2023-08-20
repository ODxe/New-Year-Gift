import java.util.Scanner;

public class UserSweetsChoise {

    // Метод для самостоятельного выбора сладостей пользователем
    public static void userChoise(){

        System.out.println("Вы выбрали опцию самостоятельного выбора продуктов для вашего подарка из нашего ассортимента." +
                " \n Важно! Вы можете выбрать по 2 варианта для каждого из вида сладости");

        String[] candiesAssortment = new String[] {"Конфеты \"Воронежские\"", "Конфеты \"Коровка\"",
                "Конфеты \"Барбарис\"", "Конфеты \"Огни Москвы\"", "Конфеты \"Птичье молоко\""};
        int[] candiesAssortmentWeight = new int[] {11, 15, 5, 14, 13};

        System.out.println("Выберите, пожалуйста, конфеты, которые вы хотите добавить в подарок");
        System.out.println("Наш ассортимент: ");

        for (String candiesAssortmentElement: candiesAssortment) {
            System.out.println(candiesAssortmentElement);
        }

        System.out.println("Введите номера двух выбранных вами видов конфет (от 1 до " + candiesAssortment.length +
                ") \n" +
                "Нельзя ввести 2 одинаковых товара из ассортимента");

        Scanner scanner = new Scanner(System.in);
        String positionInCandiesAssortment1Scanned = scanner.nextLine();
        String positionInCandiesAssortment2Scanned = scanner.nextLine();

        while (positionInCandiesAssortment1Scanned.equals(positionInCandiesAssortment2Scanned)){
            System.out.println("Вы выбрали 2 одинаковых вида конфет. Пожалуйста выполните ввод снова.");

            positionInCandiesAssortment1Scanned = scanner.nextLine();
            positionInCandiesAssortment2Scanned = scanner.nextLine();
        }

        int positionInCandiesAssortment1 = Integer.parseInt(positionInCandiesAssortment1Scanned) - 1;
        int positionInCandiesAssortment2 = Integer.parseInt(positionInCandiesAssortment2Scanned) - 1;

        // Формируем объекты - конфеты в зависимости от того, что выбрал пользователь
        Candy candyType1 = new Candy(candiesAssortment[positionInCandiesAssortment1],
                candiesAssortmentWeight[positionInCandiesAssortment1]);
        Candy candyType2 = new Candy(candiesAssortment[positionInCandiesAssortment2],
                candiesAssortmentWeight[positionInCandiesAssortment2]);

        // Ассортимент мармелада
        String[] marmaladeAssortment = new String[] {"Мармедад \"Кислые червячки\"", "Мармелад \"Веселые мишки\"",
                "Мармелад \"Клубника 3D\"", "Мармелад \"Бабл Гам\"", "Мармелад \"Яркие паучки\""};
        int[] marmaladeAssortmentWeight = new int[] {3, 1, 2, 3, 1}; //вес одной мармеладки в граммах

        System.out.println("Выберите, пожалуйста, мармелад, который вы хотите добавить в подарок");
        System.out.println("Наш ассортимент: ");

        for (String marmaladeAssortmentElement: marmaladeAssortment) {
            System.out.println(marmaladeAssortmentElement);
        }

        System.out.println("Введите номера двух выбранных вами видов мармелада (от 1 до " + marmaladeAssortment.length +
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

        System.out.println("Введите номера двух выбранных вами видов шоколада (от 1 до " + chocolateAssortment.length +
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

        System.out.println("Введите номера двух выбранных вами видов печенья (от 1 до " + cookieAssortment.length +
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
        System.out.println(candyType1.candyName);
        System.out.println(candyType2.candyName);
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
            userChoise();
        }
    }
}