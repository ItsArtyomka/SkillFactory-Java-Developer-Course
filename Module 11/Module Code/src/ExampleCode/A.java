package ExampleCode;

import java.io.FileNotFoundException;
import java.io.IOException;

public class A {
    protected void f() throws IOException {
    }
}

class B extends A {
    @Override
    protected void f() throws FileNotFoundException {
    }
}