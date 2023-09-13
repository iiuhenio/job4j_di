package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartUI {

    private Store store;
    private ConsoleInput consoleInput;

    public StartUI(Store store, ConsoleInput consoleInput) {
        this.store = store;
        this.consoleInput = consoleInput;
    }

    public void add(String value) {
        store.add(value);
    }

    public void askStr(String question) {
        consoleInput.askStr(question);
    }

    public void print() {
        consoleInput.askStr("Who are you?");
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}