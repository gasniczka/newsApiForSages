import com.jzhangdeveloper.newsapi.models.Sources;
import com.jzhangdeveloper.newsapi.net.NewsAPI;
import com.jzhangdeveloper.newsapi.net.NewsAPIClient;
import com.jzhangdeveloper.newsapi.net.NewsAPIResponse;
import com.jzhangdeveloper.newsapi.params.SourcesParams;

import java.io.IOException;
import java.util.Map;

public final class NewsReader {

    private static final String NEWS_API_KEY = "b75ac63cb6ec4c1ebd739b4ad8950d81";


    private NewsReader() {

    }

    private static NewsAPIResponse getNews() {

        NewsAPIClient client = NewsAPI.newClientBuilder()
                .setApiKey(NEWS_API_KEY)
                .build();

        Map<String, String> sourcesParams = SourcesParams.newBuilder()
                .setCountry("us") // nie ma nic dla pl
                .setCategory("business")
                .build();

        NewsAPIResponse response = null;
        try {
            response = client.getSources(sourcesParams);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return response;
    }


    public static Sources readNews() {

        return getNews().getBody();
    }

//    public static List<String> readHeaders() {
//
//        return getNews().getHeaders().values().stream()
//                .flatMap(List::stream)
//                .collect(Collectors.toList());
//    }


}
