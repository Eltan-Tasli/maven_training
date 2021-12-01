import static org.junit.jupiter.api.Assertions.*;

import fr.lernejo.Sample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SampleTest {

    @Test
    void op() {
        Assertions.assertEquals(8, new Sample().op(Sample.Operation.ADD, 6, 2));
        assertEquals(4, new Sample().op(Sample.Operation.MULT, 2, 2));
    }

    @Test
    void fact() {
        assertEquals(6, new Sample().fact(3));
        assertThrows(IllegalArgumentException.class,() -> new Sample().fact(-8));

    }

}
