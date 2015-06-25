package ru.kpfu.npp.lessons.tools;

/**
 * Created by Флюр on 29.11.2014.
 */
public class program {
    public static void main (String[] args)
    {
        HumansDAO humansDAO = new CSVHumansDAO();
        ByAgeSorter byAgeSorter = new ByAgeBuckedSorter();

        TaskResolver taskResolver= new TaskResolver(humansDAO, byAgeSorter);
        taskResolver.resolveTask(args[0], args[1]);
    }
}
