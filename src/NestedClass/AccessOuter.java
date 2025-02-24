package NestedClass;

public class AccessOuter {
    String outerVar = "This is outer string";

    class InnerClass {
        public String innerClassMethod() {
            return outerVar;
        }
    }
}
