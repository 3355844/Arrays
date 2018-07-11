public class PersonGandChild extends PersonChild {
    @Override
    public void say(String word) {
        System.out.println("Say Method from Grand " + word);
    }
}
