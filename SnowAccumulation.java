import java.util.Scanner;

/**
 * A SnowAccumulation class reporting
 * total snowfall, snowfall accumulations, and resort 
 * snowfall information based on user input.
 *
 * @author Purdue CS, Akash Mullick
 * @version February 16, 2022
 */

public class SnowAccumulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Enter Resort One Name:");
        String resortOne = scanner.nextLine();
        System.out.println("Enter Resort Two Name:");
        String resortTwo = scanner.nextLine();
        System.out.println("Enter Snow Accumulations:");
        String accumulations = scanner.nextLine();
        System.out.println("Enter Report type:" +
                "\n1. Full" +
                "\n2. Summary");
        int reportType = scanner.nextInt();

        scanner.close();

        // The values of each of the accumulations are defined below, 
        // you should use these double variables to make your calculations.
        // Each string has 7 paired values so the format of the string is resortOneDayOne
        // - resortTwoDayOne, resortOneDayTwo - resortTwoDayTwo, ...
        int currentStringIndex = 0;
        double resortOneDayOne = Double.parseDouble(accumulations.substring(currentStringIndex,
                                                                            accumulations.indexOf("-")));
        currentStringIndex += accumulations.indexOf("-") + 1;
        double resortTwoDayOne = Double.parseDouble(accumulations.substring(currentStringIndex,
                                                                            accumulations.indexOf(",")));
        accumulations = accumulations.substring(accumulations.indexOf(",") + 1);

        currentStringIndex = 0;
        double resortOneDayTwo = Double.parseDouble(accumulations.substring(currentStringIndex,
                                                                            accumulations.indexOf("-")));
        currentStringIndex += accumulations.indexOf("-") + 1;
        double resortTwoDayTwo = Double.parseDouble(accumulations.substring(currentStringIndex,
                                                                            accumulations.indexOf(",")));
        accumulations = accumulations.substring(accumulations.indexOf(",") + 1);

        currentStringIndex = 0;
        double resortOneDayThree = Double.parseDouble(accumulations.substring(currentStringIndex,
                                                                              accumulations.indexOf("-")));
        currentStringIndex += accumulations.indexOf("-") + 1;
        double resortTwoDayThree = Double.parseDouble(accumulations.substring(currentStringIndex,
                                                                              accumulations.indexOf(",")));
        accumulations = accumulations.substring(accumulations.indexOf(",") + 1);

        currentStringIndex = 0;
        double resortOneDayFour = Double.parseDouble(accumulations.substring(currentStringIndex,
                                                                             accumulations.indexOf("-")));
        currentStringIndex += accumulations.indexOf("-") + 1;
        double resortTwoDayFour = Double.parseDouble(accumulations.substring(currentStringIndex,
                                                                             accumulations.indexOf(",")));
        accumulations = accumulations.substring(accumulations.indexOf(",") + 1);

        currentStringIndex = 0;
        double resortOneDayFive = Double.parseDouble(accumulations.substring(currentStringIndex,
                                                                             accumulations.indexOf("-")));
        currentStringIndex += accumulations.indexOf("-") + 1;
        double resortTwoDayFive = Double.parseDouble(accumulations.substring(currentStringIndex,
                                                                             accumulations.indexOf(",")));
        accumulations = accumulations.substring(accumulations.indexOf(",") + 1);

        currentStringIndex = 0;
        double resortOneDaySix = Double.parseDouble(accumulations.substring(currentStringIndex,
                                                                            accumulations.indexOf("-")));
        currentStringIndex += accumulations.indexOf("-") + 1;
        double resortTwoDaySix = Double.parseDouble(accumulations.substring(currentStringIndex,
                                                                            accumulations.indexOf(",")));
        accumulations = accumulations.substring(accumulations.indexOf(",") + 1);

        currentStringIndex = 0;
        double resortOneDaySeven = Double.parseDouble(accumulations.substring(currentStringIndex,
                                                                              accumulations.indexOf("-")));
        currentStringIndex += accumulations.indexOf("-") + 1;
        double resortTwoDaySeven = Double.parseDouble(accumulations.substring(currentStringIndex));
        
        // Do not modify above
        
        // ToDo: Implement your solution below.
        double[] resortOneSnowfall = new double[7];
        resortOneSnowfall[0] = resortOneDayOne;
        resortOneSnowfall[1] = resortOneDayTwo;
        resortOneSnowfall[2] = resortOneDayThree;
        resortOneSnowfall[3] = resortOneDayFour;
        resortOneSnowfall[4] = resortOneDayFive;
        resortOneSnowfall[5] = resortOneDaySix;
        resortOneSnowfall[6] = resortOneDaySeven;
        double[] resortTwoSnowfall = new double[7];
        resortTwoSnowfall[0] = resortTwoDayOne;
        resortTwoSnowfall[1] = resortTwoDayTwo;
        resortTwoSnowfall[2] = resortTwoDayThree;
        resortTwoSnowfall[3] = resortTwoDayFour;
        resortTwoSnowfall[4] = resortTwoDayFive;
        resortTwoSnowfall[5] = resortTwoDaySix;
        resortTwoSnowfall[6] = resortTwoDaySeven;
        double resortOneTotal = 0;
        double resortTwoTotal = 0;
        double resortOneAverage;
        double resortTwoAverage;
        double totalAccumulation;
        String snowier = "had greater snowfall on more days than";
        String congratulations = "is the undisputed winner!";
        int resortOneCount = 0;
        int resortTwoCount = 0;

        for (int i = 0; i < 7; i++) {
            resortOneTotal += resortOneSnowfall[i];
            resortTwoTotal += resortTwoSnowfall[i];
            if (resortOneSnowfall[i] > resortTwoSnowfall[i]) {
                resortOneCount += 1;
            } else if (resortOneSnowfall[i] < resortTwoSnowfall[i]) {
                resortTwoCount += 1;
            } else if (resortOneSnowfall[i] == resortTwoSnowfall[i]) {
                resortOneCount += 1;
                resortTwoCount += 1;
            }
        }
        resortOneAverage = resortOneTotal / 7;
        resortTwoAverage = resortTwoTotal / 7;
        totalAccumulation = resortOneTotal + resortTwoTotal;

        switch(reportType) {
            case 1:
                System.out.println(resortOne + " Full Report:");
                System.out.printf("Monday: %.2f\n", resortOneDayOne);
                System.out.printf("Tuesday: %.2f\n", resortOneDayTwo);
                System.out.printf("Wednesday: %.2f\n", resortOneDayThree);
                System.out.printf("Thursday: %.2f\n", resortOneDayFour);
                System.out.printf("Friday: %.2f\n", resortOneDayFive);
                System.out.printf("Saturday: %.2f\n", resortOneDaySix);
                System.out.printf("Sunday: %.2f\n", resortOneDaySeven);
                System.out.println(resortTwo + " Full Report:");
                System.out.printf("Monday: %.2f\n", resortTwoDayOne);
                System.out.printf("Tuesday: %.2f\n", resortTwoDayTwo);
                System.out.printf("Wednesday: %.2f\n", resortTwoDayThree);
                System.out.printf("Thursday: %.2f\n", resortTwoDayFour);
                System.out.printf("Friday: %.2f\n", resortTwoDayFive);
                System.out.printf("Saturday: %.2f\n", resortTwoDaySix);
                System.out.printf("Sunday: %.2f\n", resortTwoDaySeven);

                System.out.printf("Total Accumulation: %.2f\n", totalAccumulation);
                System.out.printf(resortOne + " Total Accumulation: %.2f\n", resortOneTotal);
                System.out.printf(resortTwo + " Total Accumulation: %.2f\n", resortTwoTotal);
                System.out.printf(resortOne + " Average Accumulation: %.2f\n", resortOneAverage);
                System.out.printf(resortTwo + " Average Accumulation: %.2f\n", resortTwoAverage);

                if (resortOneCount == 7) {
                    System.out.printf("%s %s %s!\n", resortOne, snowier, resortTwo);
                    System.out.printf("%s %s\n", resortOne, congratulations);
                } else if (resortTwoCount == 7) {
                    System.out.printf("%s %s %s!\n", resortTwo, snowier, resortOne);
                    System.out.printf("%s %s\n", resortTwo, congratulations);
                } else if (resortOneCount > resortTwoCount) {
                    System.out.printf("%s %s %s!\n", resortOne, snowier, resortTwo);
                } else if (resortOneCount < resortTwoCount) {
                    System.out.printf("%s %s %s!\n", resortTwo, snowier, resortOne);
                }
                break;
            case 2:
                System.out.printf("Total Accumulation: %.2f\n", totalAccumulation);
                System.out.printf(resortOne + " Total Accumulation: %.2f\n", resortOneTotal);
                System.out.printf(resortTwo + " Total Accumulation: %.2f\n", resortTwoTotal);
                System.out.printf(resortOne + " Average Accumulation: %.2f\n", resortOneAverage);
                System.out.printf(resortTwo + " Average Accumulation: %.2f\n", resortTwoAverage);
            
                if (resortOneCount == 7) {
                    System.out.printf("%s %s %s!\n", resortOne, snowier, resortTwo);
                    System.out.printf("%s %s\n", resortOne, congratulations);
                } else if (resortTwoCount == 7) {
                    System.out.printf("%s %s %s!\n", resortTwo, snowier, resortOne);
                    System.out.printf("%s %s\n", resortTwo, congratulations);
                } else if (resortOneCount > resortTwoCount) {
                    System.out.printf("%s %s %s!\n", resortOne, snowier, resortTwo);
                } else if (resortOneCount < resortTwoCount) {
                    System.out.printf("%s %s %s!\n", resortTwo, snowier, resortOne);
                }
                break;
        }    
    }
}
