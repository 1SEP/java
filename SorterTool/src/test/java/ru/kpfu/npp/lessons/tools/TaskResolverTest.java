package ru.kpfu.npp.lessons.tools;

import org.junit.Before;
import org.junit.Test;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class TaskResolverTest {
    //список людей, полученный из файла
    private List<Human> humans;
    //отсортированный список людей
    private List <Human> sortedHumans;
   //файлы, с которыми мы якобы работаем
    private final File INPUT_FILE = new File ("test_file");
    private final File OUTPUT_FILE = new File ("test_file_2");
    //поле объекта, который будем тестировать
    private TaskResolver taskResolver;
   // компоненты, от которых зависит наш taskResolver
    private HumansDAO humansDAO;
    private ByAgeSorter byAgeSorter;
    //метод, который мокает объекты, от которых мы зависим
    // то есть мы указываем, что у этих интерфейсов в данном контексте
    // нет реализующих классов
    private void initializeMocks(){
        //mock (class T) - создает временный обект на основе интерфейса T
        //у которого мы берем классовую сущность T
        humansDAO = mock(HumansDAO.class);
        byAgeSorter = mock(ByAgeSorter.class);
    }
    private void initializeTaskResolver(){
        // создаем новый объект TaskResoler'a
        //инициализируем mpck-объектами
        taskResolver = new TaskResolver(humansDAO, byAgeSorter);
    }
    private void initializeTestData(){
        //смоделировали список людей и его отсортированную версию
        Human human1 = new HumanImpl("Petrov", 20);
        Human human2 = new HumanImpl("Sidorov",100);
        Human human3 = new HumanImpl("Dadya",4);
        Human human4 = new HumanImpl("Vasya",90);

        humans = new ArrayList<Human>();
        humans.add(human1);
        humans.add(human2);
        humans.add(human3);
        humans.add(human4);

        sortedHumans = new  ArrayList<Human>();
        sortedHumans.add(human3);
        sortedHumans.add(human1);
        sortedHumans.add(human4);
        sortedHumans.add(human2);
    }
    private void stubbingForByAgeSorter(){
        //моделируем поведение методов mock-объекта
        //когда у объекта byAgeSorter вызывается метод
        //sortByAge на параметре humans, он должен вернуть
        //отсортированный список sortedHumans
        when(byAgeSorter.sortByAge(humans)).thenReturn(sortedHumans);
    }
    private void stubbingForHumansDAO(){
        //та же самая логика как и в предыдущем методе
        when (humansDAO.getDataFromResourсe(INPUT_FILE)).thenReturn(humans);
    }
    @Before
    public void setUp() throws Exception {
        initializeMocks();
        initializeTaskResolver();
        initializeTestData();
        stubbingForHumansDAO();
        stubbingForByAgeSorter();
    }

    @Test
    public void testResolveTask() throws Exception {
        //вызываем тестируемый метод у тестуриемого объекта
        taskResolver.resolveTask("test_file", "test_file_2");

        //verify - метод, проверяющий что метод mock-объекта
        //действиетельно был вызван и вызван действительно с именно такими параметрами
        verify(humansDAO).getDataFromResourсe(INPUT_FILE);
        verify(byAgeSorter).sortByAge(humans);
        verify(humansDAO).setDataIntoResource(OUTPUT_FILE, sortedHumans);
    }
}