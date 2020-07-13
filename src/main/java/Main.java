import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import somepackage.Other;
import somepackage.Some;
import somethinggreen.Contract;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *  класс main
 *  создан для выполнения домашнего задания
 *  цель задания: вывести как можно больше текста из классов программы
 * @author BadikovDmitriy
 */

public class Main {
    public static void main(String[] args) {
        Some some1 = new Some("Секретик");
        System.out.println(some1.getSecret());
        System.out.println(some1.noMoreSecrets);

        System.out.println("-----------------------");

        some1.setNoMoreSecrets("Новый секрет");
        System.out.println(some1.noMoreSecrets);
        System.out.println(some1.getNoMoreSecrets());

        System.out.println("-----------------------");

        some1.setNoMoreSecrets(1000000000);
        System.out.println(some1.getNoMoreSecrets());

        System.out.println("-----------------------");

        some1.soTellMeAboutInterfaces();
        System.out.println(some1.toString());

        System.out.println("-----------------------");

    }
}
