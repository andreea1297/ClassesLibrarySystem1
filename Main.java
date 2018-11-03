package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();



    }


    public static void main(String[] args) {
        launch(args);
        User1 us= new User1();
        us.setUser("andreea");
        us.setPassword("parola");
        System.out.println( us.getUser()+" "+ us.getPassword());


        Book book= new Book();
        book.setBook_name("Amintiri din copilarie");
        book.setAuthor("Creanga");
        book.setLiterary_genre("epic");
        book.setPrice(14.8);
        book.setBook_status("Disponibila");

        System.out.println("Nume carte: "+book.getBook_name()+ "; autor carte: "+book.getAuthor()+"; gen:"+book.getLiterary_genre()+"; pret: "+book.getPrice()+"; statusul cartii: "+book.getBook_status());
    }
}
