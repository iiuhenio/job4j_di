package ru.job4j.di;

import java.util.Scanner;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class ConsoleInput {

    private Scanner scanner = new Scanner(System.in);

    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    public static void main(String... args) {
        ConsoleInput consoleInput = new ConsoleInput();
        consoleInput.askStr("Hello?");
    }
}