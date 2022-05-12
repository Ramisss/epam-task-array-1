package epam.com.log4j;

import epam.com.log4j.reader.ReadFile;
import epam.com.log4j.service.CustomArrayService;
import epam.com.log4j.service.SortingArray;

import java.io.FileNotFoundException;
import java.util.List;

public class Runner {
//    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws  FileNotFoundException {

        int [] massive ={2,5,10,-20};
        CustomArrayService customArray =new CustomArrayService();
        SortingArray sortingArray = new SortingArray();

        ReadFile readFile = new ReadFile();
        List<Integer> list= readFile.readTxtFile("src/main/resources/data.txt");
    }

}
