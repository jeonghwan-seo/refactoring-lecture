package delgate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionDelegateEx {
    public int something(){
        return func() * func();
    }
    public int func(){
        int result = 0 ;
        for(int num = 1 ; num <= 100; ++num) {
            result += num;
        }
        return result;
    }

    @Test
    public void test_func(){
        FunctionDelegateEx instance = new FunctionDelegateEx();
        int ret = instance.func();
        assertEquals(ret, 5050);
    }

    @Test
    public void test_something(){
        FunctionDelegateEx instance = new FunctionDelegateEx();
        int ret = instance.something();
        assertEquals(ret, 5050 * 5050);
    }

}
