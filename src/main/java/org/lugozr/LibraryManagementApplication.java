package org.lugozr;

import javafx.application.Application;
import org.lugozr.service.LibraryManagementUI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the Application
 * @author Nikola Mirosavljev
 */
@SpringBootApplication
public class LibraryManagementApplication {

    public static void main(String args[]) {
        SpringApplication.run(LibraryManagementApplication.class, args);
        Application.launch(LibraryManagementUI.class);
    }
}
