package de.qcademy.calculator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Scanner objekt erstelle und im Konstruktor das Objekt System.in eingeben.
        Scanner scanner = new Scanner(System.in);

        Pattern plusOperator = Pattern.compile("\\s*(\\d+)\\s*\\+\\s*(\\d+)|\\s*\\+\\s*(\\d+)|\\s*(\\d+)");
        Pattern subtraktionsOperator = Pattern.compile("\\s*(\\d+)\\s*\\-\\s*(\\d+)|\\s*\\-\\s*(\\d+)");
        Pattern multiplikationsOperator = Pattern.compile("\\s*(\\d+)\\s*\\*\\s*(\\d+)");
        Pattern divisionsOperator = Pattern.compile("\\s*(\\d+)\\s*\\/\\s*(\\d+)");
        Pattern moduloOperator = Pattern.compile("\\s*(\\d+)\\s*\\%\\s*(\\d+)");
        Pattern quitPattern = Pattern.compile("^\\s*:q\\s*$");

        boolean calculatorStopped = false;

        while (!calculatorStopped) {
            System.out.println("Gebe eine Rechnung ein: ");
            String input = scanner.nextLine();
            Matcher plusOpMatcher = plusOperator.matcher(input);
            Matcher subtrMatcher = subtraktionsOperator.matcher(input);
           Matcher mulMatcher = multiplikationsOperator.matcher(input);
           Matcher diMatcher = divisionsOperator.matcher(input);
            Matcher modMatcher = moduloOperator.matcher(input);
            Matcher quitOpMatcher = quitPattern.matcher(input);
            // prüfe Addition
            if (plusOpMatcher.matches()) {
                System.out.println("plusoperator erfolgreich erkannt");
                if (plusOpMatcher.group(4) != null) {
                    double result = Double.parseDouble(plusOpMatcher.group(4));
                    System.out.println(input + " = " + result);
                } else if (plusOpMatcher.group(3) != null) {
                    double result = Double.parseDouble(plusOpMatcher.group(3));
                    System.out.println(input + " = " + result);
                } else {
                    double firstOperand = Double.parseDouble(plusOpMatcher.group(1));
                    double secondOperand = Double.parseDouble(plusOpMatcher.group(2));
                    double result = firstOperand + secondOperand;
                    System.out.println(input + " = " + result);
                }
                // prüfe Substraktion
            } else if (subtrMatcher.matches()) {
                System.out.println("Substraktionsoperator erfolgreich erkannt");

                if (subtrMatcher.group(3) != null) {
                    double result = Double.parseDouble(subtrMatcher.group(3));
                    System.out.println(input + " = " + result);
                } else {
                    double firstOperand = Double.parseDouble(subtrMatcher.group(1));
                    double secondOperand = Double.parseDouble(subtrMatcher.group(2));
                    double result = firstOperand - secondOperand;
                    System.out.println(input + " = " + result);
                }
            }
            // prüfe Multiplikation
            else if (mulMatcher.matches()) {
            System.out.println("Multiplikationsoperator erfolgreich erkannt");
                double firstOperand = Double.parseDouble(mulMatcher.group(1));
                double secondOperand = Double.parseDouble(mulMatcher.group(2));
                double result = firstOperand * secondOperand;
                System.out.println(input + " = " + result);
            }
            // prüfe Division
            else if (diMatcher.matches()) {
                System.out.println("Divisionsoperator erfolgreich erkannt");
                double firstOperand = Double.parseDouble(diMatcher.group(1));
                double secondOperand = Double.parseDouble(diMatcher.group(2));
                double result = firstOperand / secondOperand;
                System.out.println(input + " = " + result);
            }
            // prüfe Modulo
            else if (modMatcher.matches()) {
                System.out.println("Modulosoperator erfolgreich erkannt");
                double firstOperand = Double.parseDouble(modMatcher.group(1));
                double secondOperand = Double.parseDouble(modMatcher.group(2));
                double result = firstOperand % secondOperand;
                System.out.println(input + " = " + result);
            }
        // Taschenrechner stoppen durch die Eingabe von :q und die variable calculatorStopped auf true setzen
        else if (quitOpMatcher.matches()) {
            System.out.println("Der Taschenrechner wird gestoppt ...");
            calculatorStopped = true;
        }
        // Wenn etwas komplett anderes eingegeben wird, was ungültig ist
        else {
            System.err.println("Operation " + input + " nicht erkannt");
        }
    }





    }
}