public class ConfigHelperSingletonMain {

    public static void main(String[] args) {
        String logTag =
                ConfigHelper.getInstance()
                        .getConfigValue("log.tag");
        String maxLength =
                ConfigHelper.getInstance()
                        .getConfigValue("log.maxLength");


        System.out.println("logTag = " + logTag);
        System.out.println("maxLength = " + maxLength);

        Player player = new Player();

        player.load();
        player.play();
        player.pause();
        player.stop();
        player.reset();
        player.play();
        player.pause();
        player.reset();
    }

}
