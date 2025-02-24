package NestedClass;

public class NestedClass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        System.out.println(outer.x + inner.y);
        //
        OuterClass2.InnerClass inner2 = new OuterClass2.InnerClass();
        System.out.println("Static " + inner2.y);
        //
        AccessOuter accessOuter = new AccessOuter();
        AccessOuter.InnerClass accessInner = accessOuter.new InnerClass();
        System.out.println(accessInner.innerClassMethod());
    }
}
