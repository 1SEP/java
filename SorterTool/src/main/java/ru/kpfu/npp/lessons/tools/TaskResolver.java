package ru.kpfu.npp.lessons.tools;

import java.io.File;
import java.util.List;

/**
 * Created by Флюр on 29.11.2014.
 */
public class TaskResolver
{
    //интрефейс, обеспечивающий взаимодействие с ресурсами
    private HumansDAO humansDAO;

    //интерфейс, описывающий алгоритм сортировки
    private ByAgeSorter byAgeSorter;

    public TaskResolver(HumansDAO humansDAO, ru.kpfu.npp.lessons.tools.ByAgeSorter byAgeSorter) {
        this.humansDAO = humansDAO;
        this.byAgeSorter = byAgeSorter;
    }

    /**
     * Мметод, который считывает данные из входного файла и записывает в выходной
     * @param fileNameInput имя выходного файла
     * @param fileNameOutput имя выходного файла
     */
    public void resolveTask(String fileNameInput, String fileNameOutput)
    {
        //связываем переменную fileInput с файлом с менем fileNameInput
        File fileInput = new File (fileNameInput);

        //связываем переменную fileOutput с файлом с менем fileNameOutput
        File fileOutput = new File (fileNameOutput);

        //в humans засунем данные из файла fileInput
        List<Human> humans =humansDAO.getDataFromResourсe(fileInput);

        //сортируем хьюманов
        List <Human> sortedHumans = byAgeSorter.sortByAge(humans);

        //записывает их в выходной файл
        humansDAO.setDataIntoResource(fileOutput, sortedHumans);
    }
}
