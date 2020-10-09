import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.heweather.api.HeWeatherInitialize;
import com.heweather.api.response.weather.HeWeatherWeatherDailyResponse;
import com.heweather.api.service.*;
import com.heweather.api.service.impl.*;
import org.junit.Test;

/**
 * @author djc
 * @date 2020-09-06 16:30:55
 */
public class ApiTest {

    private final HeWeatherAirService airService = new HeWeatherAirServiceImpl();
    private final HeWeatherWeatherService weatherService = new HeWeatherWeatherServiceImpl();
    private final HeWeatherMinutelyService minutelyService = new HeWeatherMinutelyServiceImpl();
    private final HeWeatherWarningService warningService = new HeWeatherWarningServiceImpl();
    private final HeWeatherLifestyleService lifestyleService = new HeWeatherLifestyleServiceImpl();
    private final HeWeatherPoiService poiService = new HeWeatherPoiServiceImpl();
    private final HeWeatherHistoricalService historicalService = new HeWeatherHistoricalServiceImpl();
    private final HeWeatherAstronomyService astronomyService = new HeWeatherAstronomyServiceImpl();
    private final HeWeatherLocationService locationService = new HeWeatherLocationServiceImpl();

    static {
        HeWeatherInitialize.init("HE2009021233331300", "3cd2a1ee253a43aa9cc552aaafcb69fb");
    }

    @Test
    public void test() throws JsonProcessingException {
        HeWeatherWeatherDailyResponse weather3d = this.weatherService.getWeather3d("101010100");
        if (weather3d.getCode().isOk()) {
            System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(weather3d));
        }
    }
}
