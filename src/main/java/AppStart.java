public class AppStart {

    public static void main(String[] args) {

        System.out.println("-- start");

        // zapis sources
        NewsReader.readNews().getSources()
                .stream()
                .map(SourceToNewsInfoMapper::map)
                .peek(newsInfo -> IOUtils.saveText(newsInfo.getName(), newsInfo.getInfo()))
                .forEach(newsInfo -> IOUtils.saveFile(newsInfo.getName(), newsInfo));

         // header info
//        NewsReader.readHeaders().stream()
//                .forEach(System.out::println);


        System.out.println("-- end");

    }

}
