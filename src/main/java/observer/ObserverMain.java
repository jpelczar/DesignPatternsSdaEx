package observer;

public class ObserverMain {

    public static void main(String[] args) {
        Button button = new Button();
        OnClickListener listener = new ClickListener();

        button.setListener(listener);
        button.click();
        System.out.println();
        button.click();
        System.out.println();

//        button.removeListener(listener);

        OnClickListener listener2 = () -> {
            System.out.println("Click 2");
        };

        button.setListener(() -> {
            System.out.println("Click 2");
        });

        button.removeListener(() -> {
            System.out.println("Click 2");
        });

        button.click();
        System.out.println();


        button.setListener(() -> {
            System.out.println("Click 3");
        });

        button.click();
        System.out.println();
    }

}
