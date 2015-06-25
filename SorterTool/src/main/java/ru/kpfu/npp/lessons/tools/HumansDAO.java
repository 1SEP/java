package ru.kpfu.npp.lessons.tools;

import java.io.File;
import java.util.List;
/**
 * Created by Флюр on 29.11.2014.
 */
//есть входные данные с большиим количеством фамилий и возрастов
// необходимо сортировать данные по возрасту
    //для этого создадим интерфейс для чтения различных данных по паттерну DAO
    //
public interface HumansDAO {
    /**
     * Получает данные о людях из файла
     * @param input входной файл с данными
     * @return список людей с формированной на основе данных файла
     */
    List <Human> getDataFromResourсe(File input);
    /**
     * Записывает данные в файл
     * @param output файл, в который нужно записать данные
     * @param humans список, который нужно записать в файл
     */
    void setDataIntoResource(File output , List <Human> humans);
}
