package no.kristiania.minesweeper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MineFieldTest {
    @Test
        void itShowEmptyMinefield(){
            assertArrayEquals(new String[] {"000","000"},
                    displayMinefield(new String[] {"...","..."}));
    }

    private Object[] displayMinefield(String[] strings) {
        return new String[0];
    }

}
