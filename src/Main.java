public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask1");
//        С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии,
//        что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        int capital = 0;                     //первоначально мы имеем 0 рублей
        int requiredAmount = 2459000;       //2 459 000 рублей
        int contribution = 15_000;          //готовы откладывать по 15 тысяч рублей
        int month = 0;                      //месяцев потребуется
        while (capital <= requiredAmount) {
            month++;
            capital +=  contribution;
            capital*=1.01;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + capital + " рублей .");
        }
        System.out.println("Сумма накоплена за  " + month + " месяц, сумма накоплений равна " + capital + " рублей .");

        System.out.println("\nTask2");
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();

        for (number = 10; number >= 1; number--) {
            System.out.print(number + " ");

        }
        System.out.println("\nTask3");
//     В стране Y население — 12 миллионов человек.
//     Рождаемость составляет 17 человек на 1000, смертность — 8 человек.
//     Рассчитайте, какая численность населения будет через 10 лет, если показатели рождаемости и смертности постоянны.
        int population = 12_000_000;
        int populationPer1000 = 0;
        int birth = 17;
        int mortality = 8;
        int year = 0;
        do {
            year++;
            population += population/1000 *(birth - mortality);

            System.out.println("Год " + year + ", численность населения составляет " + population);
        } while (year < 10);

        System.out.println("\nTask4");
//        Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется еще 7%.
//        Первоначальная сумма вклада — 15 тысяч рублей.
        int deposit = 15000;
        float percentMouth = 1.07f;
        int sumSave = 0;
        int purpose = 12_000_000;
        month = 1;
        while (deposit <= purpose) {
            deposit*=percentMouth;
            System.out.println("Сумма накоплений в месяц " + month + ", составляет " + deposit);
            ++month;
        }

        System.out.println("\nTask5");
//       Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд, а только каждый шестой.
//       Должны быть видны накопления за 6-й, 12-й, 18-й, 24-й и следующие месяцы.
        month = 0;
        deposit=15000;
        while (deposit <= purpose) {
            month++;
            deposit*=percentMouth;
            if (month % 6 == 0) {
                System.out.println("Сумма накоплений в шесть месяцев " + month + ", составляет " + deposit);
            }
        }
        System.out.println("\nTask6");
        int periodAccumulation = 9 * 12; //Василий решил, что будет копить деньги ближайшие 9 лет.
//        Он хочет знать, какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
//        Исходная сумма всё та же — 15 тысяч рублей, проценты банка — 7% ежемесячно.
//        Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.

        deposit=15000;
        for (month=1; month< periodAccumulation;month++) {
            deposit *= percentMouth;
            if (month % 6 == 0) {
                System.out.println("Сумма накоплений  " + month + " полгода, составляет " + deposit);
            }
        }
        System.out.println("\nTask7");
//      Нужно написать программу, которая считает дни месяца по датам, определяет, какой день — пятница,
//      и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.
        int friday = 3, //Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца
                dayMouth = 31; //В нашем месяце 31 день
        for (friday=1;friday<=31;friday+=7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");

        }

        System.out.println("\nTask8");
        int currentYear = java.time.Year.now().getValue();        //теущий год
        int yearCometAppeared = 0, period=79; //Известно, что комета пролетает каждый 79-й год, начиная с нулевого.
        int twoHundredBefore=currentYear-200; //В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета,
        int oneHundredAfter=currentYear+100;; //а также следующий год ее появления (ближайшие 100 лет).

        System.out.println("Комета пролетала за последнее время в годы:");
        do {
            yearCometAppeared = yearCometAppeared + period;
            if (yearCometAppeared >= (twoHundredBefore) && yearCometAppeared <= (oneHundredAfter)) {
                System.out.println(yearCometAppeared);

            }
        }while(yearCometAppeared<oneHundredAfter);
    }
}