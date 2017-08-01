package ru.inno.earthquakes.di.earthquakes;

import dagger.Module;
import dagger.Provides;
import ru.inno.earthquakes.model.earthquakes.EarthquakesInteractor;
import ru.inno.earthquakes.model.earthquakes.EarthquakesRepository;
import ru.inno.earthquakes.model.earthquakes.EarthquakesApiService;
import ru.inno.earthquakes.model.earthquakes.EarthquakesMapper;
import ru.inno.earthquakes.model.earthquakes.EarthquakesRepositoryImpl;

/**
 * @author Artur Badretdinov (Gaket)
 *         22.07.17.
 */
@Module
@EarthquakesScope
public class EarthquakesModule {

    @Provides
    @EarthquakesScope
    EarthquakesInteractor provideInteractor(EarthquakesRepository repository){
        return new EarthquakesInteractor(repository);
    }

    @Provides
    @EarthquakesScope
    EarthquakesRepository provideRepository(EarthquakesApiService apiService, EarthquakesMapper mapper) {
        return new EarthquakesRepositoryImpl(apiService, mapper);
    }

    @Provides
    @EarthquakesScope
    EarthquakesMapper provideMapper() {
        return new EarthquakesMapper();
    }
}
