import com.jzhangdeveloper.newsapi.models.Source;

public final class SourceToNewsInfoMapper {


    private SourceToNewsInfoMapper() {

    }


    public static NewsInfo map(Source source) {

        return new NewsInfo(source.getName(), source.getDescription(), source.getUrl());
    }

}
