import org.example.impl.Observable;
import org.example.impl.Observer;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestObserver {
    @Test
    public void testObserver(){
        Observable system = new Observable();
        assertTrue(system.getWords().isEmpty());
    }

    @Test
    public void testSubscribe2Observers(){
        Observable system = new Observable();

        Observer obs1 = new Observer(1);
        Observer obs2 = new Observer(2);
        system.addObserver(obs1);
        system.addObserver(obs2);

        int numberObservers = system.getClientes().size();
        assertEquals(numberObservers, 2);
    }

    @Test
    public void testRemoveObservers(){
        Observable system = new Observable();

        Observer obs1 = new Observer(1);
        Observer obs2 = new Observer(2);
        system.addObserver(obs1);
        system.addObserver(obs2);

        system.removeObserver(obs2);

        int numberObservers = system.getClientes().size();
        assertEquals(numberObservers, 1);
    }

    @Test
    public void testNumberWords(){
        Observable system = new Observable();
        String phrase = "Teste de palavras Observer";
        String[] words = phrase.split("\\s+");

        for (String word : words) {
            system.addWord(word);
        }

        int numberWords = system.getTotalWords();
        assertEquals(numberWords, 4);
    }

    @Test
    public void testEvenWords(){
        Observable system = new Observable();
        String phrase = "Isto é uma frase de teste para verificar o padrão Observer";
        String[] words = phrase.split("\\s+");

        for (String word : words) {
            system.addWord(word);
        }

        int evenWords = system.getEvenLengthWords();
        assertEquals(evenWords, 5);
    }
}
