package src.mathematica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Voicelines {
    public final static String Verbose = "verbose";
    public final static String Normal = "normal";
    public final static String Silent = "silent";
    public final static String Communist = "communist";
    public static void askQuery(){
        System.out.println(
                switch (Settings.Style){
                    case Verbose -> "Enter your query, good sire. Do not forget to thank me.";
                    case Normal -> "Enter your query: ";
                    case Silent -> "";
                    case Communist -> "You do not enter Query. Query enters You.";
                    default -> "Unknown style.";
                }
        );
    }

    public static void announceTermination(){
        System.out.println(
                switch (Settings.Style){
                    case Verbose -> "Your wish is my command, Sire. I bid you farewell.";
                    case Normal -> "Terminated.";
                    case Silent -> "";
                    case Communist -> "You do not terminate Interactor. Interactor terminates You. Goodbye Comrade.";
                    default -> "Unknown style.";
                }
        );
    }

    public static void errorBadName(){
        System.out.println(
                switch (Settings.Style){
                    case Verbose -> "Error sire, you hath not specified a suitable vector nameth!";
                    case Normal -> "Error. Vector not found.";
                    case Silent -> "";
                    case Communist -> "Error. You have disappointed comrade Stalin. You have given an unreadable and capitalist message.";
                    default -> "Unknown style.";
                }
        );
    }

    public static void errorStorageType(String storingType){
        System.out.println(
                switch (Settings.Style){
                    case Verbose -> "I don't know what you are talking about, sire. You said " + storingType + " and it confused me heavily.";
                    case Normal -> "Error. Storage type \"" + storingType + "\" not supported.";
                    case Silent -> "";
                    case Communist -> "Error. You have disappointed comrade Lenin. You have done the crime of storing" + storingType + ", which is highly capitalist.";
                    default -> "Unknown style.";
                }
        );
    }

    public static void stored(String storingName){
        System.out.println(
                switch (Settings.Style){
                    case Verbose -> "Stored " + storingName + ", sire.";
                    case Normal -> "Successfully stored " + storingName + ".";
                    case Silent -> "";
                    case Communist -> "Storing completed, comrade. May every calculation bring good to the Soviets.";
                    default -> "Unknown style.";
                }
        );
    }

    public static void retrievalTypeError(String type){
        System.out.println(
                switch (Settings.Style){
                    case Verbose -> "Sorry Sire, I cannot present a vector in a " + type + " type.";
                    case Normal -> "Error: Could not recognise vector format \"" + type + "\".";
                    case Silent -> "";
                    case Communist -> "Error. You have supported Trotsky by entering" + type;
                    default -> "Unknown style.";
                }
        );
    }

    public static void thank(){
        System.out.println(
                switch (Settings.Style){
                    case Verbose -> "It is my pleasure, Sire.";
                    case Normal -> "No problem";
                    case Silent -> "";
                    case Communist -> "You are welcome, comrade. Here, have some Vodka.";
                    default -> "Unknown style.";
                }
        );
    }

    public static void listVector(){
        System.out.println(
                switch (Settings.Style){
                    case Verbose -> "Here are all your available vectors, Sire. Please enjoy your delectable selection.";
                    case Normal -> "Listing vectors...";
                    case Silent -> "";
                    case Communist -> "Listing all communist vectors: ";
                    default -> "Unknown style.";
                }
        );
    }

    public static void queryNotRecognised(){
        System.out.println(
                switch (Settings.Style){
                    case Verbose -> "Sorry, I perchance am not able to fully Digest your Query. Please perchance input another query! Tally ho!";
                    case Normal -> "Querytype not recognised.";
                    case Silent -> "";
                    case Communist -> "You have disappointed the whole of the Bolsheviks. You will now go to Gulag.";
                    default -> "Unknown style.";
                }
        );
    }

    public static void changeSetting(String setting, String newValue){
        System.out.println(
                switch (Settings.Style){
                    case Verbose -> "Changed " + setting + " to " + newValue + ", sire.";
                    case Normal -> "Changed " + setting + " to " + newValue + ".";
                    case Silent -> "";
                    case Communist -> "Мы заменили" + setting + " на " + newValue + ".";
                    default -> "Unknown style.";
                }
        );
    }

    public static void debug(){
        System.out.println(
                switch (Settings.Style){
                    case Verbose -> "Debugging for you, sire.";
                    case Normal -> "Debugging...";
                    case Silent -> "";
                    case Communist -> "Обнаружение ошибок...";
                    default -> "Unknown style.";
                }
        );
    }
}
