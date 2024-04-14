package org.example.app.controller;

import org.example.app.service.UserService;
import org.example.app.view.*;

public class AppController {

    public void runApp(){

        AppView view = new AppView();
        UserService service = new UserService();

        while(true){

            int option = view.getMenu();
            switch (option){
                case 1 -> {
                    CreateUserView viewCreate = new CreateUserView();
                    viewCreate.getOutput(service.createUser(viewCreate.getData()));
                }
                case 2 -> {
                    ReadUserView viewRead = new ReadUserView();
                    viewRead.getOutput(service.readUser());
                }
                case 3 -> {
                    UpdateUserView viewUpdate = new UpdateUserView();
                    viewUpdate.getOutput(service.updateUser(viewUpdate.getData()));
                }
                case 4 -> {
                    DeleteUserView viewDelete = new DeleteUserView();
                    viewDelete.getOutput(service.deleteUser(viewDelete.getData()));
                }
                case 5 -> {
                    ReadByIdView viewId = new ReadByIdView();
                    viewId.getOutput(service.readByIdUser(viewId.getData()));
                }
                case 0 -> {
                    view.getOutput("App Closed.");
                    System.exit(0);
                }
                default -> view.getOutput("Incorrect value. Try again.");
            }
        }
    }
}
