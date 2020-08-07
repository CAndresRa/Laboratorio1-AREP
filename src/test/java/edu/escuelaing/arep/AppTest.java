package edu.escuelaing.arep;

import static org.junit.Assert.assertTrue;
import edu.escuelaing.arep.linkedList.MyLinkedList;
import edu.escuelaing.arep.model.CalculateMeanAndDeviationService;
import org.junit.Test;
import static org.junit.Assert.fail;
import org.junit.Assert;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Author: Carlos Andrés Ramírez Torres
 * ARSW 2020 - I
 */
public class AppTest {

    @Test
    public void FileShouldBeFound() {
        try {
            String[] args = { "src/main/resources/prueba1.txt"};
            App.main(args);
            assertTrue( true );
        }
        catch (IOException e) {
            fail();
        }
    }

    @Test
    public void FileShouldNotBeFound() {
        try {
            String[] args = { "src/main/resources/prueba121.txt"};
            App.main(args);
            fail();
        }
        catch (IOException e) {
            assertTrue( true );
        }
    }

    @Test
    public void DirectoryShouldBeFound() {
        try {
            String[] args = { "src/main/resources"};
            App.main(args);
            assertTrue( true );
        }
        catch (IOException e) {
            fail();
        }
    }

    @Test
    public void DirectoryShouldNotBeFound() {
        try {
            String[] args = { "src/main/resourses"};
            App.main(args);
            fail();
        }
        catch (IOException e) {
            assertTrue( true );
        }
    }

    @Test
    public void TheMeanShouldBeCalculatedCorrectlyPrueba1() {
        try {
            File file = new File("src/main/resources/prueba1.txt");
            CalculateMeanAndDeviationService service = new CalculateMeanAndDeviationService();
            service.FileReaderInput(file);
            Double answer = service.calculateMean();
            Assert.assertEquals(550.6 , answer, 0.0 );
        }
        catch (IOException e) {
            fail();
        }
    }

    @Test
    public void TheMeanShouldBeCalculatedCorrectlyPrueba2() {
        try {
            File file = new File("src/main/resources/prueba2.txt");
            CalculateMeanAndDeviationService service = new CalculateMeanAndDeviationService();
            service.FileReaderInput(file);
            Double answer = service.calculateMean();
            Assert.assertEquals(60.32 , answer, 0.1 );
        }
        catch (IOException e) {
            fail();
        }
    }

    @Test
    public void TheMeanShouldBeCalculatedCorrectlyPrueba3() {
        try {
            File file = new File("src/main/resources/prueba3.txt");
            CalculateMeanAndDeviationService service = new CalculateMeanAndDeviationService();
            service.FileReaderInput(file);
            Double answer = service.calculateMean();
            Assert.assertEquals(638.9 , answer, 0.0 );
        }
        catch (IOException e) {
            fail();
        }
    }

    @Test
    public void TheMeanShouldBeCalculatedCorrectlyPrueba4() {
        try {
            File file = new File("src/main/resources/prueba4.txt");
            CalculateMeanAndDeviationService service = new CalculateMeanAndDeviationService();
            service.FileReaderInput(file);
            Double answer = service.calculateMean();
            Assert.assertEquals(109.0 , answer, 0.0 );
        }
        catch (IOException e) {
            fail();
        }
    }

    @Test
    public void TheMeanShouldBeCalculatedCorrectlyPrueba5() {
        try {
            File file = new File("src/main/resources/prueba5.txt");
            CalculateMeanAndDeviationService service = new CalculateMeanAndDeviationService();
            service.FileReaderInput(file);
            Double answer = service.calculateMean();
            Assert.assertEquals(134.30 , answer, 0.01 );
        }
        catch (IOException e) {
            fail();
        }
    }

    @Test
    public void TheDeviationShouldBeCalculatedCorrectlyPrueba1() {
        try {
            File file = new File("src/main/resources/prueba1.txt");
            CalculateMeanAndDeviationService service = new CalculateMeanAndDeviationService();
            service.FileReaderInput(file);
            Double answer = service.calculateStandardDeviation();
            Assert.assertEquals(572.03 , answer, 0.01 );
        }
        catch (IOException e) {
            fail();
        }
    }

    @Test
    public void TheDeviationShouldBeCalculatedCorrectlyPrueba2() {
        try {
            File file = new File("src/main/resources/prueba2.txt");
            CalculateMeanAndDeviationService service = new CalculateMeanAndDeviationService();
            service.FileReaderInput(file);
            Double answer = service.calculateStandardDeviation();
            Assert.assertEquals(62.25 , answer, 0.01 );
        }
        catch (IOException e) {
            fail();
        }
    }

    @Test
    public void TheDeviationShouldBeCalculatedCorrectlyPrueba3() {
        try {
            File file = new File("src/main/resources/prueba3.txt");
            CalculateMeanAndDeviationService service = new CalculateMeanAndDeviationService();
            service.FileReaderInput(file);
            Double answer = service.calculateStandardDeviation();
            Assert.assertEquals(625.63 , answer, 0.01 );
        }
        catch (IOException e) {
            fail();
        }
    }

    @Test
    public void TheDeviationShouldBeCalculatedCorrectlyPrueba4() {
        try {
            File file = new File("src/main/resources/prueba4.txt");
            CalculateMeanAndDeviationService service = new CalculateMeanAndDeviationService();
            service.FileReaderInput(file);
            Double answer = service.calculateStandardDeviation();
            Assert.assertEquals(167.71 , answer, 0.01 );
        }
        catch (IOException e) {
            fail();
        }
    }

    @Test
    public void TheDeviationShouldBeCalculatedCorrectlyPrueba5() {
        try {
            File file = new File("src/main/resources/prueba5.txt");
            CalculateMeanAndDeviationService service = new CalculateMeanAndDeviationService();
            service.FileReaderInput(file);
            Double answer = service.calculateStandardDeviation();
            Assert.assertEquals(181.85 , answer, 0.01 );
        }
        catch (IOException e) {
            fail();
        }
    }

    @Test
    public void ElementsShouldBeAddedToTheLinkedList(){
        List<String> strings = new MyLinkedList<>();
        int initialSize = strings.size();
        strings.add("test");
        int finalSize = strings.size();
        Assert.assertEquals(finalSize , initialSize + 1 );
    }

    @Test
    public void ElementsShouldBeRemoveToTheLinkedList(){
        List<String> strings = new MyLinkedList<>();
        strings.add("test");
        strings.add("is");
        strings.add("this");
        int initialSize = strings.size();
        strings.remove(1);
        int finalSize = 0;
        for(String s: strings){
            if(!s.equals(null)){
                finalSize++;
            }
        }
        Assert.assertEquals(finalSize , initialSize - 1 );
    }

}