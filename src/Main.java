public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask1");
//        С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии,
//        что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        int capital = 0, requiredAmount = 2459000, contribution = 15_000, i = 0;       //первоначально мы имеем 0 рублей
        while (capital <= requiredAmount) {
            i++;
            capital = capital + contribution;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + capital + " рублей .");
        }
        System.out.println("Сумма накоплена за  " + i + " месяц, сумма накоплений равна " + capital + " рублей .");

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
        int population = 12_000_000, PopulationPer1000 = 0, birthPer1000 = 17, mortalityPer1000 = 8, year = 0;
        PopulationPer1000 = population / 1000;
        do {
            year++;
            PopulationPer1000 = PopulationPer1000 + birthPer1000 - mortalityPer1000;
            population = PopulationPer1000 * 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        } while (year < 10);
        System.out.println("\nTask4");
//        Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется еще 7%.
//        Первоначальная сумма вклада — 15 тысяч рублей.
        float deposit = 15000f, percentMouth = 1.07f, sumSave = 0f, purpose = 12_000_000f;
        int month = 0;
        while (sumSave <= purpose) {
            month++;
            sumSave = sumSave + deposit * percentMouth;
            System.out.println("Сумма накоплений в месяц " + month + ", составляет " + sumSave);
        }

        System.out.println("\nTask5");
//       Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд, а только каждый шестой.
//       Должны быть видны накопления за 6-й, 12-й, 18-й, 24-й и следующие месяцы.
        month = 0;
        sumSave = 0f;
        while (sumSave <= purpose) {
            month++;
            sumSave = sumSave + deposit * percentMouth;
            if (month % 6 == 0) {
                System.out.println("Сумма накоплений в шесть месяцев " + month + ", составляет " + sumSave);
            }
        }
        System.out.println("\nTask6");
        int periodAccumulation = 9 * 12; //Василий решил, что будет копить деньги ближайшие 9 лет.
//        Он хочет знать, какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
//        Исходная сумма всё та же — 15 тысяч рублей, проценты банка — 7% ежемесячно.
//        Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.
        month = 0;
        sumSave = 0f;


        while (month <= periodAccumulation) {
            month++;
            sumSave = sumSave + deposit * percentMouth;
            if (month % 6 == 0) {
                System.out.println("Сумма накоплений  " + month + " полгода, составляет " + sumSave);
            }
        }
        System.out.println("\nTask7");
//      Нужно написать программу, которая считает дни месяца по датам, определяет, какой день — пятница,
//      и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.
        int firstFriday = 1, //Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца
                dayMouth = 31; //В нашем месяце 31 день
        int day = firstFriday;
        while (day <= dayMouth) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            day = day + 7;
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