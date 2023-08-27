import java.util.Scanner;

// Класс - подарок
public class NewYearGift {

    // Для каждой сладости в подарке 3 свойства - название, ее вес (в граммах) и количество таких сладостей

    String candyFirstTypeName;
    int candyFirstTypeWeightInGrams;
    int candyFirstTypeQuantity;

    String candySecondTypeName;
    int candySecondTypeWeightInGrams;
    int candySecondTypeQuantity;

    String marmaladeFirstTypeName;
    int marmaladeFirstTypeWeightInGrams;
    int marmaladeFirstTypeQuantity;

    String marmaladeSecondTypeName;
    int marmaladeSecondTypeWeightInGrams;
    int marmaladeSecondTypeQuantity;

    String chocolateFirstTypeName;
    int chocolateFirstTypeWeightInGrams;
    int chocolateFirstTypeQuantity;

    String chocolateSecondTypeName;
    int chocolateSecondTypeWeightInGrams;
    int chocolateSecondTypeQuantity;

    String cookieFirstTypeName;
    int cookieFirstTypeWeightInGrams;
    int cookieFirstTypeQuantity;

    String cookieSecondTypeName;
    int cookieSecondTypeWeightInGrams;
    int cookieSecondTypeQuantity;


    // Конструктор для инициализации создания подарка
    NewYearGift(){
        System.out.println("Чтобы приступить к созданию подарка нажмите Enter");
    }

    // Создание подарка
    NewYearGift(String candyName1, int candyWeightInGram1, int candyAmount1,
                String candyName2, int candyWeightInGram2, int candyAmount2,
                String marmaladeName1, int marmaladeWeightInGram1, int marmaladeAmount1,
                String marmaladeName2, int marmaladeWeightInGram2, int marmaladeAmount2,
                String chocolateName1, int chocolateWeightInGram1, int chocolateAmount1,
                String chocolateName2, int chocolateWeightInGram2, int chocolateAmount2,
                String cookieName1, int cookieWeightInGram1, int cookieAmount1,
                String cookieName2, int cookieWeightInGram2, int cookieAmount2){

        candyFirstTypeName = candyName1;
        candyFirstTypeWeightInGrams = candyWeightInGram1;
        candyFirstTypeQuantity = candyAmount1;

        candySecondTypeName = candyName2;
        candySecondTypeWeightInGrams = candyWeightInGram2;
        candySecondTypeQuantity = candyAmount2;

        marmaladeFirstTypeName = marmaladeName1;
        marmaladeFirstTypeWeightInGrams = marmaladeWeightInGram1;
        marmaladeFirstTypeQuantity = marmaladeAmount1;

        marmaladeSecondTypeName = marmaladeName2;
        marmaladeSecondTypeWeightInGrams = marmaladeWeightInGram2;
        marmaladeSecondTypeQuantity = marmaladeAmount2;

        chocolateFirstTypeName = chocolateName1;
        chocolateFirstTypeWeightInGrams = chocolateWeightInGram1;
        chocolateFirstTypeQuantity = chocolateAmount1;

        chocolateSecondTypeName = chocolateName2;
        chocolateSecondTypeWeightInGrams = chocolateWeightInGram2;
        chocolateSecondTypeQuantity = chocolateAmount2;

        cookieFirstTypeName = cookieName1;
        cookieFirstTypeWeightInGrams = cookieWeightInGram1;
        cookieFirstTypeQuantity = cookieAmount1;

        cookieSecondTypeName = cookieName2;
        cookieSecondTypeWeightInGrams = cookieWeightInGram2;
        cookieSecondTypeQuantity = cookieAmount2;
    }

    // метод для вывода инфорации о подарке
    private void GiftInfo(NewYearGift gift){

        System.out.println("----------------------------------------------------");
        System.out.println("Состав подарка: \n");

        if (gift.candyFirstTypeQuantity > 0){
            System.out.println(gift.candyFirstTypeName + " " + gift.candyFirstTypeQuantity + " шт. " +
                    gift.candyFirstTypeQuantity * gift.candyFirstTypeWeightInGrams + " грамм (вес одной конфеты " +
                    gift.candyFirstTypeWeightInGrams + " грамм)");
        }

        if (gift.candySecondTypeQuantity > 0){
            System.out.println(gift.candySecondTypeName + " " + gift.candySecondTypeQuantity + " шт. " +
                    gift.candySecondTypeQuantity * gift.candySecondTypeWeightInGrams + " грамм (вес одной конфеты " +
                    gift.candySecondTypeWeightInGrams + " грамм)");
        }

        if (gift.marmaladeFirstTypeQuantity > 0){
            System.out.println(gift.marmaladeFirstTypeName + " " + gift.marmaladeFirstTypeQuantity + " шт. " +
                    gift.marmaladeFirstTypeQuantity * gift.marmaladeFirstTypeWeightInGrams + " грамм (вес одной " +
                    "мармеладки " + gift.marmaladeFirstTypeWeightInGrams + " грамм)");
        }

        if (gift.marmaladeSecondTypeQuantity > 0){
            System.out.println(gift.marmaladeSecondTypeName + " " + gift.marmaladeSecondTypeQuantity + " шт. " +
                    gift.marmaladeSecondTypeQuantity * gift.marmaladeSecondTypeWeightInGrams + " грамм (вес одной " +
                    "мармеладки " + gift.marmaladeSecondTypeWeightInGrams + " грамм)");
        }

        if (gift.chocolateFirstTypeQuantity > 0){
            System.out.println(gift.chocolateFirstTypeName + " " + gift.chocolateFirstTypeQuantity + " шт. " +
                    gift.chocolateFirstTypeQuantity * gift.chocolateFirstTypeWeightInGrams + " грамм (вес одной " +
                    "шоколадки " + gift.chocolateFirstTypeWeightInGrams + " грамм)");
        }

        if (gift.chocolateSecondTypeQuantity > 0){
            System.out.println(gift.chocolateSecondTypeName + " " + gift.chocolateSecondTypeQuantity + " шт. " +
                    gift.chocolateSecondTypeQuantity * gift.chocolateSecondTypeWeightInGrams + " грамм (вес одной " +
                    "шоколадки " + gift.chocolateSecondTypeWeightInGrams + " грамм)");
        }

        if (gift.cookieFirstTypeQuantity > 0){
            System.out.println(gift.cookieFirstTypeName + " " + gift.cookieFirstTypeQuantity + " шт. " +
                    gift.cookieFirstTypeQuantity * gift.cookieFirstTypeWeightInGrams + " грамм (вес одного " +
                    "печенья " + gift.cookieFirstTypeWeightInGrams + " грамм)");
        }

        if (gift.cookieSecondTypeQuantity > 0){
            System.out.println(gift.cookieSecondTypeName + " " + gift.cookieSecondTypeQuantity + " шт. " +
                    gift.cookieSecondTypeQuantity * gift.cookieSecondTypeWeightInGrams + " грамм (вес одного " +
                    "печенья " + gift.cookieSecondTypeWeightInGrams + " грамм)");
        }

        int giftTotalWeight = gift.candyFirstTypeQuantity * gift.candyFirstTypeWeightInGrams +
                gift.candySecondTypeQuantity * gift.candySecondTypeWeightInGrams +
                gift.marmaladeFirstTypeQuantity * gift.marmaladeFirstTypeWeightInGrams +
                gift.marmaladeSecondTypeQuantity * gift.marmaladeSecondTypeWeightInGrams +
                gift.chocolateFirstTypeQuantity * gift.chocolateFirstTypeWeightInGrams +
                gift.chocolateSecondTypeQuantity * gift.chocolateSecondTypeWeightInGrams +
                gift.cookieFirstTypeQuantity * gift.cookieFirstTypeWeightInGrams +
                gift.cookieSecondTypeQuantity * gift.cookieSecondTypeWeightInGrams;

        System.out.println("\n Общий вес подарка: " + giftTotalWeight + " грамм");
    }

    // Взаимодействие с пользователем при создании подарка
    public void CreateNewYearGift(Candy candyFirstType, Candy candySecondType, Marmalade marmaladeFirstType,
                                         Marmalade marmaladeSecondType, Chocolate chocolateFirstType,
                                         Chocolate chocolateSecondType, Cookie cookieFirstType,
                                         Cookie cookieSecondType){

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        System.out.println("Сколько всего конфет " + candyFirstType.candyName + " вы хотите добавить в подарок? Укажите " +
                "количество: ");
        answer = scanner.nextLine();
        int candyType1Amount = Integer.parseInt(answer);

        System.out.println("Сколько всего конфет " + candySecondType.candyName + " вы хотите добавить в подарок? Укажите " +
                "количество: ");
        answer = scanner.nextLine();
        int candyType2Amount = Integer.parseInt(answer);

        System.out.println("Сколько всего мармелада " + marmaladeFirstType.marmaladeName + " вы хотите добавить " +
                "в подарок? Укажите количество: ");
        answer = scanner.nextLine();
        int marmaladeType1Amount = Integer.parseInt(answer);

        System.out.println("Сколько всего мармелада " + marmaladeSecondType.marmaladeName + " вы хотите добавить " +
                "в подарок? Укажите количество: ");
        answer = scanner.nextLine();
        int marmaladeType2Amount = Integer.parseInt(answer);

        System.out.println("Сколько всего шоколада " + chocolateFirstType.chocolateName + " вы хотите добавить " +
                "в подарок? Укажите количество: ");
        answer = scanner.nextLine();
        int chocolateType1Amount = Integer.parseInt(answer);

        System.out.println("Сколько всего шоколада " + chocolateSecondType.chocolateName + " вы хотите добавить " +
                "в подарок? Укажите количество: ");
        answer = scanner.nextLine();
        int chocolateType2Amount = Integer.parseInt(answer);

        System.out.println("Сколько всего печенья " + cookieFirstType.cookieName + " вы хотите добавить " +
                "в подарок? Укажите количество: ");
        answer = scanner.nextLine();
        int cookieType1Amount = Integer.parseInt(answer);

        System.out.println("Сколько всего печенья " + cookieSecondType.cookieName + " вы хотите добавить " +
                "в подарок? Укажите количество: ");
        answer = scanner.nextLine();
        int cookieType2Amount = Integer.parseInt(answer);

        NewYearGift gift = new NewYearGift(candyFirstType.candyName, candyFirstType.candyWeight, candyType1Amount,
                candySecondType.candyName, candySecondType.candyWeight, candyType2Amount,
                marmaladeFirstType.marmaladeName, marmaladeFirstType.marmaladeWeight, marmaladeType1Amount,
                marmaladeSecondType.marmaladeName, marmaladeSecondType.marmaladeWeight, marmaladeType2Amount,
                chocolateFirstType.chocolateName, chocolateFirstType.chocolateWeight, chocolateType1Amount,
                chocolateSecondType.chocolateName, chocolateSecondType.chocolateWeight, chocolateType2Amount,
                cookieFirstType.cookieName, cookieFirstType.cookieWeight, cookieType1Amount,
                cookieSecondType.cookieName, cookieSecondType.cookieWeight, cookieType2Amount);

        // Выводим информацию о собранном подарке
        gift.GiftInfo(gift);
    }
}
