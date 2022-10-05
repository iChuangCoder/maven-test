package maven;


import org.junit.Assert;
import org.junit.Test;
import xyz.ichuang.maven.Consumer;

public class TestConsumer {

    @Test
    public void t1() {
        Consumer consumer = new Consumer();
        int i = consumer.method_one();
        Assert.assertEquals(i,1);
        System.out.println("Junit Consumer test ...");
    }

}
