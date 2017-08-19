package ua.logika.myapplication;

import org.osmdroid.util.GeoPoint;

/**
 * Created by дом on 19.08.2017.
 */

public class Marker {
    private String title;
    private String snippet;
    private GeoPoint geoPoint;
    private String callsign;

    public Marker(String title, String snippet, GeoPoint geoPoint, String callsign) {
        this.title = title;
        this.snippet = snippet;
        this.geoPoint = geoPoint;
        this.callsign = callsign;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public GeoPoint getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(GeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }
}
