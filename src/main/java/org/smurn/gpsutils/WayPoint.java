/*
 * Copyright 2011 Stefan C. Mueller.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.smurn.gpsutils;

/**
 * Represents a location in the world.
 * <p>The only properties that are ensured to be set are {@link #LATITUDE} and
 * {@link #LONGITUDE}.</p>
 */
public final class WayPoint extends Attributable {

    /** WGS84 logitude in degrees [{@code Double}]. */
    public static final String LATITUDE = "org.smurn.gpsutils.latitude";

    /** WGS84 latitude in degrees [{@code Double}]. */
    public static final String LONGITUDE = "org.smurn.gpsutils.longitude";

    /** Elevation above geoid (mean see level) of the point in meters 
     * [{@code Double}].*/
    public static final String GEOID_ELEVATION =
            "org.smurn.gpsutils.geoidElevation";

    /** Elevation above WGS84 ellipsoid of the point in meters 
     * [{@code Double}]. */
    public static final String ELLIPSOID_ELEVATION =
            "org.smurn.gpsutils.ellipsoidElevation";

    /** Moment in which this point was created or modified 
     * [{@link java.util.Date}]. */
    public static final String DATETIME = "org.smurn.gpsutils.datetime";

    /** Name of this point [{@code String}]. */
    public static final String NAME = "org.smurn.gpsutils.name";

    /** Commentary [{@code String}]. */
    public static final String COMMENT = "org.smurn.gpsutils.comment";

    /** Description with additional information about this point 
     * [{@code String}]. */
    public static final String DESCRIPTION = "org.smurn.gpsutils.description";

    /** Source of the data [{@code String}]. */
    public static final String SOURCE = "org.smurn.gpsutils.source";

    /** Link to additional information [{@code Link}]. */
    public static final String LINK = "org.smurn.gpsutils.link";

    /** Name of the symbol the GPS displays [{@code String}]. */
    public static final String SYMBOL = "org.smurn.gpsutils.symbol";

    /** Type of this point [{@code String}]. */
    public static final String TYPE = "org.smurn.gpsutils.type";

    /** Type of the fix [{@link FixType}]. */
    public static final String FIX = "org.smurn.gpsutils.fix";

    /** Number of satelites used for this fix [{@code Integer}]. */
    public static final String SATELITES = "org.smurn.gpsutils.satelites";

    /** Horizonal dilution of precision [{@code Double}]. */
    public static final String HDOP = "org.smurn.gpsutils.hdop";

    /** Vertical dilution of precision [{@code Double}]. */
    public static final String VDOP = "org.smurn.gpsutils.vdop";

    /** Position dilution of precision [{@code Double}]. */
    public static final String PDOP = "org.smurn.gpsutils.pdop";

    /** Number of seconds since the last DGPS update [{@code Double}]. */
    public static final String DPGS_AGE = "org.smurn.gpsutils.dpgsAge";

    /** ID of the used DPGS station [{@code Integer}]. */
    public static final String DPGS_ID = "org.smurn.gpsutils.dpgsId";

    /**
     * Creates an instance.
     * @param latitude WGS84 latitude in degrees.
     * @param longitude WGS84 longitude in degrees.
     */
    public WayPoint(final double latitude, final double longitude) {
        set(LATITUDE, latitude);
        set(LONGITUDE, longitude);
    }

    /**
     * Gets the WGS84 latitude in degrees.
     * @return WGS84 latitude in degrees.
     */
    public double getLatitude() {
        return (Double) get(LATITUDE);
    }

    /**
     * Sets the WGS84 latitude in degrees.
     * @param latitude WGS84 latitude in degrees.
     */
    public void setLatitude(final double latitude) {
        set(LATITUDE, latitude);
    }

    /**
     * Gets the WGS84 longitude in degrees.
     * @return WGS84 longitude in degrees.
     */
    public double getLongitude() {
        return (Double) get(LONGITUDE);
    }

    /**
     * Sets the WGS84 longitude in degrees.
     * @param longitude WGS84 longitude in degrees.
     */
    public void setLongitude(final double longitude) {
        set(LONGITUDE, longitude);
    }
}
