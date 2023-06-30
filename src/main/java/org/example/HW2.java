package org.example;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class HW2 {
    static File logFile = null;
    static FileWriter fileWriter = null;
    static FileReader fileReader = null;
    public static void main(String[] args) {

        Map<String, String> params1 = new HashMap<String,String>();
        params1.put("name","Ivanov");
        params1.put("country","Russia");
        params1.put("city","Moscow");
        params1.put("age",null);
        System.out.println(match(params1));

        try {
            logFile = new File("log1.txt");
            fileWriter = new FileWriter(logFile);

            int[] sortArr = {89, 54, 14, 19, 21, 67};
            bubbleSort(sortArr);
            for(int i = 0; i < sortArr.length; i++){
                System.out.print(sortArr[i] + "\n");
                fileWriter.write( "Результат сортировки:" + sortArr[i] + "\n");
            }
            fileWriter.close();
            fileReader = new FileReader(logFile);

            StringBuilder stringBuilder = new StringBuilder();
            char[] buf = new char[256];
            int c;

            while ((c = fileReader.read(buf)) > 0){
                for (int i = 0; i < c; i++) {
                    stringBuilder.append(buf[i]);
                    System.out.print(buf[i]);
                }
            }
            fileReader.close();


        }  catch (Exception e) {

        }

        try { logFile = new File("log.txt");
              fileWriter = new FileWriter(logFile);
               for (int i = 1; i < 10; i++){
                   fileWriter.write("Результат выполнения №: " + i + '\n');
               }

            fileWriter.close();

            fileReader = new FileReader(logFile);

            StringBuilder stringBuilder = new StringBuilder();
            char[] buf = new char[256];
            int c;

            while ((c = fileReader.read(buf)) > 0){
                for (int i = 0; i < c; i++) {
                    stringBuilder.append(buf[i]);
                    System.out.print(buf[i]);
                }
            }
            fileReader.close();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            double number1 = Double.parseDouble(scanner.nextLine());

            System.out.println("Выберите операцию: +,  -,  /,  *");

            String operation = scanner.nextLine();

            System.out.println("Введите второе число: ");
            double number2 = Double.parseDouble(scanner.nextLine());

            switch (operation) {
                case "+": {
                    System.out.println( " = " + (plus(number1, number2)));
                    break;
                }
                case "-": {
                    System.out.println( " = " + (minus(number1, number2)));
                    break;
                }
                case "*": {
                    System.out.println(" = " + (multiply(number1, number2)));
                    break;
                }
                case "/": {
                    System.out.println(" = " + (division(number1, number2)));
                    break;
                }
                default: System.out.println("Неверный ввод");
                    break;
            }

        } catch (Exception e) {
        }

    }static double plus(double a, double b){
        try {fileWriter = new FileWriter(logFile);
            fileWriter.write( "Выполнено сложение чисел: " + a  + " + " + b);
            fileWriter.close();
            fileReader = new FileReader(logFile);
            StringBuilder stringBuilder = new StringBuilder();
            char[] buf = new char[256];
            int c;
            while ((c= fileReader.read(buf)) > 0){
                for (int i = 0; i < c; i++) {
                    stringBuilder.append(buf[i]);
                    System.out.print(buf[i]);
                }
            }fileReader.close();

        }catch (Exception ex){
        }
        return a + b;
    }
    static double minus( double a, double b){
        try {fileWriter = new FileWriter(logFile);
            fileWriter.write("Выполнено вычитание чисел: " + a + " - " + b);
            fileWriter.close();
            fileReader = new FileReader(logFile);

            StringBuilder stringBuilder = new StringBuilder();
            char[] buf = new char[256];
            int c;
            while ((c = fileReader.read(buf))>0) {
                for (int i = 0; i < c; i ++ ){
                    stringBuilder.append(buf[i]);
                    System.out.print(buf[i]);
                }
            }fileReader.close();
        } catch (Exception ex){
        }
        return a - b;
    }
    static double multiply( double a, double b){
        try {logFile = new File("log3.txt");
            fileWriter = new FileWriter(logFile);
            fileWriter.write("Выполнено умножение чисел: " + a + " * " + b);
            fileWriter.close();
            fileReader = new FileReader(logFile);

            StringBuilder stringBuilder = new StringBuilder();
            char[] buf = new char[256];
            int c;
            while ((c = fileReader.read(buf))>0) {
                for (int i = 0; i < c; i ++ ){
                    stringBuilder.append(buf[i]);
                    System.out.print(buf[i]);
                }
            }fileReader.close();
        } catch (Exception ex){
        }
        return a * b;
    }
    static double division( double a, double b){
        try {logFile = new File("log2.txt");
            fileWriter = new FileWriter(logFile);
            fileWriter.write("Выполнено деление чисел: " + a + " / " + b);
            fileWriter.close();
            fileReader = new FileReader(logFile);

            StringBuilder stringBuilder = new StringBuilder();
            char[] buf = new char[256];
            int c;
            while ((c = fileReader.read(buf)) > 0){
                for (int i = 0; i < c; i++) {
                    stringBuilder.append(buf[i]);
                    System.out.print(buf[i]);
                }
            }
            fileReader.close();
        } catch (Exception ex){}

        return a / b;
    }
    public static void bubbleSort(int[] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int temp = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = temp;
                }
            }
        }
    }

        public static String match(Map<String, String> params)
        {
            StringBuilder str = new StringBuilder();
            for (Map.Entry<String,String> pair : params.entrySet())
            {
                if (pair.getValue() != null)
                {
                    str.append( " ' " + pair.getKey() + "' = '" + pair.getValue() + " ' ");
                }
            }
            return str.toString();
        }

    }

