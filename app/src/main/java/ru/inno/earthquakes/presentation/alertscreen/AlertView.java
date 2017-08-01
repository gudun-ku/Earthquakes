package ru.inno.earthquakes.presentation.alertscreen;

import com.arellomobile.mvp.MvpView;

import ru.inno.earthquakes.entities.EarthquakeWithDist;

/**
 * @author Artur Badretdinov (Gaket)
 *         22.07.17
 */
public interface AlertView extends MvpView{

    void showThereAreNoAlerts();

    void showEartquakeAlert(EarthquakeWithDist earthquake);

    // This method better should be in a router. It is here for simplicity now.
    void navigateToEarthquakesList();
}
