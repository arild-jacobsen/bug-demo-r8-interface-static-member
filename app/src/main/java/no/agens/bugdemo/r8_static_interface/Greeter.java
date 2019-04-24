package no.agens.bugdemo.r8_static_interface;

public interface Greeter {
    String greeting();

    Greeter DUMMY = new Greeter() {
        @Override
        public String greeting() {
            return "Hello R8!";
        }
    };
}
