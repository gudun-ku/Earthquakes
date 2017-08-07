package ru.inno.earthquakes.di.settings;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.inno.earthquakes.model.settings.SettingsInteractor;
import ru.inno.earthquakes.model.settings.SettingsRepository;

/**
 * @author Artur Badretdinov (Gaket)
 *         22.07.17.
 */
@Module
@Singleton
public class SettingsModule {

    @Provides
    @Singleton
    SettingsInteractor provideInteractor(SettingsRepository repository) {
        return new SettingsInteractor(repository);
    }

    @Provides
    @Singleton
    SettingsRepository provideSettingsRepository(SharedPreferences sharedPreferences) {
        return new SettingsRepository(sharedPreferences);
    }
}
