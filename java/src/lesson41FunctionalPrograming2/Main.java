package lesson41FunctionalPrograming2;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> text=Optional.of("Hello world");
        Optional<String> emptyText=Optional.empty();

        if(text.isPresent()){
            System.out.println(text.get());
        }else{
            System.out.println("Text is empty");
        }

        ;

        System.out.println(emptyText.orElse("Empty text is empty"));

    }
}
