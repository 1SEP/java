package ru.kpfu.npp.lessons.tools;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Флюр on 29.11.2014.
 */
public class CSVHumansDAO implements HumansDAO {
    private  Human getHumanFromString(String humanString)
    {
        Splitter splitter = Splitter.on(",");
        Iterable <String> parsedRecord = splitter.split(humanString);
        List<String> asList = Lists.newArrayList(parsedRecord);
        //положили в name имя из распарсенной строки
        String name = asList.get(0);
        // положили в age возраст из распарсенной строки
        //предварительно сконвертировав из String в int
        int age = Integer.parseInt(asList.get(1));
        //создали объект текущий человек
        //и проинициализировали считанными данными
        return new HumanImpl(name, age);
    }
    @Override
    public List<Human> getDataFromResourсe(File input)
    {
        try
        {
            //привязали класс Scanner к файлу, чтобы читать оттуда данные
            Scanner scanner = new Scanner(input);
            //создали результирующий список людей
            List <Human> humans = new LinkedList<Human>();
            //пока в файле есть данные
            while(scanner.hasNext())
            {
                //счиатли строку из файла
                String record = scanner.nextLine();
                //разбили строку знаком запятой
                Human currentHuman = getHumanFromString(record);
                humans.add(currentHuman);
            }
            return humans;
        } catch (FileNotFoundException e)
        {
            System.err.print("Файл не найден");
            System.exit(1);
        }
        return null;
    }

    @Override
    public void setDataIntoResource(File output, List<Human> humans)
    {

    }
}
